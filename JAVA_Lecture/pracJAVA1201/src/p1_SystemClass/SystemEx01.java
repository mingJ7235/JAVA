package p1_SystemClass;

import java.io.InputStream;
import java.io.PrintStream;

public class SystemEx01 {
	public static void main(String[] args) {
		//�ʵ� �⺻���� �׸����
		InputStream is =System.in; //�ܼ� �Է� Ű���� �Է�
		PrintStream ps = System.err; // �ܼ� ���� ����� ����
		PrintStream os = System.out; // �ܼ� ��� ����� ���
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		System.out.println(osName);
		System.out.println(userName);
		long ct = System.currentTimeMillis();
		long nt = System.nanoTime();
		System.gc();
		System.exit(0);
		
	}
}
