package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.tools.FileObject;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileManager.Location;

public class FirleTest2 {
	public static void main(String[] args) throws IOException{
//		BufferedWriter bw = new BufferedWriter (new FileWriter ("food.txt"));
//		
//		
//		bw.write("��ä\n");
//		bw.write("�Ұ��\n");
//		bw.write("����\n");
//		bw.write("�Ľ�Ÿ\n");
//		
//		bw.close();
		
		//CRUD 

		//����
		
		//������ ���ؼ��� �˻縦 �����ؾ��Ѵ�. 
//		BufferedReader br = null;
//		
//		try { //�˻縣 ���ϱ� ���� �о�°��̴�. 
//			br = new BufferedReader(new FileReader("food.txt"));
//			String line = null;
//			String temp = "";
//			boolean check = false;
//			
//			while (true) { //������ ������ ���� ������ ��´�. 
//				line = br.readLine();
//				if (line == null) {break;	}
//				if(line.equals("��ä")) { //�˻��ؼ� ������ ���� ã�´�. 
//					temp +="������\n";
//					check = true;
//					continue; //�����̵Ǹ� �ؿ��κ� �н��� �ϱ����ؼ�  continue�� ���ش�. 
//				}
//				temp += line + "\n"; //��ä�� �ƴѰ�� �̺κ����� �Ѿ�´�. 
//			}
//			
//			if (check) { //������ ���� ���� ����� �Ͷ� 
//				BufferedWriter bw = new BufferedWriter(new FileWriter("food.txt"));
//				bw.write(temp);
//				bw.close();
//			}
//			
//		} catch (Exception e) {
//			System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�.");
//		}finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//			} catch (Exception e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
		
		
		//���� (���ڸ� �����غ���)
//		BufferedReader br = null;
//		
//		try { 
//			br = new BufferedReader(new FileReader("food.txt"));
//			String line = null;
//			String temp = "";
//			boolean check = false;
//			
//			while (true) { 
//				line = br.readLine();
//				if (line == null) {break;	}
//				if(line.equals("����")) { 
//					check = true;
//					continue; 
//				}
//				temp += line + "\n"; 
//			}
//			
//			if (check) { 
//				BufferedWriter bw = new BufferedWriter(new FileWriter("food.txt"));
//				bw.write(temp);
//				bw.close();
//			}
//			
//		} catch (Exception e) {
//			System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�.");
//		}finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//			} catch (Exception e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
//		
		//�˻�
		BufferedReader br = null;
		
		try { 
			br = new BufferedReader(new FileReader("food.txt"));
			String line = null;
			boolean check = false;
			
			while (true) { 
				line = br.readLine();
				if (line == null) {break;	}
				if(line.contains("��")) { 
					check = true;
					System.out.println(line);
				}
			}
			if (!check) {
				System.out.println("�˻� ��� ����");
			}
						
		} catch (Exception e) {
			System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�.");
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}
