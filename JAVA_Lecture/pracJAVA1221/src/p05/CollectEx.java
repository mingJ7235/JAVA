package p05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEx {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student ("홍길동", 10, Student.Sex.MALE),
				new Student ("김수애", 6, Student.Sex.FEMALE),
				new Student ("신용권", 10, Student.Sex.MALE),
				new Student ("박수미", 6, Student.Sex.FEMALE)
				);
		
		//남학생들만 묶어서list생성
		
		List<Student> maleList = totalList.stream().filter(n-> n.getSex()==Student.Sex.MALE)
					.collect(Collectors.toList());
		
		
		System.out.println(maleList);
		
		int maleScoreSum = maleList.stream().mapToInt(Student::getScore).sum();
		System.out.println(maleScoreSum);
		
		List <Student> femaleList = totalList.stream().filter(n -> n.getSex() == Student.Sex.FEMALE)
					.collect(Collectors.toList());
		
		List <Student> Seoul =totalList.stream().filter(s -> s.getCity() == Student.City.SEOUL).collect(Collectors.toList());
	
		List <Student> scoreList =totalList.stream().filter(n -> n.getScore()>=8).collect(Collectors.toList());
		scoreList.stream().forEach(System.out :: println);
		
	}
}
