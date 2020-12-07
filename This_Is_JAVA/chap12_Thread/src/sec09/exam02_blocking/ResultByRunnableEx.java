package sec09.exam02_blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableEx {
	//runnable�� ����Ͽ� �ܺΰ�ü�� �����ϱ�
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				);
		
		System.out.println("[�۾� ó�� ��û]");
		class Task implements Runnable {
			Result result;
			
			public Task(Result result) {
				this.result = result;
			}
			@Override
			public void run() {
				int sum = 0;
				for (int i = 0; i < 10; i++) {
					sum += (i+1);
				}
				result.addValue(sum);
			}
		};
		
		//������ü (�ܺΰ�ü)-> ��������� �����ϴ� ��ü 
		Result result = new Result();
		//�ΰ��� �۾��� ����
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		//�۾� Queue�� �ְ� �ܺΰ�ü�� ������. 
		Future <Result> future1 = executorService.submit(task1, result);
		Future <Result> future2 = executorService.submit(task2, result);
		
		try {
			result = future1.get();
			result = future2.get();
			System.out.println("[ó����� ]" + result.accumValue); //task1 �� task2�� ��� ���յ� �����
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (Exception e) {
			System.out.println("[���� ���� �߻���]" +e.getMessage());
		} 
	}
}
class Result {
	int accumValue;
	synchronized void addValue(int value) { //����ȭ �޼ҵ�� ȣ���ϱ�
		accumValue += value;
	}
}
