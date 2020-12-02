package p6_Calendar;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		//getInstance () -> �̱������� 
		System.out.println(now);
		int year = now.get(Calendar.YEAR); //year�� 1�� ������� ����
		int yearNum = now.get(1); 
		System.out.println(year);
		System.out.println(yearNum);
		int month = now.get(Calendar.MONTH); // month �� 2�� ������� ����
		int monthNum = now.get(2);
		System.out.println(month+1);
		System.out.println(monthNum+1);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week); //�������� 4
		System.out.println(Calendar.MONDAY); //�������� 2 //�Ͽ����� 1 ���ڸ� ������. �׷��� �񱳰���
		if (week==Calendar.MONDAY) {
			System.out.println("������");
		}else {
			System.out.println("������ �ƴ�");
		}
		
		int am_pm = now.get(Calendar.AM_PM);
		System.out.println(am_pm);
		System.out.println(Calendar.AM_PM);
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		
		//�������� �������� ��Ÿ���� ���α׷�
		if (Calendar.AM == now.get (Calendar.AM_PM))
			System.out.println("�����Դϴ�.");
		else 
			System.out.println("�����Դϴ�.");
		
		System.out.println(now.get(Calendar.HOUR) + "��" + now.get(Calendar.MINUTE) + "��" 
								+ now.get(Calendar.SECOND) + "��");
		System.out.println(now.get(10) + " ��" + now.get(12) + " ��" + now.get(13) +" ��"); 
		
	}
}
