package day16Review;

class A {
	int data = 10;
	
	public A() {
		System.out.println("�θ� Ŭ���� ������");
	}
	
	void show ()	 {
		System.out.println("AŬ����");
	}
}

class B extends A{
	
	@Override
	//������ 
	void show() {
		System.out.println("BŬ����");
	}
	
	void check ()	{
		show();
	}
	
}

public class InhTest {
	public static void main(String[] args) {
		B instance = new B ()	;
		//B(); ���� �θ� �����ڸ� ȣ���ϴ� super()�� �� �ִ�. 
		instance.check();
	
	}
	
}
