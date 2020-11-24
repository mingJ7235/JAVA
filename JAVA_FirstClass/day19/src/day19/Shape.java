package day19;

public abstract class Shape {
	double area;
	
	abstract void showArea(double w, double h);
	
	//final �� ���� ���� : �ڽ�Ŭ�������� ������ ���� ���ϰ� ��븸 �ϵ��� �ϱ� ���ؼ�. �޼��忡�� final�� ����� �� �ִ�. 
	final void function ()	{
		System.out.println("�߻� Ŭ������ �Ϲ� �޼��� �Դϴ�.");
	}
}

class Rect extends Shape {

	@Override
	void showArea(double w, double h) {
		area = w*h;
		System.out.println("�簢���� ���� : " + area + "cm��"); 
	}
	
	
}

class Tri extends Shape {
	@Override
	void showArea(double w, double h) {
		area = (w*h) / 2;
		System.out.println("�ﰢ���� ���� : " + area + "cm��"); 
	}
}


