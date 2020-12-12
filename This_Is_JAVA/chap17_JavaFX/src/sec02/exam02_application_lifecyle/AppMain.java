package sec02.exam02_application_lifecyle;

import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	String ip;
	String port;
	
	public AppMain() {
		System.out.println(Thread.currentThread().getName() + ": AppMain() ȣ��");//�����ڸ� ȣ���ϴ� �����尡 �������� Ȯ��
		//JavaFX Application Thread  
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": init() ȣ��");//init()�� ȣ���ϴ� �����尡 �������� Ȯ��
		//init()�ȿ� UI ����, �����ϸ�ȵȴ�!
		//JavaFX Launcher ������
		Parameters params = this.getParameters();
		Map <String, String> map = params.getNamed();
		ip = map.get("ip");
		port = map.get("port");
		System.out.println("ip" + ip);
		System.out.println("port" + port);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + ": start() ȣ��");//start()�� ȣ���ϴ� �����尡 �������� Ȯ��
		primaryStage.show();
		//JavaFX Application Thread 
		//UI����, ����
		//�Ϲ������� start���� �������ؼ� ������ �ϰ� �Ѵ�. 
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": stop() ȣ��");//stop()�� ȣ���ϴ� �����尡 �������� Ȯ��
		//JavaFX Application Thread 
		
	}
	
	public static void main(String[] args) {
		launch(args); //���������� javaFx�����带 �۵���Ŵ
		
		//launch�� �����ϸ�, launch���ο��� 2���� �����尡 �����
		//JavaFX Application Thread�� ������ ȣ�� -> 
		
	}
}
