package p1;

public class Parent {
	int x;
	int y;
	
	static int sx;
	static void parentStaticMethod () {
		System.out.println("�θ��� ���� �޼ҵ�");
	}
	
	void parentMethod () {
		System.out.println("x=" + x + "y=" + y);
	}
	
	public Parent() {
		System.out.println("�θ� �⺻ ������");
	}
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("�θ� ��� ������");
		parentMethod();
	}
	static {
		System.out.println("�̰��� �θ��� ���� ����Դϴ�.");
	}
	{
		System.out.println("�̰��� �θ��� �ν��Ͻ� ����Դϴ�.");
	}
}
