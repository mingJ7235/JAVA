package review;

import javax.swing.JOptionPane;

/*
 * Ȧ���� ¦���� �ٲ��ִ� �޼���
 * 1���� ���� �Է��� ���������� ������ �����ִ� �޼���
 * �� ������ ������ �޼���
 * 
 * ������ �ѱ۷� �ٲ��ִ� �޼���
 * �Է� �� ) 1024
 * ��� �� ) �ϰ��̻�
 */

public class MethodTask {

	void change (int num) {
		int result = 0 ;
		String msg = "Ȧ���� ¦���� �ٲ��ִ� �޼��� �Դϴ�.";
		System.out.println(msg);
		
		if (num / 2 == 0) {
			//¦����� ���̴ϱ�
			System.out.println("¦��" + num + "�� 1�� ���� Ȧ�� " + (num + 1) + "�� ����Ǿ����ϴ�.");
			result = num + 1;
			System.out.println(result);
		} else {
			//Ȧ����� �Ŵϱ�
			System.out.println("Ȧ��" + num + "�� 1�� ���� ¦�� " + (num + 1) + "�� ����Ǿ����ϴ�.");
			result = num + 1;
			System.out.println(result);
		}
	}
	
	int sum (int num) {
		String msg = "1���� ���� �Է��� ���������� �������� �����ִ� �޼��� �Դϴ�.";
		int result = 0;
		
		System.out.println(msg);
		for (int i = 0; i < num + 1; i++) {
			result += i;
		}	return result;
	}
	
	void div (int num1, int num2) {
		String msg = "�������� ���ִ� �޼����Դϴ�.";
		String errorMsg = "���� ���ڴ� 0���� Ŀ���մϴ�. ";
		String result = ""; 
		System.out.println(msg);
		
		if (num2 <= 0) {
			System.out.println(errorMsg);
		} else {
			result = String.format("%.2f",(double) num1 / num2); 
		} System.out.println(result);
	}
	
	
	void modiKor (String data) {
		String kor = "�����̻�����ĥ�ȱ�";
		String result = "";
		String fResult ="";
		int num = 0;
		
		num = Integer.parseInt(data);
		for (int i = 0; i < data.length(); i++) {
			result += kor.charAt(num % 10);
			num /= 10;
		}
		for (int i = data.length()-1; i > -1; i--) {
			fResult += result.charAt(i);
			
		}
		JOptionPane.showMessageDialog(null, fResult);			
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int result = 0;
		MethodTask m = new MethodTask ();
//		m.change(Integer.parseInt(JOptionPane.showInputDialog("������ �Է����ּ���")));
		
//		result = m.sum(Integer.parseInt(JOptionPane.showInputDialog("������ �Է����ּ���")));
//		System.out.println(result);
		
//		m.div(Integer.parseInt(JOptionPane.showInputDialog("ù��° ������ �Է����ּ���")), 
//				Integer.parseInt(JOptionPane.showInputDialog("�ι�° ������ �Է����ּ���")));
		
		m.modiKor("9088231");
		
//		String test = "�����";
//		System.out.println(test.charAt(0));
	}
}
