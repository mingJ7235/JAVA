package controller;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import db_connection.KakaoDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class KakaoMain_controller implements Initializable{
	@FXML private Label Login_time;
	@FXML private Button kakaoMain_login_btn;
	@FXML private TextField KakaoMain_login_email;
	@FXML private PasswordField KakaoMain_login_password;
	@FXML private Button kakaoMain_signin_btn;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		kakaoMain_login_btn.setOnAction(e->handleBtnLogin(e));
		kakaoMain_signin_btn.setOnAction(e->handleBtnSignin(e));
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Login_time.setText(sdf.format(date));
	}
	
	public void handleBtnLogin (ActionEvent event) {
		String phoneNum = KakaoMain_login_email.getText();
		String pw = KakaoMain_login_password.getText();
		
		KakaoDAO dao = new KakaoDAO();
		int loginNum = dao.login(phoneNum, pw);//�������ӽ� ȸ����ȣ ����
		if(loginNum == -1) {
			//��ȭ��ȣ����
		}else if(loginNum == -2) {
			//��й�ȣ�ٸ�
		}else {
			//��������
			try {
				Parent login = FXMLLoader.load(getClass().getClassLoader().getResource("view/Friends.fxml"));
				Scene scene = new Scene(login);
				Stage primaryStage = (Stage) kakaoMain_login_btn.getScene().getWindow();
				primaryStage.setScene(scene);
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
//		if (phoneNum.equals("01064707235") && pw.equals("7235")) {
//		} else {
//			System.out.println("�α��ν���");
//		}		
	}
	
	public void handleBtnSignin(ActionEvent event) {
		try {
			Parent signin=FXMLLoader.load(getClass().getClassLoader().getResource("view/signin.fxml"));
			Scene scene = new Scene(signin);
			Stage primaryStage = (Stage) kakaoMain_signin_btn.getScene().getWindow();
			primaryStage.setScene(scene);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
