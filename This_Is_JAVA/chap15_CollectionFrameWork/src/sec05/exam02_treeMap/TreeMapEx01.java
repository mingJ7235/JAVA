package sec05.exam02_treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx01 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<> ();
		scores.put(87, "ȫ�浿");
		scores.put(98, "�̵���");
		scores.put(75, "�ڱ��");
		scores.put(95, "�ſ��");
		scores.put(80, "���ڹ�");
		
		//����Ʈ���� ����� �� key�� �������� �����
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" +entry.getValue() + "\n");
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" +entry.getValue() + "\n");
		
		entry = scores.lowerEntry(95);
		System.out.println("95�� �Ʒ����� : " + entry.getKey() + "-" +entry.getValue() + "\n");
		
		entry = scores.higherEntry(95);
		System.out.println("95�� ���� ���� : " + entry.getKey() + "-" +entry.getValue() + "\n");
		
	}
}
