package sec05.exam04_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		//inputstream�� ����� ������Ʈ���� 2���� ���ں�ȯ, �������
		
		System.out.print("�Է� : ");
		String lineString = br.readLine(); // �� �� ��ü�� �о���
		System.out.println("��� : " + lineString);
		
		
		//��Ʈ�� 3�� ��� Ŭ����
		br.close();
		reader.close();
		is.close();
		
	}
}
