package sec03.exam01_system_in_out;

import java.io.InputStream;

public class SystemInEx01 {
	public static void main(String[] args) throws Exception{
		System.out.println("==�޴�=="
				+ "\n1. ������ȸ"
				+ "\n2. �������"
				+ "\n3. �����Ա�"
				+ "\n4. �����ϱ�");
		System.out.print("�޴��� �����ϼ��� :");
		
		InputStream is = System.in;
		char inputChar = (char) is.read();
		switch(inputChar) {
		
		case '1' :
			System.out.println("������ȸ");
			break;
		case '2' :
			System.out.println("�������");
			break;
		case '3' :
			System.out.println("�����Ա�");
			break;
		case '4' :
			System.out.println("�����ϱ�");
			break;
		
		}
	}
}
