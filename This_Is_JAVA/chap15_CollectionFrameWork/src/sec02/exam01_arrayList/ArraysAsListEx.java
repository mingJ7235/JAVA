package sec02.exam01_arrayList;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {
	public static void main(String[] args) {
		//��ü�� �����Ǿ� ���� ��� �̷��� ����ϴ°� ������
		List <String> list1 = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
		for (String name : list1) {
			System.out.println(name);
		}
		
		List <Integer> list2 = Arrays.asList(1, 2, 3);
//		List <Integer> list2 = Arrays.asList(new Integer(1), new Integer(2), new Integer(3));
		//�̰� ���������� ������. �ڵ� �ڽ��� �̿�����
		for (int num : list2) {
			System.out.println(num);
		}
		
	}
}
