package p2_TireEx_Polymorphism;

public class KumhoTire extends Tire{
	public KumhoTire() { }
	public KumhoTire (String location, int maxRotation) {
		super (location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accuamulatedRotation;
		if (accuamulatedRotation < maxRotation) {
			System.out.println(location + "��ȣŸ�̾� ���� : " +
					(maxRotation - accuamulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "��ȣŸ�̾� ��ũ ***");
			return false;
		}
	}
}
