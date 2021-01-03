package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.sound.sampled.SourceDataLine;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class ServerController implements Initializable{
	
	@FXML private Label Chats_time;
	@FXML private Slider chat_slider_opacity;
	@FXML private BorderPane server_main;
	@FXML private TextArea logText;
	@FXML private Button btnServerStart;
	@FXML private TextField portField;

	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<>();
	
	public void StartServer() {
		executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		}catch (Exception e) {
			if(!serverSocket.isClosed()) {
//				stopServer();
			}
			return;
		}
		
		//���� ���� ��ü
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				Platform.runLater(() -> {
					logText.appendText("[Server Start]");
					btnServerStart.setText("stop");
				});
				
				while (true) {
					try {
						Socket socket = serverSocket.accept();
						String message = "[Connection accept : " + 
						socket.getRemoteSocketAddress() + ": " +
						Thread.currentThread().getName() + "]";
						
						Platform.runLater(() -> 
							logText.appendText(message)
							);
						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater(() -> logText.appendText(
								"[Connections' size : " + connections.size() + "]"
								));
					}catch (IOException e ) {
						if(!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
				}
			}
		};
		executorService.submit(runnable);
	}//end StartServer()
	
	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if (executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			Platform.runLater(() ->{
				logText.appendText("[Server stop]");
				btnServerStart.setText("start"); //server ��ư ����
			});
		}catch(IOException e) {}
	}
	
	
	public class Client {
		Socket socket;
		public Client (Socket socket) {
			this.socket = socket;
			receive();
		}
		
		//�޼��� �ޱ� �޼ҵ�
		void receive () {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						while(true) {
							byte[] byteArr = new byte[100];
							InputStream is = socket.getInputStream();
							
							int readByteCount = is.read(byteArr);
							
							if(readByteCount == -1) {
								throw new IOException();
							}
							
							String message = "[Request : " + socket.getRemoteSocketAddress()
								+ ":" + Thread.currentThread().getName() + "]" ;
							
							Platform.runLater(() -> 
									logText.appendText(message));
							
							String data = new String (byteArr, 0, readByteCount, "UTF-8");
							
							for (Client client : connections) {
								client.send(data);
							}
						}
					}catch (Exception e) {
						try {
							connections.remove(Client.this);
							String message = "[Client connection Error] :" +
							socket.getRemoteSocketAddress() + " : " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> 
								logText.appendText(message)
							);
							socket.close();
						}catch (IOException e1) {}
					}
				}
			};
			executorService.submit(runnable);
		}
							
							
							
							
		
		//Ŭ���̾�Ʈ���� ������ ����
		void send (String message) {
			Runnable thread = new Runnable() {
				
				@Override
				public void run() {
					try {
						byte[] arr = message.getBytes("UTF-8");
						OutputStream outputstream = socket.getOutputStream();
						outputstream.write(arr);
						outputstream.flush();
					}catch (Exception e) {
						String message = "[Client connection Error :"  + socket.getRemoteSocketAddress() + "]";
						Platform.runLater(() -> logText.appendText(message));
						connection.remove(Client.this);
						try {
							socket.close();
						}catch (IOException e1) {
						}
					}
				}
			};
			executorService.submit(thread);
		}
		
		
	}


	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Chats_time.setText(sdf.format(date));
		
		chat_slider_opacity.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, 
					Number oldValue, Number newValue) {
				server_main.setOpacity(chat_slider_opacity.getValue() /100.0);
			}
		});
		btnServerStart.setOnAction(e -> StartServer());
	}


}
