package day20_abstractClass;

public class Private implements Soldier {
	@Override
	public void eat() {
		System.out.println("�����ϰ� �Դ´�.");
	}

	@Override
	public void work() {
		System.out.println("�������� �Ѵ�");
	}

	@Override
	public void play() {
		System.out.println("�����.");
	}

	@Override
	public void sleep() {
		System.out.println("��ħ�� �����Ѵ�.");
	}

	@Override
	public void salute() {
		System.out.println("��!!!!!!!!!!!!!��!!!!!!!!!!");
	}

}
