package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//main �޼ҵ�� JVM�� ������ ���ν����忡 �־ �ڵ������� �����Ѵ�.
		
		//how1 ) ������ ��� //�ٸ� Ŭ������ �������Ѵ�. 
//		Runnable beeptask = new BeepTask();
//		Thread thread = new Thread(beeptask);
		
		//how2) �͸�ü Ȱ��
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
		
		//how3) ���ٽ�
		Thread thread = new Thread ( () -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
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
