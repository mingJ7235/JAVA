package sec06.exam05_wait_notify;

public class DataBox {
	//���� ��ü
	private String data;

	public synchronized String getData() {
		if (this.data == null) {
			//null�ΰ�� �Һ��� �����带 wait��Ŵ
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("Consummer Thread�� ���� ������ : " + returnValue);
		data = null;
		notify(); //������ �����带 ȣ���� 
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if (this.data != null) {
			//�Һ��� �����尡 ���� �����͸� ���� �ʾҴٸ�
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		this.data = data;
		System.out.println("Producer Thread�� ������ ������ " + data);
		notify(); // �Һ��� �����带 ����
	}
	
	
}
