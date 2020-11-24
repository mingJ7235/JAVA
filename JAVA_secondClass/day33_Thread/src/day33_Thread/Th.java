package day33_Thread;

public class Th extends Thread{
	
	public Th(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(super.getName()+" thread. i =" + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Th thread1 = new Th("first");
		Th thread2 = new Th("second");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main ����");
		
		//main�� thread��. (���߿�!) 
		//��, ���� ���� ����Ǵ� thread�� main�̱⶧���� sleep�� ���� �����ϱ�
		//��Ŭ������ �ؿ��ִ� �����̶� ���� ������ �ȴ�. 
		//�׷��� join() �̶�� �޼ҵ带 ���־ ���������� ������ ������ �Ʒ��� ����ǵ��� ���ش�. ��Ű�� �ʴ´�.
		//thread ���������� ���� thread�� ����� �� �ֵ��� join�� �ɾ��ִ� ���̴�.
		//�׷����ϸ�, ���� ������ ������ �Ʒ��� ������ ����ȴ�. 
		//join �� thread�� ��� ���ߴ� ���̱⶧���� InterruptedException�� �Ͼ�������� ����ó���� ���ش�.
		
		/*
		 * join()
		 * ������ ���� ������ ���� ���� �ٸ� ���� ����� ġ������ ����ġ ���� ������ �߻��Ѵ�.
		 * �׷��Ƿ� join() ���� �ؿ� �������� �����尡 ���� �� ������ ��ٸ� �� ����ȴ�.  
		 * 
		 */

		
		
	}
}
