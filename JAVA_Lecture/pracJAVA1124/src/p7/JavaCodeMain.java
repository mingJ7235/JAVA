package p7;

public class JavaCodeMain {
	public static void main(String[] args) {
		//��� ������ü�� ���������� ��üȭ(�ν��Ͻ�ȭ) �ϱ�
		
		MyInterface a = new MyClassA();
		MyInterface b = new MyClassB();
		MyInterface c = new MyClassC();
		MyInterface d = new MyInterface() { //�������̽��� ��üȭ���� ���Ѵ�. �͸�������ü�� ǥ���� ����
		//�������̽��� new �Ҽ� ����! d�� �������̽��� ��üȭ�Ѱ� �ƴϴ�. 
		//�͸�������ü, �� �͸�Ŭ������ ���� ���̴�. 
			@Override
			public void method1() {
				System.out.println("�ν��Ͻ��� �޼ҵ�");
			}
		}; //�͸� ���� ��ü 
		
		a.method1();
		a.method2();
		a.method3();
		System.out.println("======");
		b.method1();
		b.method2();
		b.method3();
		System.out.println("======");
		c.method1();
		c.method2();
		c.method3();
		System.out.println("======");
		d.method1();
		d.method2();
		d.method3();
	}
}