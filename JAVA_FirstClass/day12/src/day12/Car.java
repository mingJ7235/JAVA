package day12;

public class Car {
	int price;
	String color;
	String brand;
	//Overloading
	//�̰� �����ڴ�. Car(){}
	Car(){}
	
	//�����ڴ� �޼���� ���⶧���� �ܺο��� �Ű��������� �޾ƿ��°Ŵ�.
	//Car ������ �Ű����� �ȿ��ִ°� ����������. 
	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
	}
	
	double speedUp(double speed){
		speed++;
		return speed;
		
	}
	double speedDown (double speed){
		speed--;
		return speed;
		
	}
	void showInfo() {
		//�� �ּҿ� �ִ�.. this. �� ã�ư��� .
		System.out.println(this);
		System.out.println("�귣�� : " + brand + "\n���� : " + color + "\n���� : " + price + " ����");
	}
	
	public static void main(String[] args) {
		//��üȭ
		//momcar�� ������ �ν��Ͻ� ���� (��ü) ��� �Ѵ�. (instance : ��ü!! ��� �޾Ƶ��̸��. ����!!. ������� ������ �����ϱ����ϴϱ�..) ��� �ǹ���. 
		//��, �ν��Ͻ� ������� ���� �������, �� ��ǥ�Ѵ� ��� �ǹ̶�� �޾Ƶ��̸� �ɵ�
		
		//Ŭ������ () : �⺻ ������ => Ŭ������ �����ϸ� �ڵ����� ����Ǵ� ������. Car��� Ŭ������ ��������� Car(); �����ڰ� �ڵ������� ����ȴ�.(�����ȴ�)
		//�츮�� ���Ƿ� �����ڸ� �����ϸ� �� ���Ƿ� ������ �����ڰ� �⺻�����ڰ��ȴ�. 
		//�����ڴ� ����Ÿ���� ���� �޼���. �޼������ �ٸ���!! 
		//�����ڴ� �ʱ�ȭ�� ������ �ִ�. Ŭ������() �� ���´�.
		//�޼���� ���� ����� ������ ������, ������ ������, ����Ÿ�Ե� ����.
		//���� �޼����� �θ��� �ʴ´�. !!!! 
		
		Car momcar = new Car(9000,"Black","Benz");
		momcar.showInfo();
		Car dadcar = new Car();
		Car mycar = new Car();
		
//		momcar.brand = "Benz";
//		momcar.color = "Black";
//		momcar.price = 9000;
//		momcar.showInfo();
//		System.out.println(momcar);
//		
//		momcar.brand = "Hyundai";
//		momcar.color = "white";
//		momcar.price = 6700;
//		dadcar.showInfo();
//		
		
	}
}

