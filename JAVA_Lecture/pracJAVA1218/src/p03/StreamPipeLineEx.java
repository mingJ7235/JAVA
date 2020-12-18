package p03;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineEx {
	public static void main(String[] args) {
		List <Member> list = Arrays.asList(
					new Member ("ȫ�浿", Member.Male, 30),
					new Member ("�質��", Member.Female, 20),
					new Member ("�ſ��", Member.Male, 45),
					new Member ("�ڼ���", Member.Female, 27)
				);
		
		long maleCount = list.stream().filter(m -> m.getSex() == Member.Male).mapToInt(Member::getAge).count();
		System.out.println("���� �� : " + maleCount);
		long femaleCount = list.stream().filter(m -> m.getSex() == Member.Male).mapToInt(Member::getAge).count();
		System.out.println("���� �� : " + femaleCount);
		double maleAgeAvg = list.stream()
				.filter(m -> m.getSex() == Member.Male)
				.mapToInt(Member::getAge)
				.average().getAsDouble();
		System.out.println("���� ���� ��� : " + maleAgeAvg);
		
	}
}
class Member{
	public static int Male = 0;
	public static int Female = 1;
	private String name;
	private int sex;
	private int age;

	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
