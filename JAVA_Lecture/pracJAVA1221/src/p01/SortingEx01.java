package p01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingEx01 {
	public static void main(String[] args) {

		// ���� ����� ���
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
		.sorted()
		.forEach(n -> System.out.print(n+" "));
		System.out.println();
		
		// ��ü ����� ���
		List<Student> studentList = Arrays.asList(new Student("ȫ�浿", 10),
													new Student("������", 30),
													new Student("�ڸ���", 25)
													);
		
		studentList.stream()
		.sorted()
		.forEach(s -> System.out.print(s.getName()+"-"+s.getScore()+" "));
		System.out.println();
		
		// �������� �����ϱ�
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.print(s.getName()+"-"+s.getScore()+" "));
		
	}

}
class Student implements Comparable<Student> {
	private String name;
	private int score;
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
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	}