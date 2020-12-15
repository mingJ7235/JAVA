package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx02 {
	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo; //read�޼ҵ尡 ���� ����Ʈ ���� ����
		byte [] readBytes = new byte [3]; //read �޼ҵ尡 ���� �����͸� ����
		String data = "";
		while ( (readByteNo = is.read(readBytes)) != -1 ) {
			data += new String (readBytes, 0, readByteNo); //String Ŭ������ ������ �̿�. (�ڷ��ִ°�, ���� �ڷ� �ε���, ���� �ε������� �ڷ��� ��)
		}
		System.out.println(data);
		is.close();
	}
}
