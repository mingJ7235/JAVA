package sec02.exam02_threadname;

public class ThreadnameEx {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());
		
		Thread threadA = new ThreadA ();
		threadA.start();
	}
}
