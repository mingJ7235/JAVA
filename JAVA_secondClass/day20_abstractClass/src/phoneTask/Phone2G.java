package phoneTask;

public class Phone2G extends PhoneAdapter{

	@Override
	public void msg(String num, String text) {
		System.out.println(num + "���� ������" + "\n���� : " + text);
	}

	@Override
	public void call(String num) {
		System.out.println(num + "���� ��ȭ �Ŵ���");
	}
	
}
