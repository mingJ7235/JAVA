package practice;

public class Dgrade extends Customers{
	String grade = "D"; //���
	int pricePerTime = 52; //�ð��� �ܰ�
	int basicPrice = 20000; // �⺻��� 
	
	@Override
	public int FareCal() {
		return (pricePerTime * useTime) + basicPrice - (basicPrice/10);
	}
}
