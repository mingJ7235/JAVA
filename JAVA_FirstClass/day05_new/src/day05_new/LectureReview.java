package day05_new;

import java.util.Scanner;

public class LectureReview {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String msg = "1. ��ſ�� ��ȸ\n2. �нǽŰ�\n3. �ܸ��� ��ݳ���\n0. ���� ����";
		
		do {
			System.out.println(msg);
			choice = sc.nextInt();
		
		}while (choice != 0);
		
//while (choice ! =0); �ϰ�� ���ǽ��� int choice=0 ���� ����Ǿ����Ƿ� �̹� ���ǽ��� 0�̵Ǿ� false�� �Ǿ Ż���. �׷��� do ��
	
	}
}

