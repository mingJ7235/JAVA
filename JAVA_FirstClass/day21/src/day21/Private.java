package day21;

public class Private implements Soldier{

	@Override
	public void eat() {
		System.out.println("90���� �㸮�� �ϴ��� ���� �� �������� �������� ��ġ�� �Ļ��Ѵ�.");
	}

	@Override
	public void work() {
		System.out.println("��ġ ���� ���ϸ� �ȵǴ� �� ó�� ���� ������ �ٸ� ���Ѵ�.");
	}

	@Override
	public void play() {
		System.out.println("���ӵ�� �Բ� �ϰ� ������, ���� ���� �� ������ ������ �� ���� ���Ѵ�.");
	}

	@Override
	public void sleep() {
		System.out.println("��ħ���� ���� ������ ���� �� �ܴ�.");
	}

	@Override
	public void salute() {
		System.out.println("��~~~~~~~~~~~~~~~~~~~~~~��!");
	}

}
