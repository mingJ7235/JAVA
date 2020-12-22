package p04_IO;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx02 {
	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test1.txt");
		int readByteNo;
		byte [] readBytes = new byte [20];
		String data = "";
		while (true) {
			readByteNo = is.read(readBytes); //�迭�� ũ�⸸ŭ �о�´�. �� 2����Ʈ�� �о�´�. 
			if (readByteNo == -1) break;
			data += new String (readBytes, 0, readByteNo);
			
		}
		System.out.print(data); 
		is.close();
	}
}
