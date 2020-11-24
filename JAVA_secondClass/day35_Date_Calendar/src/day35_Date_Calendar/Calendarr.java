package day35_Date_Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Calendarr {
	//�� �� �Է¹ް� �޷� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		int year = 0;
		int month = 0;
		
		do {
			System.out.println("������� �޷��� ��, ���� �Է��ϼ���.");
			year = sc.nextInt();
			month = sc.nextInt();
			if (year > 0 && month > 0 && month < 13) { //�� �Է����� �� break;
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ�");
			}
		}while (true);
		
		c.set(year, month-1, 1);
		//��, ��, ��
		
		int lastDay = c.getActualMaximum(c.DAY_OF_MONTH);
								//���� ������ ���� �����ִ� �޼�����.
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("                 " + year + "�� " + month + "��");
		System.out.println("============================");
		System.out.println(" ��     ��     ȭ     ��     ��     ��     �� ");
		
		
		for (int i = 0; i < weekDay-1; i++) {
			//day_of_week�� 1���� �����ϱ⶧���� (weekDay) -1 ���ذ���. 
			if(i==0) { 
				System.out.print("                 ");
			}else {
				System.out.print("    ");
			}
		}
		for (int i = 1; i < lastDay+1; i++) {
			System.out.printf("  %02d ", i);
						//%02d : �տ� 0�� �ٰ� 2�ڸ��� ������ �������
			if (weekDay % 7 == 0) {
				System.out.println();
			}
			weekDay++;
			//weekday�� ����⶧���� ++�� �ؼ� �������Ѿ��Ѵ�. 
		}
		System.out.println("\n============================");
		
	}
}
