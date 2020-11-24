package day10_new;
class Car {
	//�귣��, ����, ����
	String brand;
	String color;
	int price;
	boolean isOn;
	//�⺻������
	
	public Car() {	}
	//�ʱ�ȭ������
	
	public Car(String brand, String color, int price) {
		super();
		//Car�� ��ӹ����� ���µ� �� super() �� �ִ� ���ϱ�?
		//��� Ŭ������ Object��� Ŭ������ ��ӹ޴´�. Object�� �ֻ��� �θ� Ŭ������.
		//�׷��� ������ �� super()�� Object Ŭ������ �����ڴ�. 
		System.out.println("�θ� ������ ȣ���");
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	//�õ��� ����� Ŵ, �� println���� ����ϱ�
	//�õ��ѱ�
	
	void engineStart() {
		if (!isOn) {
			isOn = true;
			System.out.println("����� �õ�Ŵ");
		}else {
			System.out.println("�õ��� �����ֽ��ϴ�.");
		}
	}
	//�õ�����
	void engineStop() {
		if (isOn) {
			isOn = false;
			System.out.println("����� �õ���");
		}else {
			System.out.println("�õ��� �����ֽ��ϴ�.");
		}
	}
}

class SuperCar extends Car{
	String mode;

		//����Ű !!! alt shift s + o �Ѵ����� ������ invoke Ȯ��.!!! �̰� ��α�
	public SuperCar(String brand, String color, int price, String mode) {
//		System.out.println("�ڽ� ������ ȣ���");
		//�̷��� �ڽ��� �ҽ��ڵ尡 �ö󰡸� ������ ����
		super(brand, color, price);
		System.out.println("�ڽ� ������ ȣ���");
		//�׷��� super �ؿ� ���� ����.
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
		//�θ��� �޼ҵ� ȣ��
		super.engineStart();
		//super�� ��ħǥ�� ������� �θ��. �θ���� ������ ���°��̴�. �������� ���ִ� ���̴�.
		//������ ���� ȣ�����ذ��̴�.
	}	
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}

	void openRoof () {
		System.out.println("�Ѳ� ����");
	}
	
	void closeRoof () {
		System.out.println("�Ѳ� ����");
	}
}
public class Road {
	public static void main(String[] args) {
//		Car myCar = new Car();
		SuperCar ferrari = new SuperCar("Ferrari", "RED", 44000, "Daily");
//		myCar.engineStart();
//		myCar.engineStart();
//		myCar.engineStop();
//		myCar.engineStop();
//		
		//�θ�����ڰ� ������ ���� ȣ��ȴ�. 
		
		ferrari.engineStart();
		ferrari.engineStart();
		
	}
}


