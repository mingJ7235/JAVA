package day16Review;



public class CarTest {
	public static void main(String[] args) {
		SuperCar superCar = new SuperCar();
		//�⺻�����ڸ� ȣ������ ���� �θ� Ŭ������ �����´�.
		
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 45000, "sport");
		System.out.println(ferrari);
		
		ferrari.engineStart();
		ferrari.engineStop();
		
		//��� Ŭ������ object Ŭ������ ��ӹ޴´�. 
		
	}
}
