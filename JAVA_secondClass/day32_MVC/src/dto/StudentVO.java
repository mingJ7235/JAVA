package dto;

import dao.Student;

public class StudentVO implements Student{
	private String name;
	private int age;
	private int number;
	private static int seq;
	
	public StudentVO() {;}

	public StudentVO(String name, int age) {
		this.name = name;
		this.age = age;
		this.number = ++seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumber() {
		return number;
	}
	
	public void show () {
		System.out.println("��ȣ : " + this.number + " /�̸� : " + this.name + " /���� : " + age +"��");
	}
}
