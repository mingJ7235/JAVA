package sec02.exam03_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		//ArrayList�� LinkedList�� �ӵ����� ���� ����
		
//		List <String> list1 = new ArrayList<>();
//		List <String> list2 = new LinkedList<>();
//		
//		long startTime;
//		long endTime;
//		
//		startTime = System.nanoTime();
//		for (int i = 0; i < 10000; i++) {
//			list1.add(0, String.valueOf(i));
//		}
//		endTime = System.nanoTime();
//		
//		System.out.println("ArrayList �ɸ� �ð� : " + (endTime-startTime)+ "���� ��(ns)");
//		
//		startTime = System.nanoTime();
//		for (int i = 0; i < 10000; i++) {
//			list2.add(0, String.valueOf(i));
//		}
//		endTime = System.nanoTime();
//		
//		System.out.println("LinkedList �ɸ� �ð� : " + (endTime-startTime)+ "���� ��(ns)");
		
		List <String> list = new LinkedList<>();
		
		list.add("�����");
		list.add("������");
		list.add("����");
		list.add("�̷�");
		list.add("����");
		
		System.out.println(list.get(2));
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println();
		list.remove(2);
		System.out.println(list.get(2));
		for (String name : list) {
			System.out.println(name);
		}
		
		
	}
}
