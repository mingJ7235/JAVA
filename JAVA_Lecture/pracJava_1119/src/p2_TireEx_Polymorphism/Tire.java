package p2_TireEx_Polymorphism;

public class Tire {
	//�ʵ�
	public int maxRotation;
	public int accuamulatedRotation;
	public String location;
	
	public Tire () {
		
	}

	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	//�޼ҵ�
	public boolean roll () {
		++accuamulatedRotation;
		if (accuamulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + 
		(maxRotation - accuamulatedRotation)	+ "ȸ");
			return true;
		} else {
			System.out.println("***" + location + "Tire ��ũ ***");
			return false;
		}
	}
	
	
}
