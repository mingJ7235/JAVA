package sec07.exam01_daemon;

public class DaemonEx {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); //main�������� ���� ������� �������
		autoSaveThread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println("���� ������ ���� ");
	}
}
