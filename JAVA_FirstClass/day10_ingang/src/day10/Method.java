package day10;

public class Method {
	
	int add(int num1, int num2) {
		System.out.println("add �޼ҵ� �Դϴ�.");
		return num1 + num2;
	}
	
	public static void main(String[] args) {
	//class �ȿ� �޼ҵ带 ��������� �����Ϸ��� �ȴ�. �׷��� �������ִ� ���̴�. 
	Method m = new Method();
	int result = 0;
	result = m.add(3, 8);
	System.out.println(result);
	
	}
}
