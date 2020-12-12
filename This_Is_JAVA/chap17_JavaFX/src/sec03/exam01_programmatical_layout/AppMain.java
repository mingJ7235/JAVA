package sec03.exam01_programmatical_layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{
	//�ڹ��ڵ�� ��� �����°� -> ���α׷��� ���̾ƿ�
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10)); //���� ���� ����
		hbox.setSpacing(10);	// ��Ʈ�� ���� ���� ���� ����
		
		TextField textField = new TextField();
		textField.setPrefWidth(200);
		
		Button button = new Button();
		button.setText("ȫ����");
		
		ObservableList list = hbox.getChildren();
		list.add(textField);
		list.add(button);
		
		Scene scene = new Scene(hbox);	//��Ʈ �����̳� hbox�� ��� ����
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
}
