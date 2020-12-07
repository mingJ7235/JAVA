package sec09.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableEx {
	//�۾�ó�� ����� ���� �۾��� blocking ������� 
	public static void main(String[] args) {
		//������ Ǯ�� �ִ� ��������� cpu�� �ھ���� ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				//���� ����ϴ� cpu�� �ھ� ���� (����ǻ�ʹ� 4���� �����ھ�)
				);
		
		System.out.println("[�۾� ó�� ��û]");
		Callable<Integer> task = new Callable<Integer>()  { //�͸�ü�� ��ȯ!
			@Override
			public Integer call() {
				//������ Ǯ�� �����尡 �۾��� ���� �ۼ�
				int sum = 0;
				for (int i = 0; i < 10; i++) {
					sum += (i+1);
				}
				return sum;
			}
		};
		
		//�۾� Queue�� ���� -> ������ Ǯ�� ��ü�� �̿��ؼ� submit �̳� execute�� ���
		Future<Integer> future = executorService.submit(task); //���ϰ��� ��� submit��� ���� 
	
		//blocking
		//�۾��� �Ϸ�ɶ������� blocking �ǰ�, �۾� ����� ���ϰ��� �����Ƿ� null�� ������ 
		//����Ÿ���� Object�̶� Object ��ü�� ���� �� ������, ����� null�� �����ϹǷ� ������.
		//call()�� �����ϴ� ���ϰ��� get()�� ������
		try {
			int sum = future.get();
			System.out.println("[ó�����]" + sum);
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (Exception e) {
			//�����尡 ��Ʈ��Ʈ �Ǿ��� ��
			System.out.println("[���� �߻���]" + e.getMessage());
		} 
		
		//������Ǯ ����
		executorService.shutdown();
		
	}
}
