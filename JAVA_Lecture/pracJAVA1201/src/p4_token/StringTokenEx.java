package p4_token;

import java.util.StringTokenizer;

public class StringTokenEx {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		StringTokenizer st1 = new StringTokenizer(text, ";"); //�����ڰ� ������ ��ū�� �׳� ���ڿ� ��ü �ѵ���� ��
		StringTokenizer st2 = new StringTokenizer(text, "/"); //
		int count1 = st1.countTokens();
		System.out.println("��ū�� ���� " + count1);
		int count2 = st2.countTokens();
		System.out.println("��ū�� ���� " + count2);
		
//		for (int i = 0; i < count2; i++) {
//			String tokenValue = st2.nextToken();
//			boolean hmt = st2.hasMoreTokens();
//			System.out.println("�����ִ� ��ū�� ������ true, ������ false : "+hmt);
//			System.out.println(tokenValue);
//		}
		while (st2.hasMoreTokens()) {
			String tokenValue = st2.nextToken();
			System.out.println(tokenValue);
		}
		
		//StringTokenizer�� �����ڰ� 
	}
}
