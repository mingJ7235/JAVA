package sec06.exam04_wait_notify;

public class WorkObject {
	//������ü 
	//notify�� wait�� ����ϱ� ���ؼ��� ��� �޼ҵ尡 ����ȭ �޼ҵ忩���Ѵ�! 
	public synchronized void methodA () {
		System.out.println("ThreadA�� methodA() �۾�����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB () {
		System.out.println("ThreadB�� methodB() �۾�����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
		
	}
}
