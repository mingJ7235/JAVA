package day16Review;

public class SuperCar extends Car{
	String mode;
	public SuperCar() {
		System.out.println("�ڽ�Ŭ������ �⺻ ������");
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super (brand, color, price);
//		setPrice(price);
		//price�� private �����̹Ƿ� super�� ����Ͽ� �ʱ�ȭ�ص��ǰ�, setter�� ����ؼ� �ʱ�ȭ �ص��ȴ�. 
		this.mode = mode;
		//�θ�Ŭ������ ����  mode�� ���� this�� �Ἥ �ʱ�ȭ ��Ų��. 
	}
	

	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}
	
	
	@Override
	public String toString() {
		return "�귣�� : " + this.brand + "\n���� : " + this.color + "\n���� : " + getPrice() + "����";
	}
	
}
