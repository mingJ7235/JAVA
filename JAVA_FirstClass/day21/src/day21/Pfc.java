package day21;

public class Pfc implements Soldier{

	@Override
	public void eat() {
		System.out.println("������ ��Ȯ�ϰ� �Դ´�.");
	}

	@Override
	public void work() {
		System.out.println("�̵���� ���� �˷��ָ� ������ ���Ѵ�.");
	}

	@Override
	public void play() {
		System.out.println("�뷡��� ���̹����Ĺ�, �����⸦ ����Ѵ�.");
	}

	@Override
	public void sleep() {
		System.out.println("Ǫ��~ �� �ܴ�. �ڴٸ��� ���� �̵�� ��� ����.");
	}

	@Override
	public void salute() {
		System.out.println("��!, ��!");
	}

}
