package day21;

public class Sergeant extends Army {
	
	//Army �߻�Ŭ�������� ������ �޼���� �Ϲݸ޼����̹Ƿ� �׳� ������ ����ȴ�. 
	
	@Override
	public void play() {
		System.out.println("��� ���. ");
	}
	
	@Override
	public void sleep() {
		System.out.println("��� �ܴ�.");
	}
	@Override
	public void salute() {
		System.out.println("��");
	}
	
}
