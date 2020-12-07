package sec09.exam02_blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultEx {
	//�۾�ó�� ����� ���� �۾��� blocking ������� 
	public static void main(String[] args) {
		//������ Ǯ�� �ִ� ��������� cpu�� �ھ���� ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				//���� ����ϴ� cpu�� �ھ� ���� (����ǻ�ʹ� 4���� �����ھ�)
				);
		
		System.out.println("[�۾� ó�� ��û]");
		Runnable runnable = new Runnable() { //�͸�ü�� ��ȯ!
			@Override
			public void run() {
				//������ Ǯ�� �����尡 �۾��� ���� �ۼ�
				int sum = 0;
				for (int i = 0; i < 10; i++) {
					sum += (i+1);
				}
				System.out.println("[ó�����] " + sum);
			}
		};
		
		//�۾� Queue�� ���� -> ������ Ǯ�� ��ü�� �̿��ؼ� submit �̳� execute�� ���
		Future future = executorService.submit(runnable); //���ϰ��� ��� submit��� ���� 
	
		//blocking
		//�۾��� �Ϸ�ɶ������� blocking �ǰ�, �۾� ����� ���ϰ��� �����Ƿ� null�� ������ 
		//����Ÿ���� Object�̶� Object ��ü�� ���� �� ������, ����� null�� �����ϹǷ� ������. 
		try {
			future.get();
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (Exception e) {
			//�����尡 ��Ʈ��Ʈ �Ǿ��� ��
			System.out.println("[���� �߻���]" + e.getMessage());
		} 
		
		//������Ǯ ����
		executorService.shutdown();
		
	}
}
