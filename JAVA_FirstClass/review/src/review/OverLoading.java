package review;

public class OverLoading {
	/*
	 * �����ε�
	 * - ���� �̸��� �޼���� �Ű������� ���� Ȥ�� Ÿ���� �ٸ��� ���� �����ϴ�. 
	 */
	
	//�������� ���� �޼���
	void add (int num1, int num2){
		int result = 0;
		result = num1 = num2;
		System.out.println(result);
	}
	
	void add (double num1, double num2, double num3) {
		double result = 0.0;
		result = num1 + num2 + num3;
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		OverLoading o = new OverLoading()	;
		
		o.add(10, 20);
		o.add(1.3, 2.6, 35.6);
		
		
	}
}
