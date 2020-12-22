package p01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByEx {
	public static void main(String[] args) {
		List<Student> totalList=Arrays.asList(
	            new Student("ȫ�浿", 10, Student.Sex.MALE,Student.City.PUSAN),
	            new Student("�����", 6, Student.Sex.FEMALE,Student.City.SEOUL),
	            new Student("�ſ��", 10, Student.Sex.MALE,Student.City.PUSAN),
	            new Student("�ڼ���", 6, Student.Sex.FEMALE,Student.City.SEOUL),
	            new Student("�ڼ�ȣ", 6, Student.Sex.MALE,Student.City.SEOUL)
	            );
		/*
	      Stream<Student> totalStream = totalList.stream();
	      
	      //Student��ü�� �ԷµǾ Student.City�� ���ϵ� Function<T,K>
	      Function<Student, Student.City> classisfier = Student::getCity;
	      
	      //Student��ü�� �ԷµǾ Student�� name�� ���ϵ� 
	      Function<Student, String> mapper = Student::getName;
	      
	      //�̸��� List�� �����ϴ� Collector�� ��´�.
	      Collector<String, ?, List<String>> collector1 = Collectors.toList();
	      
	      //Collectors�� mapping() �޼ҵ��  Student �̸��� List�� �����ϴ� Collector�� ��´�.
	      //Collector<T,A,D>
	        Collector<Student, ?, List<String>> collector2 = Collectors.mapping(mapper, collector1);
	        
	        //Student.City�� Ű�̰� �׷��ε� �̸� List�� ���� Map�� �����ϴ� Collector�� ��´�
	        Collector<Student, ?, Map<Student.City, List<String>>> collector3 =
	                 Collectors.groupingBy(classisfier,collector2);
	        //T�� K�� �����ϰ�  KŰ�� ����� D��ü�� T�� ������ Map����
	        //Student�� String(���ø�) ���� �����ϰ� ���ø�Ű�� �����  List<String>��ü�� Student�� ������ Map����
	        
	        //Stream�� collect()�޼ҵ�� Student��  Student.City���� �׷����ؼ� Map�� ��´�.
	      Map<Student.City, List<String>> mapByCity = totalStream.collect(collector3);
	      */
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(Collectors.groupingBy(Student::getCity, //�׷��� ���� �� Ű�� ������ִ°�
						Collectors.mapping(Student::getName, Collectors.toList())) //�̰� ���α���, �� List<String>, Value��
						) ; 
	      
	      System.out.println("���￡ ��� ��� �̸� : " + mapByCity.get(Student.City.SEOUL));
	      System.out.println();
	      System.out.println("�λ꿡 ��� ��� �̸� : " + mapByCity.get(Student.City.PUSAN));

	}
}
