package THREAD;

public class ProcessEx {
	public static void main(String[] args) {
		Go go = new Go();
		Come come = new Come();
		Stop stop = new Stop();
		Pause pause = new Pause();
		
		Thread th1 = new Thread(go);
		Thread th2 = new Thread(come);
		Thread th3 = new Thread(stop);
		Thread th4 = new Thread(pause);
		
		th1.start();//run �޼ҵ����� start�� ȣ���� �Ѵ�. 
		th2.start();
		th3.start();
		th4.start();
		
//		go.run();
//		come.run();
	}
}
