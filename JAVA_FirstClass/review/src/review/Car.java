package review;

public class Car {
	int price;
	String color;
	String brand;
	String name;
	
	//������ �����.
	/*
	 * �����ڴ� �޼���� ����� ����.
	 * ������ 1. ���ϰ��� ����.
	 * 2. �׷��Ƿ� ����Ÿ�Ե� ����.
	 * 3. ��Ī�� Ŭ������ () {} �̹Ƿ� ���� �빮�ڴ�.
	 * 4. ������ �ʱ�ȭ�� �ִ�.
	 */
	
	//�⺻������ �ʱ�ȭ.
	//�̸��� ������ �ٸ� �Ű������� ���� ����.
	//overLoading
	Car () {
		
	}
	
	public Car(int price, String color, String brand, String name) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.name = name;
	}
	
	double speedUp (double speed) {
		speed ++;
		return speed;
	}
	double speedDown (double speed) {
		speed --;
		return speed;

	}
	
	void showInfo () {
		System.out.println(this);
		System.out.println("�귣�� : " + brand + "\n���� : " + color + "\n���� : " + price + "����");
	}
	
	public static void main(String[] args) {
		//��üȭ
		//momCar, dadCar���� �ν��Ͻ� ������� �Ѵ�. ��ü����ϰ�.  for instance �� �������. ����.. ��� �ǹ�. Car ��� 
		//Ŭ������() : �⺻������
		//Ŭ������ �����ϸ� �ڵ����� ����Ǵ� ������
		Car momCar = new Car (9000, "Black", "Benz", "������");
		momCar.showInfo();
		Car dadCar = new Car ();
		Car myCar = new Car ();
		
//		momCar.brand = "Benz";
//		momCar.color = "Black";
//		momCar.price = 9000;
//		momCar.showInfo();
//		System.out.println(momCar);
//		System.out.println(dadCar);

		//�����ڴ� �ʱ�ȭ�� ������ �ִ�!!!!!!!
		
		
	}
}
