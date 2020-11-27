package p1;

import java.util.Scanner;

public class LoginExample {
	static String id = null;
	static String password = null;
	public static void main(String[] args) {
		input();
		try {
			login ();
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
		} catch (WrongPassWordException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("5���Ŀ� �ڵ� �α׾ƿ� �մϴ�. ");
		}
	}
	private static void input () {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		id = sc.next();
		System.out.print("��й�ȣ : ");
		password = sc.next();
	}
	
	private static void login () throws NotExistIDException, WrongPassWordException{
		if (!id.equals("admin")) {
			//���ܹ߻�
			throw new NotExistIDException("���ܹ߻�. ���̵� Ʋ�Ƚ��ϴ�.");
		}
		if (!password.equals("admin1234")) {
			throw new WrongPassWordException("��й�ȣ�� Ʋ�Ƚ��ϴ�. Ȥ�� ��Ŀ�ΰ���?");
		}
	}
}
