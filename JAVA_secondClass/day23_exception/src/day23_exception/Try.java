package day23_exception;

public class Try {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("����");
		
	}
}
