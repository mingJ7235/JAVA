package sec11.stream_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingEx {
	public static void main(String[] args) {
		List <Student> totalList = Arrays.asList(
				new Student ("ȫ�浿", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student ("�����", 6, Student.Sex.FEMALE, Student.City.Pusan),
				new Student ("�ſ��", 10, Student.Sex.MALE, Student.City.Pusan),
				new Student ("�ڼ���", 6, Student.Sex.FEMALE, Student.City.Seoul)
		);
		
		Map<Student.Sex, List <Student>> mapBySex =
				totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex)); //key�� ������ �ɰ��ΰ��� ������ ���⼭�� ������ key
		
		//������ �׷��� �ߵǾ����� Ȯ��
		System.out.print("���л� : "); //
		mapBySex.get(Student.Sex.MALE).stream()
			.forEach(m -> System.out.print(m.getName() + " "));
		
		System.out.print("���л� :");
		mapBySex.get(Student.Sex.FEMALE).stream()
			.forEach(m -> System.out.print(m.getName()+ " "));
		
		Map<Student.City, List <String>> mapByCity = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student::getCity,//key�� ������ ����� ���ΰ� / city�� ���� Ű�� ����Ұ���
								Collectors.mapping(Student::getName, Collectors.toList())
							)
					);
		System.out.println("\n[����]");
			mapByCity.get(Student.City.Seoul).stream()
			.forEach(name -> System.out.print(name + " "));
			
		System.out.println("\n[�λ�]");
		mapByCity.get(Student.City.Pusan).stream()
		.forEach(name -> System.out.print(name + " "));
		
		Map<Student.Sex, String> mapBySexName = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student :: getSex,				//Map�� Key�� ���ϰ�
								Collectors.mapping(			//Student Ŭ������ �̸����� �����Ѵ��ǹ���
								Student :: getName,
								Collectors.joining(",")			//joining�� �����Ѵٴ� ����.
								
								)
						)		
				);
	}
}
