package day04_new;

public class Test {
	public static void main(String[] args) {
		
		//100~1���� ���
		
		System.out.println("100 ���� 1���� ��� �մϴ�.");
		for (int i = 0 ; i < 100; i++ ) {
			System.out.print((100 - i) + " ");
		}
		System.out.println("");
		
		//1~100���� �� ¦���� ����ϱ�
		
		System.out.println("1���� 100���� �� ¦���� ��� �մϴ�.");
		for (int i = 0; i < 51; i++) {
			System.out.print(i*2 + " ");
		}
		System.out.println("");
		
		//1~10������ �� ���ϱ�
		
		System.out.println("1���� 10���� �� ���� ��� �մϴ�.");
		int result = 0;
		int num = 10;
		for (int i = 0; i < num + 1 ; i++) {
			result += i;
		}System.out.println(result);
		//A~F���� ����ϱ� (��ȣȭ�ι���� - charAt���)
		
		System.out.println("A~F���� ����մϴ�. (��ȣȭ���� charAt ���� Ȱ��)");
		String Eng1 = "ABCDEF";
		String result1 = "";
		for (int i = 0; i < 6; i++) {
			result1 += Eng1.charAt(i);
		}System.out.println(result1);
		
		//A~F���� ����ϱ� (�ƽ�Ű�ڵ� Ȱ��)
		
		System.out.println("A~F���� ����մϴ�. (�ƽ�Ű�ڵ� Ȱ��)");
		for (int i = 65; i < 71; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println("");
		
		//A~F���� �� C �����ϰ� ����ϱ� (��ȣȭ�ι���� - charAt���)
		
		System.out.print("A~F���� �� C�����ϰ� ����մϴ�. (��ȣȭ���� charAt ���� Ȱ��)");
		String Eng2 = "ABCDEF";
		String result2 = "";
		for (int i = 0; i < 6; i++) {
			if (i == 2) {
				System.out.println("");
			}else {
				result2 += Eng2.charAt(i);
			}
		}System.out.println(result2);
		
		//A~F���� �� C �����ϰ� ����ϱ� (�ƽ�Ű�ڵ� Ȱ��)
		System.out.println("A~F���� �� C�����ϰ� ����մϴ�. (�ƽ�Ű�ڵ� Ȱ��)");
		for (int i = 65; i < 71; i++) {
			if (i == 67) {
				System.out.print("");
			}else {
				System.out.print((char)i + " ");
			}
		}
		System.out.println("");
		//aBcDeFgH....Z ����ϱ�
	
		System.out.println("aBcDeFgH...Z �� ����մϴ�.");
		for (int i = 66 ; i < 91; i = i +2) {
			System.out.print((char) (i + 31));
			System.out.print((char) i);
		}
		System.out.println("");
		
		//0 1 2 0 1 2 0 1 2 ����ϱ� (%������ ����ϱ�)
		
		System.out.println("0 1 2 0 1 2 0 1 2 �� ����մϴ� (%������ ����ϱ�)");
		int result3= 0;
		for (int i = 0; i < 9; i++) {
			result3 = i % 3;
			System.out.print(result3 + " ");		
		}
	}



}
