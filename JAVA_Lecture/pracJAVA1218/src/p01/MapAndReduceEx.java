package p01;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MapAndReduceEx {
	public static void main(String[] args) {
		List <Student> list =Arrays.asList(
				new Student ("ȫ�浿", 10),
				new Student ("�ſ��", 20),
				new Student ("���̼�", 30)
				);
		
		OptionalDouble avg1 = list.stream().mapToInt(Student :: getScore).average();
		double avg2 = list.stream().mapToInt(Student :: getScore).average().getAsDouble();
		System.out.println("��� ���� : " + avg1);
		System.out.println("��� ���� : " + avg2);
		
		long count = list.stream().filter(m -> m.getName().equals("ȫ�浿")).mapToInt(Student :: getScore).count();
		System.out.println(count);
	}
}

class Student {
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
