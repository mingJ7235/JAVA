package day16;

class A {
	int data = 10;
	
	//�⺻������
	public A() {
		System.out.println("�θ� Ŭ���� ������");
		//Ȯ�ο� syso
	}
	
	void show () 	{
		System.out.println("A Ŭ����");
	}
	
}

class B extends A {
	
	public B() {
		System.out.println("�ڽ� Ŭ���� ������");
	}
	
	@Override
	void show() {
		super.show();
		System.out.println("BŬ����");
	}
	//������(override)
	
	void check ()	{
		//AŬ������ show() �޼ҵ带 �����Դ�. 
		show();
	}
	
}

public class InhTest {
	public static void main(String[] args) {
		B instance = new B (); 
		instance.check();
		//�ڽ� �����ڸ� ����ϸ� �θ�Ŭ������ ȣ���Ѵ�.
		//�θ�Ŭ������ ȣ���ϴ� Super()�� �ڵ����� �ִ°��̴�.  
		
	}
	
	
}
