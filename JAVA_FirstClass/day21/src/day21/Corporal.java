package day21;

public class Corporal implements Soldier{

	@Override
	public void eat() {
		System.out.println("���ϰ� �Դ´�.");
	}

	@Override
	public void work() {
		System.out.println("�� ���Ѵ�. ������ å�Ӱ��� ������ ���ӵ��� �����Ѵ�.");
	}

	@Override
	public void play() {
		System.out.println("�ų��� ���. ���Ȱ���� �����.");
	}

	@Override
	public void sleep() {
		System.out.println("���� �� ���ܴ�. �̹� ���� ��� �����̴�.");
	}

	@Override
	public void salute() {
		System.out.println("����");
	}
}
