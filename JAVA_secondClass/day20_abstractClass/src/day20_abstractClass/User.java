package day20_abstractClass;

public class User {

	public void check (Soldier a) {
		if (a instanceof Private) {
			System.out.println("���� �̺��Դϴ�. ");
		} else if (a instanceof Pfc) {
			System.out.println("���� �Ϻ��Դϴ�.");
		} else if (a instanceof Corporal) {
			System.out.println("���� ���Դϴ�.");
		} else if (a instanceof Sergeant) {
			System.out.println("���� �����Դϴ�. ");
		}
	}
	public static void main(String[] args) {
		User c = new User ();
		Soldier [] soldier = {
				new Private(),
				new Pfc(),
				new Corporal(),
				new Sergeant()
		};
		
		c.check(new Private());
		
		
		
	}
}
