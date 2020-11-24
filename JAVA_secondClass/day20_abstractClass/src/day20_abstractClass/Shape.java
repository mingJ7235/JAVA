package day20_abstractClass;

public abstract class Shape {
	double area;
	
	public abstract void draw (double w, double h);
	//���� ���� (�ٵ� ����) �޼���

	//������ �� �� ���� ����� ��. 
	final static void function () {
		System.out.println("�߻� Ŭ������ �Ϲ� �޼��� �Դϴ�.");
	}
}

class Rect extends Shape {
	@Override
	public void draw(double w, double h) {
		System.out.println("���簢�� �� 4�� ����");
		area = w*h;
		System.out.println("���� :  " + area);
	}
}

class Tri extends Shape{
	@Override
	public void draw(double w, double h) {
		System.out.println("�ﰢ�� �� 3�� ����");
		area = w*h*0.5;
		System.out.println("���� :  " + area);
	}
}
