package day09_new;

//Ŭ������ ����
class Human {
	// �ʵ� - ��ü(�ν��Ͻ� ����) , �޼ҵ�
	// �Ʒ��� ����
	
	// ��ü
	int result;
	
	// �޼ҵ�
	void add (int num1, int num2) {
		result = num1 + num2;
		System.out.println(result);
	}
}
public class Monkey {
	public static void main(String[] args) {
		Human h = new Human();
		h.result = 20;
		h.add(30, 40);
		
		
	}
}
