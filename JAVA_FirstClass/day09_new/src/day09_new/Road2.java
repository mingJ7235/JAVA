package day09_new;

class Car2 {
	String brand;
	String color;
	int price;
	boolean isOn;

	public Car2() {;}

	public Car2(String brand, String color, int price) { 
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//�޼����� ������ ���������� ����ɼ� ������
	//ù ������ ������ �� �޼���� ���̳���. 
	boolean engineStart () {
		if(!isOn) {
			return true;
		}
		return false;
	}
	boolean engintStop() {
		if(isOn) {
			return true;
		}
		return false;
	}
	
}

public class Road2 {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		if (myCar.engineStart()) {
			myCar.isOn = true;
			System.out.println("�õ� ��");
		}else {
			System.out.println("�̹� �õ��� ���� �ֽ��ϴ�. ");
		}
		
		if (myCar.engineStart()) {
			myCar.isOn = false;
			System.out.println("�õ� ��");
		}else {
			System.out.println("�̹� �õ��� ���� �ֽ��ϴ�. ");
		}
		
	}



}
