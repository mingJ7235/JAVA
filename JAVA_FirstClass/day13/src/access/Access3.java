package access;

import day13.Access;

public class Access3 {
	void function() {
		Access a = new Access();
		//�ٸ� ��Ű���� �ִ� Ŭ������ �ҷ����ϱ� import�� ����
		
		System.out.println(a.data2);
		//public�� data2�� ��Ű���� �޶� ������ ������. 
		
		System.out.println(a.getData4());
		int data4 = 0;
		a.setData4(50);
		System.out.println(a.getData4());
		
	}
	
	public static void main(String[] args) {
		Access3 a = new Access3();
		a.function();
	}
}
