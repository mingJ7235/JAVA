package p3_ApiEx;

public class EqualsAPI_overriding {
	public static void main(String[] args) {
		Person v1 = new Person ("ȫ�浿", 30);
		Person v2 = new Person ("ȫ�浿", 10);
		Person v3 = new Person ("�̼���", 20);
		Person v4 = new Person ("ȫ�浿", 30);
		
		if (v1.equals(v2)) {
			System.out.println("�������");
		}else {
			System.out.println("�ٸ����");
		}
		if (v1.equals(v3)) {
			System.out.println("�������");
		}else {
			System.out.println("�ٸ����");
		}
		if (v1.equals(v4)) {
			System.out.println("�������");
		}else {
			System.out.println("�ٸ����");
		}
	}
}

class Person{
	String name;
	int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (name.equals(p.name) && age == p.age) {
				return true;
			}
		}
		return false;
	}
	
}
