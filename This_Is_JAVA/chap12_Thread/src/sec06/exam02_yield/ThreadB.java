package sec06.exam02_yield;

public class ThreadB extends Thread{
	//stop �� �����带 ���߱����� ����� �����̰� work�� yield �޼ҵ带 ����� ������ �˱����� ���
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while (!stop) {
			if(work) {
				System.out.println("ThreadB �۾�����");
			}else {
				//work�� false�� �Ǹ� ���ǹ��� �ݺ��� ���⶧���� yield()�� ȣ����
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}
