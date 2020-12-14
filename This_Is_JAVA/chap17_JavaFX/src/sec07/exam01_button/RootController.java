package sec07.exam01_button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{
	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	@FXML private ImageView checkImageView;
	@FXML private ToggleGroup group; //�׷쿡 �̹� ������ id�� �����Ѵ�. 
	@FXML private ImageView radioImageView;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//�Ӽ������� !
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			//�׷��� ����Ƽ�� ����� �Ӽ��� ����Ǿ����� ����ǵ��� �ϴ� ����
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, 
					Toggle oldValue, Toggle newValue) {
						//newValue���� ���õ� ���� ��ư�� ����. �׷��� �̰� �޾Ƽ� �̹����� �ٲ��ָ��.
						//�ٲ� �̹��� ������ ������ͼ� ��ȯ��Ű��� ����;
						//���̾ƴ϶�, ���� ��ư�� ���ε�����(����������) �̸��� �����ϰ� �����;��Ѵ�.
				radioImageView.setImage(new Image(getClass()
						.getResource("images/" + newValue.getUserData()+".png").toString()));
										//getUserData()�� ���� �̸��� ���, �� �̸��� .png�� �ٿ��� ������ �̹��������� �������ش�. 
										//�̷��ԵǸ� newValue������ �ο��� ���������Ϳ� �ش��ϴ� �̹����� �����Եȴ�. 
				
//				Image image = new Image(getClass()
//						.getResource("images/" + newValue.getUserData() + ".png").toString());
//				radioImageView.setImage(image);
					//�̹���� image��ü�� �ϳ� ���� ���� ����. �Ȱ���
				
			}
		});
		
	}
	
	//��ư �̺�Ʈ ��Ʈ��
	public void handleBtnExitAtcion (ActionEvent e) { //�ڵ��� �Ű����� �������� ! 
		 Platform.exit();
	}
	
	public void handleChkAction (ActionEvent e) {
		// � üũ�ڽ��� �Ǿ����� Ȯ��. ��..��û �ո�����
		if(chk1.isSelected() && chk2.isSelected()) { //�Ѵ� üũ?
			checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
							//url�� ����ϹǷ� toString()������ ������Ѵ�. 
		}else if (chk1.isSelected()) { //�ϳ��� üũ?
			checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		}else if (chk2.isSelected()) { 
			checkImageView.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		}else {
			checkImageView.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		}
	}
}
