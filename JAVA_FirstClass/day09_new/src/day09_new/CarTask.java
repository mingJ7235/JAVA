package day09_new;

class Car {
	final int wheel = 4;
	int price;
	String color;
	String brand;
	boolean isOn;
	
	public Car() {;}

	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
	}
	
	boolean engineStart () {
		if(!isOn) {
			return true;
		}
		return false;
	}
	
	boolean engineStop () {
		if(isOn) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return "���� : " + this.price + "\n���� : " + this.color + "\n�귣�� : " + this.brand;  
	}
}


public class CarTask {
	public static void main(String[] args) {
		Car myCar = new Car(5000, "Black", "Benz");
		System.out.println(myCar);
		
		if(myCar.engineStart()) {
			myCar.isOn = true;
			System.out.println("�õ��� �������ϴ�.");
		}else {
			System.out.println("�õ��� �̹� �����ֽ��ϴ�. ");
		}
		
		
		
	}
	
	
	
	
	
}
