package phoneTask;

public abstract class PhoneAdapter implements Phone {

	void turnOn() {
		System.out.println("���� �ѱ�");
	}
	void turnOff() {
		System.out.println("���� ����");
	}
	
	
	@Override
	public void msg(String num, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(String num) {
		// TODO Auto-generated method stub

	}

	@Override
	public void useInternet() {
		// TODO Auto-generated method stub

	}

}
