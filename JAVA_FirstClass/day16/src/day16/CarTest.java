package day16;

public class CarTest {
	public static void main(String[] args) {
//		Object
		SuperCar supercar = new SuperCar();
		SuperCar ferrari = new SuperCar("ferrari", "Red", 45000, "sport");
		//�ڽ�Ŭ������ �⺻�����ڷ� �ʱ�ȭ������ ���� �θ�Ŭ������ �����ڸ� ���´�. 
		System.out.println(ferrari);
//		System.out.println(ferrari.toString);
		//.toString �� �ּҸ� ����ϴ� object Ŭ������ �޼����.
		//�̰� �������غ���. toString�� ���������ϹǷ� ���� �������� �� ����� ���ְ��Ѵ�.
		//�̰� �����ϳĸ� ��ü �̸��� ������� �� ������ �ּҰ��� �����µ�
		//toString�� �����������Ƿ� (SuperCarŬ��������) ��ü�� ���������
		//��ü�� ������ ���� �� �ִ�. 
		ferrari.engineStart();
		ferrari.engineStop();
	}
}
