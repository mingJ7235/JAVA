package sec06.exam02_yield;

public class YieldEx {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {	}
		threadA.work =false;
		//A�� work�ʵ尡 false�� �ǹǷ�, yield()�� ȣ��Ǿ� B�� �۾��Ѵ�. 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {	}
		threadA.work =true;
		//�ٽ� ������ �ݺ���
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {	}
		threadA.stop = true;
		threadB.stop = true;
		
		//stop() �޼ҵ带 �����������, run() �޼ҵ� ������ ������ �ְ�, �ʵ尪�� ���� �������ִ°��� 
		//�����ϴ�. stop() �޼ҵ�� deprecated�Ǿ���. (�Ҿ�������)
	}
}
