package review;

//������, �����, ���� ��üȭ
//�����ڸ� ����ؼ� �ʱ�ȭ �ϱ�
public class Animal {
	int age;
	String sounds;
	String color;
	String name;
	double weight;
	Animal () {
		
	}
	
	public Animal(int age, String sounds, String ����, String name) {
		this.age = age;
		this.sounds = sounds;
		this.color = ����;
		this.name = name;
	}
	
	public Animal(String sounds, String color, String name, double weight) {
		this.sounds = sounds;
		this.color = color;
		this.name = name;
		this.weight = weight;
	}

	void showInfo () {
		System.out.println("�츮 " + name + "��(��) " + color + "�̰� ���̴�" + age + "�� �Դϴ�.\n"
				+ "�츮 " + name + "��(��)"+ sounds + "�ϰ� ��ϴ�.");
	}
	
	
	
	
	public static void main(String[] args) {
		Animal dog = new Animal(3, "\"����\"", "������", "�ǻ�");
		Animal cat = new Animal();
		Animal pig = new Animal();
		
		dog.showInfo();
		
	}
	
	
	
}
