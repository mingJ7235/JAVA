package sec05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {
	public static void main(String[] args) throws Exception{
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("C:/Users/User/Desktop/GitHub/JAVA"
				+ "/This_Is_JAVA/chap18_IO/src/sec05/exam03_bufferedinputstream/forest.jpg");
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println("������� �ʾ��� �� �ɸ� �ð� : " + (end - start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("C:/Users/User/Desktop/GitHub/JAVA"
				+ "/This_Is_JAVA/chap18_IO/src/sec05/exam03_bufferedinputstream/forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println("������� �� �ɸ� �ð� : " + (end - start) + "ms");
		fis2.close();
	}
}
