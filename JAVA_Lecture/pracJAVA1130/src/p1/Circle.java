package p1;

public class Circle implements Cloneable{
	Point p;
	double r;

	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;
		obj = super.clone(); //Object�� clone()�� ȣ���Ѱ���.
		return obj;
	}
	//���� ����
	public Circle shallowCopy () {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Circle)obj;
	}
	//���� ����
	public Circle deepCopy () {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���� �����϶� �ٽ� �ϴ°�.
		Circle c = (Circle) obj;
		//���� ������ �ֱ� �̺κ��� �߿�.
		c.p =new Point(this.p.x, this.p.y);
		return c;
	}
	@Override
	public String toString() {
		return "[p = " + p + ", r = " + r + "]";
	}
}

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
