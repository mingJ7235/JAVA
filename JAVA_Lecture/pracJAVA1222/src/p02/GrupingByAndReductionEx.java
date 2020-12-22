package p02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import p01.Student;

public class GrupingByAndReductionEx {
	public static void main(String[] args) {
		List<Student> totalList=Arrays.asList(
	            new Student("ȫ�浿", 10, Student.Sex.MALE,Student.City.PUSAN),
	            new Student("�����", 6, Student.Sex.FEMALE,Student.City.SEOUL),
	            new Student("�ſ��", 10, Student.Sex.MALE,Student.City.PUSAN),
	            new Student("�ڼ���", 6, Student.Sex.FEMALE,Student.City.SEOUL),
	            new Student("�ڼ�ȣ", 6, Student.Sex.MALE,Student.City.SEOUL)
	            );
		//������ ��� ���� ���ϴ� Map ���
		
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex,
						Collectors.averagingDouble(Student::getScore)));
		
		System.out.println("���л� ��� ���� : " +mapBySex.get(Student.Sex.MALE));
		System.out.println("���л� ��� ���� : " +mapBySex.get(Student.Sex.FEMALE));
	
		Map<Student.Sex, Long> countBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex,
						Collectors.counting()));
		
		System.out.println("���л� ��  :" + countBySex.get(Student.Sex.MALE));
		System.out.println("���л� ��  :" + countBySex.get(Student.Sex.FEMALE));
		
		//������ ��ǥ�� �����ϴ� �̸��� �����ϴ� Map ��� (ex>
		
		Map<Student.Sex, String> nameBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex,
										Collectors.mapping(Student :: getName, 
																		Collectors.joining(",")))); //joining�� String Ÿ���� �Ű������� �����ϰ����ش�
		
		System.out.println("���л� : " + nameBySex.get(Student.Sex.MALE));
		
		
	}
}
