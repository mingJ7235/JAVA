package p04_IO;

import java.io.InputStream;

public class ConsoleEx {
	public static void main(String[] args) throws Exception{
		System.out.println("�Է��ϼ��� ==>");
		InputStream is = System.in;
		byte [] datas = new byte [100];
		System.out.print("�̸� : ");
		int nameBytes = is.read(datas);
		System.out.println(nameBytes); //�̸� 'ȫ�浿' �� ������ 8�� ���� ��?  ���Ͱ� �����׷���. ���� 6�̾���Ѵ�
		String name = new String (datas, 0, nameBytes-2); //2�� ������� 
		System.out.println("�Է��� �̸� : " + name);
		
		
	}
}
