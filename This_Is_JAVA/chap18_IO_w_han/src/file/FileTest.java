package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	//throws : ���� ������
	//�ϳ��� �޼ҵ� ������ ������ ���ܰ� ���� �߻��Ѵٸ�
	//���ܰ� �޼ҵ忡 ���� �� ������ �ٽ� �߻��� ������ �����ش�. 
	//
	public static void main(String[] args) throws IOException  {
		//1. ���� ��� : ���ʿ� ó������ ���ۺ��� ���� ��� 
		//			����ֵ� ã�� �� �� �ִ� ���
						// ���� ��ġ�� ������� ã�� �� �� �ִ� ���
		//2. ��� ��� : ������� ���. ���� ��� �ִ����� ���� �޶�����.
						// ���� ��ġ�� ���� ����� ���ϴ� ��� 
		
		//������� �ϰ� �Ǹ� �ܺ� ����Ҹ� ����ϱ� ������ IOException (����� ����) �� �߻��Ѵ�.
		//���� �ݵ�� ���� ó���� ���־�� ����� �����ϴ�.
		
		//�����
//		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		
		//�̾��
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true));
																					//true�� �ָ� append ��, �����̱Ⱑ �ȴ�. 
		
		//write�޼ҵ�� ����� �޼ҵ��. 
		bw.write("�ѵ���");
		bw.close();
	}
}
