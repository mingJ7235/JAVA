package sec07.exam03_chattingProgram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClientExample extends Application {
	Socket socket;
	
	void startClient() {
		//���� ���� �ڵ�
		Thread thread = new Thread () {
			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress("localhost", 5001));//���� ��û�� ������ ������ �־ connect�޼ҵ� �Ű������� ����
					Platform.runLater( () -> {
						displayText("[����Ϸ�" + socket.getRemoteSocketAddress() + "]"); //��𿡿���Ǿ��ִ��� ������ ������
						btnConn.setText("stop"); //��ư ����
						btnSend.setDisable(false); //send��ư Ȱ��ȭ�ϱ� (�⺻������ ��Ȱ��ȭ �Ǿ��־���)
					});
				} catch (IOException e) {
					Platform.runLater( () ->displayText("[���� ��� �ȵ�]") );
					if (!socket.isClosed()) {stopClient();}
					return; //run ����
				}
				receive(); //������ ���� �޼����� �޵��� �ϴ� �޼ҵ�
			}
		};
		thread.start();
	}
	
	void stopClient() {
		try {
			Platform.runLater( () ->{
				displayText("[���� ����]");
				btnConn.setText("start");
				btnSend.setDisable(true);
			});
			
			if(socket !=null && !socket.isClosed()) {
				socket.close();
			}
		} catch (Exception e) {}
	}	
	
	void receive() {
		while (true) {
			try {
				byte [] byteArr = new byte [100];
				InputStream is = socket.getInputStream(); //�������� �޼����� �޾ƾ��ϹǷ�
				
				int readByteCount = is.read(byteArr);
				if (readByteCount == -1) { //-1�ΰ��� ������ ������
					throw new IOException(); //������ ���� �߻� -> ���� ó�� �ڵ�� �����ֵ���
				}
				//���������� �����͸� �о��� ���
				String data = new String (byteArr, 0, readByteCount, "UTF-8");
				
				Platform.runLater( () -> displayText("[�ޱ� �Ϸ�] " + data) );
			}catch (Exception e ) {
				//�������� ����ų� �������� �����ΰ��
				Platform.runLater( () -> displayText("[���� �ȵ�") );
				stopClient();
				break;
			}
		}
	}
	
	void send(String data) {
		//send�� ������ ���� ������ ������ ������ �ް� ������ �ٽ� ��� Ŭ������ ���� �׷��� Ŭ��� �װ� �ٽ� ���� �̰� �ݺ�
		
		Thread thread = new Thread() {
			public void run() {
				try {
					byte[] byteArr = data.getBytes("UTF-8");
					OutputStream os = socket.getOutputStream();
					os.write(byteArr);
					os.flush();
					Platform.runLater(() -> displayText("[������ �Ϸ�]"));
				} catch (Exception e) {
					Platform.runLater(() -> displayText("[���� ��� �ȵ�]"));
					stopClient();
				}
			}
		} ;
		thread.start();
	}
	
	//////////////////////////////////////////////////////
	TextArea txtDisplay;
	TextField txtInput;
	Button btnConn, btnSend;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
		root.setCenter(txtDisplay);
		
		BorderPane bottom = new BorderPane();
			txtInput = new TextField();
			txtInput.setPrefSize(60, 30);
			BorderPane.setMargin(txtInput, new Insets(0,1,1,1));
			
			btnConn = new Button("start");
			btnConn.setPrefSize(60, 30);
			btnConn.setOnAction(e->{
				if(btnConn.getText().equals("start")) {
					startClient();
				} else if(btnConn.getText().equals("stop")){
					stopClient();
				}
			});
			
			btnSend = new Button("send"); 
			btnSend.setPrefSize(60, 30);
			btnSend.setDisable(true);
			btnSend.setOnAction(e->send(txtInput.getText()));
			
			bottom.setCenter(txtInput);
			bottom.setLeft(btnConn);
			bottom.setRight(btnSend);
		root.setBottom(bottom);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Client");
		primaryStage.setOnCloseRequest(event->stopClient());
		primaryStage.show();
	}
	
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}	
	
	public static void main(String[] args) {
		launch(args);
	}
}
