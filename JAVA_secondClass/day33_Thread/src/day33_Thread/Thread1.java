package day33_Thread;
/*
 * ��Ƽ ������
 * 
 * Thread Ŭ���� ���
 * Runnable �������̽� ���� (able�� ������ interface��) ���� Runnable�� ���� implements�� �ؼ� ����. 
 * 
 * 
 */
public class Thread1 extends Thread{
	String data;
	public Thread1(String data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		//Thread�� �ٽ� �޼��� run
		for (int i = 0; i < 10; i++) {
			System.out.println(data);
			try {
				sleep(500);
				//sleep�� Thread�ȿ� �ִ� �޼����̱⶧���� �׳� �ᵵ�ȴ�. ��? ��ӹ޾��ڳ� 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
