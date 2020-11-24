package day25_WrapperClass;

public class Wrapper {
	
	public void add (Object a, Object b) {
		//���ڿ��� �ٲ��� �� �������ִ� �޼���
		System.out.println(""+a+b);
	}
	
	public static void main(String[] args) {
		String str = "1";
		//Ŭ�����ε� ��� �ٷ� �ּҰ��� �ƴ϶� ���� �ִ°�? �̰� �ñ����ؾ��Ѵ�. 
		//String str = new String("1"); //������ �̷��� �����Ѵ�. jdk 1.5���� ���ĺ��ʹ� ����ڽ�, �����ڽ��� �����ϴ�. 
		
		
		String str2 = "1"; //���� �ڽ�(Boxing)
		String str3 = new String("1"); //�ڽ�
		
		Integer data = 10; //���� �ڽ� wrapperŬ������ ���� ������ �ڽ�
		int data2 = data; //���� ��ڽ� �⺻��Ÿ���� wrapper Ŭ���� (data�� IntegerŸ���̴ϱ�) �� ������ ��ڽ�. 
		//���� �����̴�. 
		
		/*
		 * �׷��� �� wrapper Ŭ������ �־��°�? 
		 * 1. �⺻�� Ÿ���� ��ü�� �ٷ�� �� ��
		 * 2. �Ű������� ��ü�� �ѱ� ��
		 * 3. �⺻�� Ÿ���� �ƴ� ��ü�� �����ؾ� �� �� 
		 * 4. ��ü���� �񱳰� �ʿ��� ��
		 * 
		 */
		// �⺻�� Ÿ���� ��ü�� �ٷ���� ��
		Object [] arData = {
			new Integer(10),
			new Double(24.9),
			new String("����")
		};
		//Ÿ���� �ٸ� ��ü�� Object Ÿ���� �迭�� ������ ���ϴ�. �̶� �˾ƾ��ϴ°� wrapper Ŭ����.
		
		//�Ű������� ��ü�� �ѱ涧. 
		new Wrapper().add(new String("�����"), new Double(2.5));
		
		
		
		
	}
}
