package p04_IO;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test1.txt");
		int readByte;
		
		while (true) {
			readByte = is.read(); //1����Ʈ�� �о�´�. �ѱ��̳� Ư�����ڵ� unicode�ڷ�� ������. 
			if (readByte == -1) break;
			System.out.print((char)readByte); //�ƽ�Ű�ڵ�� �ҷ����⶧���� char�� ��ȯ�Ͽ� �̾ƾ��Ѵ�. 
			//�ѱ��� �����⶧���� (2����Ʈ���̶�) �׷��� �迭�� ���������Ѵ�. 
			
		}
		is.close();
	}
}
