package day33_Thread;

public class ThreadTest {
	public static void main(String[] args) {
		//Thread Ŭ����
//		Thread1 th1 = new Thread1("��");
//		Thread1 th2 = new Thread1("��");
//		th1.start();
//		th2.start();
		//������. start�� �� ��ü�� run()�� ã�� �޼����. �� run�� ã�Ƽ� ���ù߻� ��Ű�� �޼����. 
		
		//Runnable �������̽�
		Thread2 t1 = new Thread2("!");
		Thread2 t2 = new Thread2("?");
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		//Runnable�� ���� ��ü�� Thread Ŭ������ �����ڿ� �־ start�޼��带 �ҷ����Ѵ�.
		
		thread1.start();
		thread2.start();
		
		
		
		
	}
}
