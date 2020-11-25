package p2_TireEx_Polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1 ; i <=8 ; i ++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1 : 
				System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire("�� ����", 15);
				//�θ�Ŭ���� �������� = new �ڼ�Ŭ����(); => ����� ������!!!!
				//car.frontLeftTire ������ Tire Ŭ������ ����������. 
				break;
			case 2 : 
				System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
				car.frontRightTire = new KumhoTire("�� ������", 13);
				break;
			case 3 : 
				System.out.println("�� ���� �̽���Ÿ�̾�� ��ü");
				car.backLeftTire = new MichelinTire("�� ����", 18);
				break;
			case 4 : 
				System.out.println("�� ������ �ؼ�Ÿ�̾�� ��ü");
				car.backRightTire = new NexenTire("�� ������", 21);
				break;
			}
			System.out.println("--------------------");
		}
		
	}
}
