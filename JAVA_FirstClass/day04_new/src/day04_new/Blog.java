package day04_new;

import java.util.Scanner;

public class Blog {
	public static void main(String[] args) {
		//������ �� ���� �׽�Ʈ
		String msg = "Q. ����� ��������? ";
		String cMsg = "1. A \n2. B \n3. O \n4. AB";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		String a_msg = "�Ĳ��ϰ� �����ϴ�.";
		String b_msg = "�������� �ִ�.";
		String o_msg = "�米���� ����.";
		String ab_msg = "���ϴ�.";
		String result_msg = ""; 
		
		System.out.println(msg + "\n" + cMsg);
		choice = sc.nextInt();
		
		switch (choice) {
		case 1 : 
			result_msg = a_msg;
			break;
		case 2 :
			result_msg = b_msg;
			break;
		case 3 :
			result_msg = o_msg;
			break;
		case 4 :
			result_msg = ab_msg;
			break;
		default : 
			result_msg = "?";
		}
		System.out.println(result_msg);
		//break�� ���� ����. switch�� �Ʒ��� �� �д´�. �׷��� �ݵ�� break�� �־���Ѵ�. 
	}
}
		
		

