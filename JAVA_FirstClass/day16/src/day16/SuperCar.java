package day16;

public class SuperCar extends Car{
	String mode;
	
	public SuperCar() {
		System.out.println("�ڽ� Ŭ������ �⺻ ������");
		
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		//�θ�����ڿ��� �̹� this�� �ʱ�ȭ�� ���ѳ����Ƿ�
		//super()�� �ҷ��ͼ� �ʱ�ȭ��Ų �������� �ҷ����⸸ �ϸ�ȴ�.
		//super()�� �θ�Ŭ������ �����ڴ�.
		//�ڽ�Ŭ���� �����ڿ��� ���� ������ super()������ �θ� �����ڷ� ���� �ѱ�°��̴�.
		//�׷��� �θ�����ڷ� �ٽ� �Ѿ�� �ʱ�ȭ�Ǵ°���.
		super(brand, color, price);
		//price�� private �����̱⶧���� setPrice�� ���ٰ����ϴ�.
//		setPrice(price);
		this.mode = mode;
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
		return "�귣�� : " + this.brand + "\n���� : " + color + "\n���� : " + getPrice() + "����";
	}
	

	public static void main(String[] args) {
		SuperCar myCar = new SuperCar();
		
		
		
	}
	
	
}
