package phone;

public class Phone2G extends PhoneAdapter{

	@Override
	public void msg(String tMsg, String telNum) {
		System.out.println("\""+ telNum+ "\""+"���κ��� ���ڸ޼����� �����߽��ϴ� : \n" + tMsg);
	}

	@Override
	public void call(String telNum) {
		System.out.println("\""+ telNum+ "\""+ "���Լ� ��ȭ�� �Խ��ϴ�.");
	}

}
