package p2_TireEx_Polymorphism;

public class MichelinTire extends Tire{
	public MichelinTire() { }
	public MichelinTire (String location, int maxRotation) {
		super (location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accuamulatedRotation;
		if (accuamulatedRotation < maxRotation) {
			System.out.println(location + "�̽���Ÿ�̾� ���� : " +
					(maxRotation - accuamulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "�̽���Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
