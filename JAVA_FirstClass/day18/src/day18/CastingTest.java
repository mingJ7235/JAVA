package day18;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {
	}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart ()	{
		System.out.println("����� �õ� Ŵ");
	}
	
	void engineStop ()	{
		System.out.println("����� �õ� ��");
	}
}

class SuperCar extends Car {
	String mode;

	public SuperCar() {
	}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	void changeMode (String newMode) {
		this.mode = newMode;
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
		Car noOptionFerrari = new SuperCar () ;
		
//		noOptionFerrari.engineStart();
		//�ڽĿ��� �����ǵ� ����� ����. ��, �ڽĿ��� ���� ������� ����� ������ �ʴ´�.
		
//		//down casting : ������ !!!�����ϱ��������� �����Ϸ��� ������, �����ϸ� ������ ����. 
//		SuperCar brokenCar = (SuperCar) new Car();
//		//���� ����ȯ ����
//		brokenCar.changeMode("������");
//		//�۵�����... �̰� �ȵ�.. 
		
		Car car = new Car ();
		SuperCar ferrari = new SuperCar();
		
		if (car instanceof Car) {
			System.out.println("nice casting");
			
		}else {
			System.out.println("wrong casting");
			
		}
		
		if (ferrari instanceof Car) {
			System.out.println("nice casting");
			
			//ferrari�� SuperCar Ŭ�����ε�, SuperCar�� Car�� ��ӹ޾����Ƿ� Car Ÿ���̱⵵�ϴ�. 
		}else {
			System.out.println("wrong casting");
		}
		
		if (car instanceof SuperCar) {
			System.out.println("nice casting");
			
		}else {
			System.out.println("wrong casting");
		}
		
		if(noOptionFerrari instanceof Car) {
			System.out.println("nice casting");
			//Ÿ���� Car ������ �ڽĻ����ڸ� ȣ���ߴ�. ������ CarŸ���� �´�. upcasting�� �ص� �ڽĻ����ڿ� �߰��� �ʵ带 ������.
			//�׷��⶧���� CarŸ�Կ��� �������� �ʴ´�. 
		}else {
			System.out.println("wrong casting");
		}
		if (noOptionFerrari instanceof SuperCar) {
			System.out.println("nice casting");
			//SuperCar Ÿ�Ե� �´�. 
		}else {
			System.out.println("wrong casting");
		}
		
		
		
	}
	
	
}
