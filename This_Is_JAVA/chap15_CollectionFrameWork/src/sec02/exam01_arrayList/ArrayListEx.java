package sec02.exam01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP"); // 2���ε������� 3���ε����� �ٲ�
		list.add(2, "Database"); //�����̾ƴ�, ���� !
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("�� ��ü�� : " + size + "\n");
		
		String skill = list.get(2);
		System.out.println("2 : " + skill + "\n");
		
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": "+ str);
		}
		System.out.println();
		
		list.remove(2); //2�� �ε����� �����ض� //�����ϸ� �ε����� ������
		list.remove(2);
		list.remove("iBATIS");//��ü ��ü�� ���� 
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": "+ str);
		}
		System.out.println();
		
	}
}
