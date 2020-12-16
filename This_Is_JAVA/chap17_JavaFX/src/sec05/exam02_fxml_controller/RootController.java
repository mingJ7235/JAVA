package sec05.exam02_fxml_controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable{
	
	@FXML private Button btn1;
	//btn2�� FXML���� ���� ��Ʈ�ѷ��� ��������
	@FXML private Button btn3;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//��Ʈ���� �̺�Ʈ ó�� �ڵ�
		btn1.setOnAction(event -> System.out.println("��ư1 Ŭ��"));
		btn3.setOnAction(event -> handleBtn3Action(event));
	}
	public void handleBtn3Action (ActionEvent event) {
		System.out.println("��ư3 Ŭ��");
	}
	public void handleBtn2Action (ActionEvent event) {
		System.out.println("��ư2 Ŭ��");
	}
}