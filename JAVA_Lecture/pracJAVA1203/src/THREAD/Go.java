package THREAD;

public class Go implements Runnable{
	
	@Override
	public void run() {
		go();
	}
	
//	@Override
//	public void run() { //������� ó���� ������ �ۼ�
//		go();
//		super.run();
//	}
	public void go () {
		while (true) {
			System.out.println("Go!");
		}
	}

}
