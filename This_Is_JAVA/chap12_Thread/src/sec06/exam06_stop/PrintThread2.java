package sec06.exam06_stop;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
//		try {
//			while (true) {
//				System.out.println("���� ��");
//				Thread.sleep(1); // �Ϻη� interrupt�� ���� ��������. �̰� �׸� ��������� �ƴ�
//			}
//		}catch (InterruptedException e) {
//			System.out.println("���ܹ߻�");
//		}
		
		while (true) {
			System.out.println("������");
			if (Thread.interrupted()) {
//			if (isInterrupted()) { // �̰� ����ص���. 
				//interrupted() �� ȣ���� �ȴٸ� break;�ض�! ��� ����.
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ���� ");
	}
}
