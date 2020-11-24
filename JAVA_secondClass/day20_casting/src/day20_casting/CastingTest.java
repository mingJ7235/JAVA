package day20_casting;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}
	
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart () {
		System.out.println("����� �õ� Ŵ");
	}
	void engineStop () {
		System.out.println("����� �õ� ��");
	}
}

class SuperCar extends Car{
	String mode;

	public SuperCar() {
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	
	void changeMode (String newMode) {
		this.mode =newMode;
		System.out.println("��尡 �ٲ�����ϴ�.");
	}
	
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}
}
public class CastingTest {
	public static void main(String[] args) {
		//upcasting
		Car noOptionFerrari = new SuperCar();
		//�θ�Ÿ������ �ڽ� �����ڸ� ȣ����. 
//		noOptionFerrari.engineStart();
		//�ڽ�Ŭ�������� �����ǵ� �޼ҵ尡 ���ȴ�. 
		//changeMode�� ������. �ֳ��ϸ� �ڽ�Ŭ�������� ���� ����� ���̱� �����̴�. 
		
		//downcasting
		//���� �����ϴ� �Ǽ�
//		SuperCar brokenCar = (SuperCar) new Car();
		//���� ����ȯ. (Ŭ������ Ÿ���̴�.)
		//���������δ� �̻��� ������, ������ ���� �ʴ´�! 
		
		Car car = new Car();
		SuperCar ferrari = new SuperCar();
		
		if (car instanceof Car) {
			System.out.println("nice casting");
		} else {
			System.out.println("err : wrong casting");
		}
		
		if (ferrari instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		if (car instanceof SuperCar) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		if (noOptionFerrari instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		if (noOptionFerrari instanceof SuperCar) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		//noOptionFerrari�� SuperCar Ÿ���̱⵵ �ϴ�. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
