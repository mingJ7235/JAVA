package sec04.exam01_anchorpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{
	//�ڹ��ڵ�� ��� �����°� -> ���α׷��� ���̾ƿ�
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		//�� ���ٷ� ���̾ƿ��� �����̵�. �ڹ��ڵ�� �ۼ��ϴ°��� ��  ��������. 
		//xml ���� �ȿ��ִ� ������ �������� parent��� ��Ʈ �����̳ʸ� �����. ��� �ǹ���. 
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
				
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
}
