package practice;

public class Cgrade extends Customers{
	String grade = "C"; //���
	int pricePerTime = 104; //�ð��� �ܰ�
	int basicPrice = 15000; // �⺻��� 
	
	@Override
	public int FareCal() {
		return (pricePerTime * useTime) + basicPrice - (basicPrice/10);
	}
}
