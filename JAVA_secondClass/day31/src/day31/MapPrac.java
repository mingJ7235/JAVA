package day31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapPrac {
	Scanner sc = new Scanner(System.in);
	
	public boolean addFruit (HashMap<String, Integer> fruitMap, String fruit, int price) {
		while (true) {
			System.out.println("���� �߰� �Ұ���? �߰��Ϸ��� 1 , �������� 2");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("�Է��Ͻÿ� ���ϸ� ����");
				fruit = sc.next();
				price = sc.nextInt();
				fruitMap.put(fruit, price);
				break;
			case 2 :
				return true;
			default:
				break;
			}
		}
	}
	public static void main(String[] args) {
		MapPrac mp = new MapPrac();
		HashMap<String, Integer> fruitMap = new HashMap<>();
//		Collection<Integer> price = null;
		int price = 0;
		String fruit = "";
		int sum = 0;
		double avg = 0.0;
		if (mp.addFruit(fruitMap, fruit, price)) 
			
		System.out.println(fruitMap.entrySet());
		
		Set<Entry<String, Integer>> setFruit = fruitMap.entrySet();
		Iterator<Entry<String, Integer>> iter = setFruit.iterator();
		while (iter.hasNext()) {
			Entry<String, Integer> e = iter.next();
			System.out.println("���� : " + e.getKey() + "/ ���� : " + e.getValue() + "��");
			sum += e.getValue();
		}
		avg = Double.parseDouble(String.format("%.2f", (double) sum / fruitMap.keySet().size()));
		
		System.out.println("���ϵ� �� ���� " + sum + "������ ��հ��� : " + avg);
		
		
	}
}
