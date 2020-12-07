package sec09.exam01_execute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitEx {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		//������Ǯ ����. �ִ� ��������� 2����
		
		for (int i = 0; i <10 ; i ++) {
			//�۾�����
			Runnable runnable = new Runnable () {
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize(); //������Ǯ�� �ִ� ������ ��
					
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ���� : " + poolSize + "]" +
							"�۾� ������ �̸� -" + threadName); //�۾� ó�� -pool-1-thread-1
					
					//���ܹ߻���Ű��
					int value = Integer.parseInt("��"); //numberformat exception �߻�
					
				}
			};
			//�۾� Queue�� �ֱ� (execute)
//			executorService.execute(runnable); // -> �۾� Queue�� �۾��� ����� 
			// execute�� ���ܹ߻��ϸ� �����带 ������Ǯ���� �����ϰ� ���ο� �����带 �����. 
			
			//�۾� Queue�� �ֱ� (submit)
			executorService.submit(runnable);
			//submit�� ���ܹ߻��ϸ� ���ܸ� �߻���Ű�� �ʰ� �����带 ������Ǯ���� �������� �ʰ� �����۾����� �Ѿ �����Ѵ�. 
			
			try {
				Thread.sleep(10); //������ �ʹ� ���� ���Ƽ� ���� �ܼ� ����� ����� ���� �ʱ⿡ ������ �ɾ��ش�. 
			} catch (InterruptedException e) {}
		}
		
		//�۾� ����
		executorService.shutdown(); //shutdown()�� �۾��� ��� �� ó���� �� ������Ǯ ����
	}
}
