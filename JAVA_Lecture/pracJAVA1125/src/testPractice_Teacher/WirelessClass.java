package testPractice_Teacher;

public class WirelessClass implements WirelessInterface{
	
    @Override
    public int discountRateMethod(int basePrice) {
    	return   (int) (basePrice * 0.1);
    	
    }
    @Override
    public int communicationFeeMethod(int unitPrice, int useTime, int basePrice, int discountRate) {
    	 //�ð���ܰ� * ���ð� + �⺻��� - ���ο��
    	return (int)  (unitPrice * useTime + basePrice -  discountRate);
    }
    public void input(String cN, int uT) {
    	
    }
	public void output() {
		
		
	}
}
