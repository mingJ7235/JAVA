package phone;

public abstract class PhoneAdapter implements Phone {
	
	public void turnOn () {
		System.out.println("���� �ѱ�");
	}
	
	public void turnOff () {
		System.out.println("���� ����");
	}


	@Override
	public void msg(String tMsg, String telNum) {

	}

	@Override
	public void call(String telNum) {

	}
	
	@Override
	public void useInternet() {

	}

}
