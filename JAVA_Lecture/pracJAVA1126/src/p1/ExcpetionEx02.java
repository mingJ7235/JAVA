package p1;

public class ExcpetionEx02 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println("���ڿ���");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ����");
		}
		method2();
		System.out.println("�����ͺ��̽� ����");
		System.out.println("�α׾ƿ�");
	}
	
	private static void method1() /*throws ArithmeticException, ArrayIndexOutOfBoundsException*/{
		a();
	}
	
	private static void a () /*throws /*ArithmeticException, ArrayIndexOutOfBoundsException*/{
		b();
		int [] arr = new int [5];
		arr [5] = 10;
	}
	
	private static void b () /*throws ArithmeticException*/{
		int a = 10;
		int c = a / 2; //���� �߻�
	}
	
	private static void method2 () {
		
	}
}
