package sec06.stream_sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;


public class SortingEx {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int [] {5,3,2,1,4});
		
		intStream
			.sorted()
			.forEach(n -> System.out.println(n));	//�⺻������ �ø�������
		System.out.println();
		
		//��ü����ΰ�� (�÷����� ���ε����)
		List <Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 30),
				new Student("�ſ��", 10),
				new Student("���̼�", 20)
		);
		
		//�⺻ ���� -> Student�� �������� ������ ����
		
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.println(s.getScore() + ","));
		//�ݴ� ����
		studentList.stream()
			.sorted((a,b) -> b.compareTo(a) )
			.forEach(s -> System.out.println(s.getScore() + ","));
		
		studentList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s -> System.out.println(s.getScore() + ","));
	}
}
