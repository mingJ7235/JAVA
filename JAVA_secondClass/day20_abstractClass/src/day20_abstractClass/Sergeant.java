package day20_abstractClass;

public class Sergeant extends SoldierAdapter {
	
	//�̰� �߻�Ŭ������ �������̽��� Ȱ����. 
	
	@Override
	public void play() {
		System.out.println("��� ���.");
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
