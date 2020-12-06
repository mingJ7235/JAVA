package sec08.exam01_threadgroup;

import java.util.Map;
import java.util.Set;

public class ThreadInfoEx {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread"); //�̸��ο�
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map <Thread, StackTraceElement[]> map = Thread.getAllStackTraces(); 
																				//t���ؿ��ִ� ��� �������� ������ ��������� ���� ��� MapŸ������ ���ϵ�
		Set <Thread> threads = map.keySet();
		
		for (Thread thread : threads) {
			System.out.println("Name : " + thread.getName() + (thread.isDaemon() ? "(����)" : "(����)"));
			System.out.println("\t "+ "�Ҽ� �׷� : "  + thread.getThreadGroup().getName());
			System.out.println();
		}
		/* ������� (��, ���ν������ �ƴ϶� �ٸ� �����嵵 �� ���� ��������)     
		 *	Name : AutoSaveThread(����)
				 �Ҽ� �׷� : main // ���� : ���θ޼ҵ忡 AutoSaveThread�� ��üȭ �����Ƿ�
			
			Name : Finalizer(����)
				 �Ҽ� �׷� : system
			
			Name : Attach Listener(����)
				 �Ҽ� �׷� : system
			
			Name : Reference Handler(����)
				 �Ҽ� �׷� : system
			
			Name : Signal Dispatcher(����)
				 �Ҽ� �׷� : system
			
			Name : main(����)
				 �Ҽ� �׷� : main
		 */
		
		
	}	
}
