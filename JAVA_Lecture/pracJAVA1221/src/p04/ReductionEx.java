package p04;

import java.util.Arrays;
import java.util.List;

public class ReductionEx {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(  
				new Student ("ȫ�浿", 92),
				new Student ("�ſ��", 95),
				new Student ("���ڹ�", 88)
				);
		
		int sum1 = studentList.stream().mapToInt(Student :: getScore).sum();
		
		int sum2 = studentList.stream().mapToInt(Student::getScore).reduce((a,b) -> a+b).getAsInt();
		int sum3 = studentList.stream().map(Student::getScore).reduce(0, (a,b) -> a+b);
		String name = studentList.stream().map(Student::getName).reduce((a,b) -> a+b).get();
		
		System.out.println(name);
		System.out.println(sum3);
		
		
		//BinaryOperator �߻�޼ҵ� r apply (T t, U u);
	}
}
