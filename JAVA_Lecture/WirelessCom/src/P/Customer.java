package P;

public class Customer extends  WirelessClass{
	
	public Customer(String name, Rank code, int time) {
		this.custName = name;
		this.gradeCode = code.rankName;
		this.unitPrice = code.timePrice;
		this.basePrice = code.price;
		this.useTime = time;
	}

	@Override
	public int communicationFee() { //��ſ��
		return this.unitPrice * this.useTime + this.basePrice - this.discountRate();
	}
	@Override
	public int discountRate() { //���ο��
		return this.basePrice/10;
	}
}
