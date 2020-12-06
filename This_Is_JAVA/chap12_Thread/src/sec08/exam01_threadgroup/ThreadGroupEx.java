package sec08.exam01_threadgroup;

public class ThreadGroupEx {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
																						//�Ҽӱ׷�, �������̸�
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main ������ �׷��� list() �޼ҵ� ��� ����]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup(); //���� ������ �׷�
		mainGroup.list(); // ����Ʈ�� ȣ���� �ȿ��ִ� ���¿����� ���
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		System.out.println("[myGroup ������ �׷��� interrupt()�޼ҵ� ȣ��]");
		//myGroup���ִ� �� workThreadA, workThreadB������
		
		myGroup.interrupt(); //�̷��ԵǸ� �� �ȿ� ���� ��� �����尡 ���ͷ��Ǹ鼭 �����
		
		/*
		 * [main ������ �׷��� list() �޼ҵ� ��� ����]
			java.lang.ThreadGroup[name=main,maxpri=10]
																		//�������ִ� �ִ� �켱������ 10��
			    Thread[main,5,main]
			    			//�������̸�, �켱����, �Ҽ� �׷��̸�
			    java.lang.ThreadGroup[name=myGroup,maxpri=10]
			        Thread[workThreadA,5,myGroup]
			        Thread[workThreadB,5,myGroup]
		 * 
		 * [myGroup ������ �׷��� interrupt()�޼ҵ� ȣ��]
			workThreadA interrupted
			workThreadB interrupted
			workThreadB �����
			workThreadA �����
		 */
		
		
	}
}
