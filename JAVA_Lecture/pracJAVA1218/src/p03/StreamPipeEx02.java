package p03;

import java.util.Arrays;
import java.util.List;

public class StreamPipeEx02 {
	public static void main(String[] args) {
		List <Student> list = Arrays.asList(
					new Student ("1��", 100, 90),
					new Student ("2��", 80, 100),
					new Student ("1��", 70, 50),
					new Student ("2��", 85, 100)
				);
		int korSumC1 = list.stream().filter(m -> m.getClassname().equals("1��")).mapToInt(Student :: getKor).sum();
		int engSumC2 = list.stream().filter(m ->m.getClassname().equals("2��")).mapToInt(Student::getEng).sum();
		System.out.println("1�� �������� �� : " + korSumC1 +"\n2�� �������� �� : " + engSumC2);
		int korSum = list.stream().mapToInt(Student :: getKor).sum();
		int korEng = list.stream().mapToInt(Student :: getEng).sum();
		System.out.println("�������� �� : " + korSum +"\n�������� �� : " + korEng);
		
	}
}

class Student {
	private String classname;
	private int kor;
	private int eng;
	public Student(String classname, int kor, int eng) {
		super();
		this.classname = classname;
		this.kor = kor;
		this.eng = eng;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	
	
}