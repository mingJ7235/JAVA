package p2_ClassClass;
//Class Ŭ������ final Ŭ������. 
//Class�� �����ڰ� ����. �׳� �ٷ� �޼ҵ带 Ÿ Ŭ������ ���ٰ����ϴ�. 
public class ClassEx01 {
	public static void main(String[] args) {
		Car car = new Car ();
		System.out.println(car.getClass());
		Class cls = car.getClass();
		String name = cls.getName();
		System.out.println(name);
	}
}

class Car{
	@Override
	public String toString() {
		return "Car";
	}
	
	
}
