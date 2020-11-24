package day22_anonymousClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonTest extends Frame{
	
	public ButtonTest() {
		super("�͸� Ŭ���� �׽�Ʈ");
		//Frame �θ�Ŭ���� �����ڿ� ���ڿ��� ������ ��ư â�� Ÿ��Ʋ�� �ȴ�.
		Button btn = new Button("����!");
		//Button �����ڿ� ���ڿ��� ������ ��ư�� ���ڰ� ��
		add(btn);
		//�����ӿ� ��ư�� �߰��ϴ� �޼���
		setSize(500,500);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("������ ����");
				System.exit(0);
			}
		});
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println(e.getX());
				System.out.println(e.getY());
				System.out.println("��ư �������. ");
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonTest();
	}
	
	
}
