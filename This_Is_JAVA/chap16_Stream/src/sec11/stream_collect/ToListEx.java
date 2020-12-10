package sec11.stream_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ToListEx {
	public static void main(String[] args) {
		List <Student> totalList = Arrays.asList(
				new Student ("ȫ�浿", 10, Student.Sex.MALE),
				new Student ("�����", 6, Student.Sex.FEMALE),
				new Student ("�ſ��", 10, Student.Sex.MALE),
				new Student ("�ڼ���", 6, Student.Sex.FEMALE)
				);
		
		// ���л��鸸 ���� List ����
		
		List <Student> maleList = totalList.stream()
			.filter(s -> s.getSex()== Student.Sex.MALE)
			.collect(Collectors.toList()); //List Ÿ������ �����ϴ� ����. 
		
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		// ���л��鸸 ��� HashSet���� ����
		
		HashSet <Student> femaleList = totalList.stream()
			.filter(s -> s.getSex() == Student.Sex.FEMALE)
			.collect(Collectors.toCollection(HashSet :: new)); //HashSet�� �����ϵ�����
		
		femaleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		
		
		
	}
}
