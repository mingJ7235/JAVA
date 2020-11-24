package testP;

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

public class Test {
	public static void main(String[] args) {
		Car noOptionFerrari = new SuperCar();
		
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
		
		
	}

}
