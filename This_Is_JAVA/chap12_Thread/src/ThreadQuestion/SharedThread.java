package ThreadQuestion;

public class SharedThread {
	public synchronized void movie ( ) {
		System.out.println("�������� ����մϴ�.");
		notify();
		try {
			wait ();
		} catch (InterruptedException e) {
		}
	}
	public synchronized void music () {
		System.out.println("������ ����մϴ�");
		notify();
		try {
			wait ();
		} catch (InterruptedException e) {
		}
	}
}
