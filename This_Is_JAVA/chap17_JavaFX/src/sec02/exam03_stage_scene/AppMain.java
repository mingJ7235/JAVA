package sec02.exam03_stage_scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		//���̺��� ���ڸ� �����ϴ� ������Ʈ��. 
		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font (50)); //��Ʈ ũ��
		
		//��ư
		Button button1 = new Button();
		button1.setText("Ȯ��");
		Button button2 = new Button();
		button2.setText("���");
		button2.setOnAction(event -> Platform.exit()); //��ư�� �̺�Ʈ�� ����. ���⼭�� �����ϵ���
		
		//�󺧰� ��ư�� VBox Ÿ���� root �����̳ʿ� �߰�
		root.getChildren().add(label);
		root.getChildren().add(button1);
		root.getChildren().add(button2);
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args); 
	}
}
