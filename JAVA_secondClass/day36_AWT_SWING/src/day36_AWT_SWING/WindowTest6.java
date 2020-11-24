package day36_AWT_SWING;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WindowTest6 extends Frame{
	//���߾ӿ� �ߵ����ϱ�
	public WindowTest6() {
		this("���� ���� ������");
	}
	public WindowTest6(String title) {
		
		setResizable(false);
		//����� ���ϼ� ���� �ϴ� ��. 
		
		setTitle(title);
		setSize(1200, 500);
		setBounds(1200, 200, 400, 300);
		Dimension dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		//dimen1 ���� ��ǻ���� ����� �ػ�
		Dimension dimen2 = getSize();
		//dimen2 ���� frame�� �ػ�
		
		//�ػ󵵸� �������ִ� �޼���
		//<����� ������� ������â ��ġ��Ű�� ��>
//		setLocation((����� �ػ�.width - ������ ũ��.width)/2, (����� �ػ�.height - ������ ũ��.height)/2);
		int x = (dimen1.width-dimen2.width)/2;
		int y = (dimen1.height-dimen2.height)/2;
		
		setLocation(x, y);
		setBackground(new Color(new Random().nextInt(16581376)));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose ();
			}
		});
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new WindowTest6("���߾�");
	}
}
