package mjProjects;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Prac {
	public static void main(String[] args) {
		
		//day 03 ���׿����� �ǽ� ���� 
		int choice = 0 ;
		
		String qMsg = "3+5��? \n"
				+ "����\n"
				+ "1. 4\n"
				+ "2. 5\n"
				+ "3. 8\n"
				+ "4. 10\n";
		
		String correctMsg = "�����Դϴ�. ";
		String wrongMsg = "���� �Դϴ�.";
		String errorMsg = "1������ 4�������� �����ּ���.";
		String resultMsg = "";
		int answer1 = 2 ;
		
		choice = Integer.parseInt(JOptionPane.showInputDialog(qMsg));
		
		resultMsg = choice == answer1 ? correctMsg : 
			!(choice < 1 || choice >4) ? wrongMsg : errorMsg;
		
		System.out.println(resultMsg);
		
//		boolean isTrue = 10 > 9;
//		boolean isFalse = 10 < 9;
//		System.out.println(isTrue);
//		System.out.println(isFalse);
//		

				
								
				
				
				
				
				
				
				
				
				
				
//		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.print("�̸� �Է� : ");
//		name1 = sc.next();
//		System.out.println("�̸� ��� : " + name1);
//		
//		System.out.print("���� �Է� : ");
//		sc.nextLine();
//		age = sc.nextInt();
//		System.out.println("������� : " + age);
//		
		
		
		
		
		
		
		
		
		
		
	}
}
