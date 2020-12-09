package sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;

import sec02.stream_kind.Student;

public class MapEx {
	public static void main(String[] args) {
		List <Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
		);
		
		studentList.stream()
			.mapToInt(s-> s.getScore())
			.forEach(score -> System.out.println(score));;
			
		
	}
}
