package day07_new;

import java.util.Scanner;

public class ArTask_mine {
	public static void main(String[] args) {
		//1~n ���� �迭�� ��� �� �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		String msg = "1~n ���� �� ���� ���Ұ̴ϴ�. \n"
				+ "n�� ���� �Է����ּ��� : ";
		int result = 0;
		
		System.out.println(msg);
		int [] arData = new int [sc.nextInt()];
		for (int i = 0; i < arData.length; i++) {
			result += i+1;
		}
		System.out.println(result);
		
	}
}
