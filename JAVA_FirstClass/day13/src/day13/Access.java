package day13;
//����Ŭ�������� public�� ���� �� �ִ�. �ٸ� Ŭ�������� ���� �� ����. �ٸ� Ŭ������ default�� ���� �� �ִ�. 
public class Access {
	
	int data1 = 10;
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;
	
	//private���� ���Ƴ������� �ٸ������� �� �� �ְ� ���ִ� getter.
	//�޼��带 ����ؼ� ������ �� �ֵ��� �Ѵ�. 
	//private�� ���� ���� : �����ڰ� �氢�� ���� �ѹ� �� �� �� �ְ� �ϵ��� �ϴ� �ǵ��� ����. �����ڵ� ������ ������.

	public int getData4() {
		//�����ϵ��� �ϴ� ����. �׷��� �� �޼��带 ����ϰ� �ϴ°���. private�� �༭ data4�� ������ �� �ֵ���.. ��...���ص�
		//�����ϸ� �� ���� �ִ� �Ŵϱ�! data4�� ���Ͻ�Ű�� getData4()�� ���� data4��. ���ؿ�������.!!
		return data4;
	}

	public void setData4(int data4) {
		//�̰��� data4���� �����ϴ� setter.
		//����ϴ� �κп��� �Ű� ������ �����ϸ� this.data4�� data4�� ���ϹǷ�. �����̵ȴ�.
		//���� �� getter�� �ٽ� ����ϸ� �ٲ�� �ִ°��� Ȯ���� �� �ִ�. 
		this.data4 = data4;
	}

	void f() {
		
	}
}

class Cloud{
	void function () {
		//Access�� �����ϱ� ���� Access ��üȭ.
		Access a = new Access();
		
		
	}
}
