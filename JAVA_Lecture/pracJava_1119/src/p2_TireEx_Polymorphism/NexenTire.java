package p2_TireEx_Polymorphism;

public class NexenTire extends Tire {
	public NexenTire() { }
	public NexenTire (String location, int maxRotation) {
		super (location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accuamulatedRotation;
		if (accuamulatedRotation < maxRotation) {
			System.out.println(location + "�ؼ�Ÿ�̾� ���� : " +
					(maxRotation - accuamulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "�ؼ�Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
