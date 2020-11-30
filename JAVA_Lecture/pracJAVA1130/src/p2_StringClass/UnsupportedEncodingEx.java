package p2_StringClass;

import java.io.UnsupportedEncodingException;

public class UnsupportedEncodingEx {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���.";
		//�⺻���ڼ�
		//2���� �迭�� �ٲ۰��� �ý��� ���Ϸ� ����ų� ��Ʈ��ũ�� ���� �� �����
		byte [] bytes1 = str.getBytes();//���ڵ� 10���� --> 2���� byte[]
		System.out.println(bytes1.length);
		for (byte b : bytes1) {
			System.out.print(b+ " ");
		}
		String str1 = new String(bytes1);//2���� �迭 --> 10����
		System.out.println("\n" +str1);
		
		//�ѱ� �ϼ������� ���ڵ� ���ڵ�
		
		try {
			byte [] bytes2 = str.getBytes("UTF-8");
			System.out.println(bytes2.length);
			for (byte b : bytes2) {
				System.out.print(b+ " ");
			}
			String str2 = new String(bytes2, "UTF-8");//2���� �迭 --> 10����
			System.out.println("\n" +str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
