package testpractice_wk;

public class WirelessClass implements WirelessInterface{
    String custName;
    String gradeCode;
    int basePrice;//�⺻���
    int timeFee;//�ð��� �ܰ�
    int useTime;//���ð�
    int discountPrice;//���ο��
    int totalFee;




    @Override
    public int discountRate() {
        return discountPrice = (int)(basePrice * 0.1);
    }

    @Override
    public int communicationFee() {
        return totalFee = ((timeFee * useTime) + basePrice) - discountRate();
    }

    WirelessClass(String gradeCode,String custName, int timeFee, int basePrice, int useTime){
        this.gradeCode = gradeCode;
        this.custName = custName;
        this.timeFee = timeFee;
        this.basePrice = basePrice;
        this.useTime = useTime;
    }//end wireClass

}
