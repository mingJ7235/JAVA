package pracJAVA1203;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeOperEx {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDate nowDate = LocalDate.now();
		System.out.println("���� ��¥ �ð� :" + now);
		System.out.println("�����̱褷��");
		LocalDateTime targetDateTime = now.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);
		System.out.println("���� �� : "  +targetDateTime);
		
		LocalDateTime targetDateTime1 = now.plusDays(3);
		System.out.println("��������� ������ ��"+ targetDateTime1);
		LocalDateTime returnBookDate = now.plusDays(3);
		System.out.println("å �ݳ��Ⱓ : " + returnBookDate + "�ϱ����Դϴ�.");
				
					
	}
}
