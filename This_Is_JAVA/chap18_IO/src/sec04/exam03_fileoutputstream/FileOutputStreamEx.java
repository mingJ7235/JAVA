package sec04.exam03_fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {
	public static void main(String[] args) throws Exception{
		//������ �����ϴ� ��
		//��� ������ �� ���簡 �ȴ�. 
		//����Ʈ ������� �̷��� ���� �ϸ��
		String originalFileName = "C:/Users/User/Desktop/GitHub/JAVA/This_Is_JAVA/chap18_IO/src/sec04/exam03_fileoutputstream/house.jpg";
		String targetFileName = "C:/Temp/house.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte [] readBytes = new byte [100];
		while ( (readByteNo = fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		fis.close();
		fos.close();
		
		System.out.println("���簡 �� �Ǿ����ϴ�.");
	}
}
