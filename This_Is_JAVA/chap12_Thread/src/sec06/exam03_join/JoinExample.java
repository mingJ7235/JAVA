package sec06.exam03_join;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {	} 
		
		//join()�� ����Ͽ� ��ٷ��ִ� ����. 
		
		System.out.println("1~100������ �� : " + sumThread.getSum()); 
		//join() ���� ����ϸ�, �߰��� ���� ����� �Ǵ� ���̴�. run() ���߿� ��µ�. 
		//join()�� ����Ͽ� ��� ���� ���� ���ֵ��� ����ϴ� ����
		
		
		
	}
}
