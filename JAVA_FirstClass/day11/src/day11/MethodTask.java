package day11;

import javax.swing.JOptionPane;

public class MethodTask {
	// Ȧ���� ¦���� ¦���� Ȧ���� �ٲ��ִ� �޼���
	void change(int num1){
		System.out.println("Ȧ���� ¦����, ¦���� Ȧ���� �ٲٴ� �޼ҵ��Դϴ�.");
		if(num1 % 2 == 1) {
			num1 ++;
			System.out.println("Ȧ���̹Ƿ� 1�� ���ؼ� ¦���� ��������ϴ�.");
			System.out.println(num1);
		}else {
			num1 --;
			System.out.println("¦���̹Ƿ� 1�� ���� Ȧ���� ��������ϴ�.");
			System.out.println(num1);			
		}
	}
	// 1���� ���� �Է��� ���������� �������� �����ִ� �ż���
	void sum(int end) {
		int result = 0;
		if (end > 1) {
			for (int i = 1; i < end+1; i++) {
				result += i;
			}
			System.out.println("1���� " + end + " ������ ���� ���ϴ� �ż��� �Դϴ�.");
			System.out.println(result);
		} else {
			System.out.println("1���� ū ���� �Է��ϼ���");
		}
	}
	// �� ������ ������ �޼���
	void div(int num1, int num2) {
		double result = 0.0;
		if (num2 != 0) {
		result = Double.parseDouble(String.format("%.2f", (double)num1 / num2));
		System.out.println(num1 + " �� " + num2 + " �� ������ �޼����Դϴ�." );
		System.out.println(result);
		} else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
	// ������ �ѱ۷� �ٲ��ִ� �޼���
	void chargeToKor(String data){
		String kor = "�����̻�����ĥ�ȱ�";
		String result = "";
		int num  = Integer.parseInt(data);
		for (int i = 0; i < data.length(); i++) {
			result += kor.charAt(num % 10);
			num /= 10;
		}
		for(int i = data.length()-1 ; i > -1 ; i--) {
			System.out.print(result.charAt(i));
		}
	}
	
	
	//main method
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		int num = 0;
		System.out.println("Ȧ���� ¦����, ¦���� Ȧ���� �����");
		num = Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �Է����ּ���"));
		m.change(num); 
		
		
		
		
	}
}