package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		//thread ���� ��ü�� �����ϴ¹�
		//how1 //Thread�� extends ���� Ŭ������ ��üȭ
//		Thread thread = new BeepThread();
//		thread.start();
		
		//how2 //�͸�ü�� ����¹�
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		
		thread.setName("����������");
		System.out.println(thread.getName());
		thread.start();
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
