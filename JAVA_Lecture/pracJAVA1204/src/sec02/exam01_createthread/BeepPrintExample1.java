package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		//main �޼ҵ�� JVM�� ������ ���ν����忡 �־ �ڵ������� �����Ѵ�.
		
		//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//"��" �̶�� ���ڿ��� 5�� ����ϴ� �۾�
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
