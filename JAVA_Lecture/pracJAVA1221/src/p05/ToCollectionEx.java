package p05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToCollectionEx {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student ("ȫ�浿", 10, Student.Sex.MALE),
				new Student ("�����", 6, Student.Sex.FEMALE),
				new Student ("�ſ��", 10, Student.Sex.MALE),
				new Student ("�ڼ���", 6, Student.Sex.FEMALE)
				);
		
		//���л��鸸 ���list����
		
		List<Student> maleList = totalList.stream().filter(n-> n.getSex()==Student.Sex.MALE)
					.collect(Collectors.toList());
		System.out.println(maleList);
		
		//���л��� ��� set ����
		Set <Student> femaleSet = totalList.stream().filter(s -> s.getSex() == Student.Sex.FEMALE)
								.collect(Collectors.toCollection(HashSet::new));
		//forEach�� ���
		femaleSet.stream().forEach(s -> System.out.println(s));
		//iterator�� ���
		Iterator<Student> iter = femaleSet.iterator();
		while(iter.hasNext()) {
			Student st = iter.next();
			System.out.println(st.getSex());
		}
			
		
	}
}
