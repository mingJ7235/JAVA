package day17;

import java.util.Scanner;

class Animal{
	String name;
	int age;
	String feed;
	
	public Animal() {}
	
	public Animal(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	

	@Override
	public String toString() {
		return "�̸� : " + name + "\n���� : " + age + "\n���� : " + feed;
	}
}


public class ArInstance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal [] arAni = new Animal[3];
		
		for (int i = 0; i < arAni.length; i++) {
			arAni [i] = new Animal();
			//�Ź� �̷��� �ʱ�ȭ�� ��������Ѵ�. heap �޸𸮿� �־����
			//�ʱ�ȭ�� ������� ���� ���� ���� �� �ִ� ��������� ��������� ���̴�. 
			
			System.out.println(i+1+ "�� ���� �̸� : ");
			arAni[i].name = sc.next();
			System.out.println(arAni[i].name + " ���� : " );
			arAni[i].age = sc.nextInt();
			System.out.println(arAni[i].name + " ���� : ");
			arAni[i].feed = sc.next();
		}
		
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(arAni[i]);
		}
		
		
		
	}
}
