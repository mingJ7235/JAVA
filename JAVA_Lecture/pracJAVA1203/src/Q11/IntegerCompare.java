package Q11;

public class IntegerCompare {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);//true
		
		System.out.println(obj3 == obj4);//false
		
		/*
		 * ���� : Integer Ÿ�Կ��� ���� ������ -128~127�̸� ==�� ���� ����
		 * �׿ܿ��� ������ ���ϱ� �����̴�. (Boxing�� ������ �̷��Եȴ�.)
		 * �׷��� ��κ��� ���� ���Ҷ� equals�� ����ϴ� ���� ����
		 */
	}
}
