package p1;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimePackageEx {
	public static void main(String[] args) {
		//Time Package�� �ڹ� 1.8���� ���ĺ��� API���� �������� 
		
		//��¥ ���
		
		LocalDate currDate = LocalDate.now(); 
		System.out.println("Local date : " + currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 12);
		System.out.println("2024�� 5�� 12�� : "+targetDate);
		
		//�ð� ���
		LocalTime currTime = LocalTime.now();
		System.err.println("����ð� : " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30);
		System.out.println(targetTime);
		
		//��¥�� �ð� ���
		
	}
}
