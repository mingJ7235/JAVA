package p4_hashCode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//hashmap�� Ű�� �� �ΰ��� �ڷḦ ������ �ִ�. 
		//key �ϳ��� value�ϳ�. pair�� ������ �ִ� ��.
		HashMap<Key, String> hashMap = new HashMap<>();
		hashMap.put(new Key(1), "ȫ�浿");// HashMap�̶�� ���ھȿ� �ڷḦ �ֱ�
		String value1 = hashMap.get(new Key(1)); //���ڿ��� ������ key�� ������ value ���
		System.out.println(value1);
		
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		hashMap.put(k1, "ȫ�浿"); 
		String value2 = hashMap.get(k2); 
		System.out.println(value2);
		
		
	}
}
