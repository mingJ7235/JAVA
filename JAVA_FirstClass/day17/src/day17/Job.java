package day17;

import java.util.Random;

class Person {
	String name;
	int age;
	String gender;
	int money;
	
	public Person() {}

	public Person(String name, int age, String gender, int money) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.money = money;
	}
}

class Teacher extends Person {
	String subject;
	String position;
	int cnt = 0;
	private int income = 10_000_000;
	
	public Teacher(String name, int age, String gender, int money, String position) {
		super(name, age, gender, money);
		this.position = position;
	}
	
	void teach (String subject) {
		cnt ++;
		if (cnt % 10 == 0) income *= 1.1;
		
		this.subject = subject;
		
		money += income;
		System.out.println(name + " " + this.position + "��(��)" + this.subject+ " ��(��) ������");
		System.out.println("�����ܰ� : " + money + "��");
	}
	
}

public class Job {
	public static void main(String[] args) {
		Teacher �ѵ��� = new Teacher("�ѵ���", 20, "����", 0, "����");
		String [] arSub = {"JAVA", "C���", "���̽�"};
		Random r = new Random();
		
		int index = 0;
		index = r.nextInt(3); //0~2������ ������ ��
		//random�� �ð��� ����� �־ 
		
		for (int i = 0; i < 100; i++) {
			�ѵ���.teach(arSub[index]);
//			Thread.sleep(1000);
			//sleep�� ��� �����Ϸ��� ���� ��. 1000�� 1�ʴ�. 
		}
	}
}












