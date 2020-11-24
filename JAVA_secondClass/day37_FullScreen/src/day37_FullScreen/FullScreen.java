package day37_FullScreen;

import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class FullScreen extends JFrame{
	public FullScreen() {
		this("�������");
	}
	public FullScreen(String title) {
		setTitle(title);
		Container con = this.getContentPane();
		con.setBackground(Color.green);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		//���� �׷���ȯ���� �������ش�. (�ܿ�����)
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		//�׷��� ��ġ�� �������ش�. 
		//��üȭ �� �� ����. ��? �̱��� ���� -> �׷��� ���´� 1�����̴ϱ�.
		
		setUndecorated(true);
		//���� ���ҰŶ�� ����
		
		gd.setFullScreenWindow(this);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new FullScreen();
	}
}
