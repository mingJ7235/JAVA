package day36_AWT_SWING;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class WindowTest3 {
	public static void main(String[] args) {
		JFrame window = new JFrame("���� �ִ� ������");
		window.setBounds(1200, 200, 400, 300);
		
		//swings������ �����̳ʸ� �����, �ű⿡�� contentpane �� get�Ͽ��� ���⿡ ��׶��� Į�� ���ؾ��Ѵ�. 
		Container con = window.getContentPane();
		con.setBackground(Color.black);
		
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
