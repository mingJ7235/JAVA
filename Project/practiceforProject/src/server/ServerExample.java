package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application {
	ExecutorService executorService; //������Ǯ�� �����ϱ����� ����
	ServerSocket serverSocket; //Ŭ���̾�Ʈ �����û �������� 
	List<Client> connections = new Vector<Client>(); //���͸� �������� �����嵿��ȭ������
	
	void startServer() {
		//���� ���� �ڵ�
		executorService = Executors.newFixedThreadPool(
					Runtime.getRuntime().availableProcessors()
				); //�������� �ִ� ���హ��		//����� �� pc�� cpu�� �����ϴ� �ھ��� ����ŭ �����ϴ� ����
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		} catch (Exception e) {
			if (!serverSocket.isClosed()) {
				stopServer(); //���� ���� �޼ҵ�
			}
			return; //���� ������ return  
		}
		
		Runnable runnable = new Runnable() { //���� ���� ��ü
			@Override
			public void run() {
				//���� ������ ���� �ڵ�. ������� �۾�
				Platform.runLater( () -> {	//ui ���� ��û�� �ϴ� �ڵ� //ui������ ���ؼ� �̰� ����ϰ�,
					// ui ������ �ϴ� �ڵ带 ���⿡ ���� ���̴�. ���Ի�������. ui start��ư�� stop���� �����ϴ� ���� 
					displayText("[���� ����]"); //TestArea�� ���� ���ִ� �޼ҵ� ȣ��. �Ű����� �����
					btnStartStop.setText("stop"); //��ư�� ���ڸ� �ٲ�
				});
				
				while (true) {
					try {
						Socket socket = serverSocket.accept();//Ŭ���̾�Ʈ�� ������ ������
						String message = "[���� ���� : "  + socket.getRemoteSocketAddress() +": " +
														Thread.currentThread().getName() + "]"; 
																	//Ŭ��ip,��Ʈ������ ���� ������Ǯ�� ��罺���� �̸� �����
						Platform.runLater(()->
							displayText(message)
						);
						
						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater(()->
							displayText("[���� ���� : " + connections.size() + "]")
						);
					} catch (IOException e) {
						if(!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					} 
				}
			}
		};
		executorService.submit(runnable); //������Ǯ�� �۾��ϵ��� �ϴ� ����. 
	}
	void stopServer() {
		//���� ���� �ڵ� //����� ��� client�� ������ ���� ����
			try {
				Iterator<Client> iterator = connections.iterator();
				while (iterator.hasNext()) {
					Client client = iterator.next();
					client.socket.close();
					iterator.remove(); //��� Ŭ���̾�Ʈ ����
				}
				if (serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
				if (executorService!= null && !executorService.isShutdown()) {
					executorService.shutdown();
				}
				Platform.runLater(() -> {
					displayText("[���� ����]");
					btnStartStop.setText("start"); //�ٽ� ��ư�� ��ŸƮ�� ����
				});
			} catch (IOException e) {}
		}	
	
	class Client {
		//������ ��� �ڵ带 ������ ����. //Ŭ���̾�Ʈ�� �����ϱ����� 
		Socket socket;
		Client (Socket socket) { //������
			this.socket = socket;
			receive ();
		}
		
		void receive () { //Ŭ���̾�Ʈ�� �����͸� �����ԵǸ� ��ż����� �̿�! 
			Runnable runnable = new Runnable() { //�۾���ü -> ������Ǯ���� �����尡 ���Ҽ��ֵ���
				@Override
				public void run() { //�۾��� ����
					//Ŭ���̾�Ʈ�� �޼����� �����Բ�
					try {
						while (true) { //Ŭ���̾��Ͱ� ���� �ż����� ��� ���� ���ֵ��� ���ѷ���
							byte [] byteArr = new byte [100];
							InputStream is = socket.getInputStream(); //Ŭ���̾�Ʈ�κ��� �� �����͸� �о���ϹǷ�
							
							int readByteCount = is.read(byteArr); 
							//���������� �����͸� �޾������, ���������� �����Ұ��, �������� �����ϰ�� read() ��blocking����
							
							if (readByteCount == -1) { //Ŭ���̾�Ʈ�� ���������� �����Ѱ�� !
								throw new IOException () ; //���������� �Ϻη� IOException �߻���Ŵ
										//�׷��� catch�� ���� �� �ֵ��� ! -> �����ϴ� �ڵ带 catch�� �־ ���ϰ� �����ϱ�����
							}
							
							String message = "[��û ó�� : " + socket.getRemoteSocketAddress() + ":"
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() ->
								displayText(message)
							); 
							String data = new String (byteArr, 0, readByteCount, "UTF-8");
							
							for (Client client : connections) {
								//�� Ŭ�� ���� �����͸� �޾Ƽ� ��� Ŭ���̾�Ʈ���� �����͸� send�ؾ��� -> ��� client����! �׷��� �ݺ����Ἥ ��������.��...�� 
								client.send(data);
							}
						}
					}catch (Exception e) { //���������� �����ϰų� ������������ �����Ѱ��
						try {
							connections.remove(Client.this); //�� Ŭ���̾�Ʈ ��ü�� ������
							String message = "Ŭ���̾�Ʈ ��� �ȵ� : " + socket.getRemoteSocketAddress() + ":"
									+ Thread.currentThread().getName() + "]";
							Platform.runLater( () ->
								displayText(message)
							);
							socket.close();
						} catch (IOException e1) {	}
					}
				}
			};
			executorService.submit(runnable); //������Ǯ�� �����带 �۾� ť�� �ִ� ����!!!
		}
		
		void send (String data) { //Ŭ���̾�Ʈ���� �޼����� ������ �޼ҵ�
			Runnable runnable = new Runnable () {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8"); //�Ű��� data���� byte�� ������
						//Ŭ���̾�Ʈ�� �������ϹǷ� output�ʿ�
						OutputStream os = socket.getOutputStream();
						os.write(byteArr);
						os.flush();
					} catch (Exception e) {
						try {
							String message = "Ŭ���̾�Ʈ ��� �ȵ� : " + socket.getRemoteSocketAddress() + ":"
									+ Thread.currentThread().getName() + "]";
							Platform.runLater( () ->
								displayText(message)
							);
							connections.remove(Client.this);
							socket.close();
						} catch (IOException e1) {}
					} 
				}
			};
			executorService.submit(runnable);
		}
	}
	
	//////////////////////////////////////////////////////
	TextArea txtDisplay;
	Button btnStartStop;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
		root.setCenter(txtDisplay);
		
		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		btnStartStop.setOnAction(e->{
			if(btnStartStop.getText().equals("start")) {
				startServer();
			} else if(btnStartStop.getText().equals("stop")){
				stopServer();
			}
		});
		root.setBottom(btnStartStop);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Server");
		primaryStage.setOnCloseRequest(event->stopServer());
		primaryStage.show();
	}
	
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}	
	
	public static void main(String[] args) {
		launch(args);
	}
}
