package practice;

public class Bgrade extends Customers{
	String grade = "B"; //���
	int pricePerTime = 81; //�ð��� �ܰ�
	int basicPrice = 12000; // �⺻��� 
	
	@Override
	public int FareCal() {
		return (pricePerTime * useTime) + basicPrice - (basicPrice/10);
	}
}
