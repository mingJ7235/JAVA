package p2_TireEx_Polymorphism;

public class HankookTire extends Tire{
	public HankookTire() { }
	public HankookTire (String location, int maxRotation) {
		super (location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accuamulatedRotation;
		if (accuamulatedRotation < maxRotation) {
			System.out.println(location + "�ѱ�Ÿ�̾� ���� : " +
					(maxRotation - accuamulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "�ѱ�Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
