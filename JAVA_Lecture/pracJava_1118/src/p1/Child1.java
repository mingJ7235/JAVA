package p1;

public class Child1 extends Parent{
	int z =10; //�ڽ��� ��� �ʵ�
	void childMethod() {
		//super(10,20); ������ ȣ���� �����ڿ����� ����� �Ѵ�. 
		super.x=super.x +20;
		super.y=super.y+30;
		System.out.println("x=" + x + "y=" + y + "z=" + z);
		super.parentMethod();
		//super�� �θ��� �ν��Ͻ� ������� �����ϸ� �ȴ�.
		parentStaticMethod(); //static �̹Ƿ� super�� ���� �����������ʾƵ� ����
		sx = super.x +super.y;
	}
	
	static void staticChildMethod1 () {
		//static�̱⶧����, static �� �θ��� ������ �ö󰡱����� ��, �ν��Ͻ���������
		//�ƹ��� �θ𲨿��� �װͺ��� static�� ���� �ö󰡱� ������ ���� �𸥴�.
//		super.x = super.x + 20;
//		super.y = super.y + 30;
//		super.sx = super.x + super.y;
//		super.sx =100;
		Parent.sx = 100; //super�� �ν��Ͻ��̱� ������ static ���� sx�� ����ϱ� ���ؼ���
		//Ŭ���������� ���� �����ؾ��Ѵ�.
		Parent.parentStaticMethod();
		//super�� �ν��Ͻ���. this�� �ڽ��� �ν��Ͻ�������. super�� �θ��� �ν��Ͻ�������. 
		
	}
	
	
	public Child1() {
		System.out.println("�ڽ��� �⺻ ������");
	}
	public Child1(int x, int y, int z) {
		//super(); //�θ� �⺻������ ȣ��
		//�θ��� �⺻�����ڴ� �ڵ����� ������ �Ȱ���.
		//��, �θ��� �⺻�����ڴ� �ڵ����� �ö󰡱� ������ super()�� �����ص� �������
		super(100, 200);// �θ��� ����� ������
		super.x=x;
		super.y=y;
		this.z=z;
		System.out.println("�ڽ��� ��� ������");
		System.out.println("x=" + x + "y=" + y + "z=" + z);
	}
	static {
		System.out.println("�̰��� �ڽ��� ���� ����Դϴ�.");
	}
	{
		System.out.println("�̰��� �ڽ��� �ν��Ͻ� ����Դϴ�.");
	}
	
}
