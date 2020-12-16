package sec05.exam01_inpustreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		//��� reader�� ��� �����Ŷ� Reader Ÿ������ ���� ����
		
		int readCharNo;
		char [] cbuf = new char [100];
		
		while ( (readCharNo = reader.read(cbuf)) != -1 ) {
			String data = new String (cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		is.close();
		reader.close();
		
	}
}
