package testPractice_Teacher;

public class BGrade extends WirelessClass{
	//�ð��� �ܰ�
		int unitPrice = 81;//�ð��� �ܰ�
		int basePrice = 12000;
		String gradeCode="B";
		int discountRate= discountRateMethod(basePrice);//���ο��
		// TODO Auto-generated constructor stub
		String[] custName = new String[10];//����
		int[]  useTime = new int[10];//���ð�
		int[] communicationFee = new int[10];//�̹�����ſ��
		
	    //�ԷµǴ� �ο���
	    static int cnt=0;
		public void input(String cN, int uT) {
			custName[cnt] = cN;
	        useTime[cnt] = uT;
	        communicationFee[cnt]= communicationFeeMethod(unitPrice, useTime[cnt],basePrice, discountRate );
	        cnt++;
		}
		
		//
		public void output() {
			for(int i=0;i<cnt; i++) {
				System.out.print(custName[i]+ "  ");
				System.out.print(gradeCode+" ");
				System.out.print( unitPrice+" ");
				System.out.print( basePrice+" ");
				System.out.print( useTime[i]+" ");
				System.out.print( discountRate+" ");
				System.out.print( communicationFee[i]);
				System.out.println();
			}
			
			
		}
}

