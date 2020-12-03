package pracJAVA1203;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeEx {
	public static void main(String[] args) {
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);
		
		LocalDate targetDate = LocalDate.of(2021, 1, 13);
		System.out.println(targetDate);
		
		LocalTime currTime = LocalTime.now();
		LocalTime targetTime = LocalTime.of(15, 25, 30);
		System.out.println(currTime);
		System.out.println(targetTime);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		LocalDateTime targetDateTime = LocalDateTime.of(2020, 12,25,13,25);
		System.out.println(currDateTime);
		System.out.println(targetDateTime);
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� ���� �ð� : " + utcDateTime);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� �ð� : " + newyorkDateTime);
		
		//Ư�� ������ Ÿ�ӽ����� ���
		
		Instant instant1 = Instant.now();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant instant2 = Instant.now();
		if (instant1.isBefore(instant2)) {
			System.out.println("instant1 �� �����ϴ�.");
		} else if (instant1.isAfter(instant2)) {
			System.out.println("instant1 �� �ʽ��ϴ�.");
		} else {
			System.out.println("������ �ð� �Դϴ�.");
		}
		System.out.println("���� : " + instant1.until(instant2, ChronoUnit.NANOS));
		
		
	}
}
