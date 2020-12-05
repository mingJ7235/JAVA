package sec06.exam05_wait_notify;

public class WaitNotifyEx {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread pt = new ProducerThread(dataBox);
		ConsumerThread ct = new ConsumerThread(dataBox);
		
		pt.start();
		ct.start();
		
		/* �ܼ� ��� ���� 
		Producer Thread�� ������ ������ Data-1
		Consummer Thread�� ���� ������ : Data-1
		Producer Thread�� ������ ������ Data-2
		Consummer Thread�� ���� ������ : Data-2
		Producer Thread�� ������ ������ Data-3
		Consummer Thread�� ���� ������ : Data-3
		*/
	}
}
