package practice;

public class Agrade extends Customers{
	String grade = "A"; //���
	int pricePerTime = 86; //�ð��� �ܰ�
	int basicPrice = 10000; // �⺻��� 
	
	@Override
	public int FareCal() {
		return (pricePerTime * useTime) + basicPrice - (basicPrice/10);
	}
	
}
