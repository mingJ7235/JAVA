package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
//																					//true�� �ָ� append ��, �����̱Ⱑ �ȴ�. 
//		
		
		//�ٹٲ��� \n�� �ۼ��Ѵ�.
		//bw.newLine() �� �ٹٲ��ϴ� �޼ҵ��̴�. 
		
		
//		//write�޼ҵ�� ����� �޼ҵ��. 
		bw.newLine();
		bw.write("���� \n");
		bw.write(" ¯");
		bw.close();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("test.txt"));
			String line = null;
			int cnt = 0;
			while (true) {
				//readLine()�� �ٹٲ��� �������� �ʴ´�. 
				line = br.readLine();
				cnt ++;
				//�޸����� �������� �� ���� �о���� ģ����. 
				//readLine �޼ҵ�� ���� �� ������ null�� �����Ѵ�. 
				if (line == null) {break;}
				System.out.println(line);
				System.out.println(cnt);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("��ο� ������ �������� �ʽ��ϴ�.");
		} finally {//�ܺ� �������� �����ö� finally�� ����Ѵ�. 
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				//���ܸ� �߻������ִ� �� �Ϻη�. 
				//throw�� ���� ���ܸ� �޸𸮿� �Ҵ��Ű�� ����.
				//�׷��� �� �߻� ���״°�? ������ ����� ���ܸ� �߻����Ѽ� ���α׷��� �����Ű�� ���ؼ�
				//�ݴ� �κп��� ���� �߻��� ������ ���� ���·� ������ �� �ִ�.
				//�޸� ������ ���ܼ� �޸𸮿� Ÿ���� ���� ������ ���� ���� �ϱ� ���� ���ܸ� �߻��� �ش�.
				//�����ڿ� ���ڿ����� �Ѱ��ָ� �ܼ�â�� ��µȴ�. 
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}



















