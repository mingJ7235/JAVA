package p03;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {
	public static void main(String[] args) {
		List <String>names = Arrays.asList("ȫ�浿", "ȫ�浿", "�ſ��", "���ڹ�", "�ſ��", "����");
		
		names.stream().distinct().forEach(n ->System.out.println(n));
		names.stream().filter(n->n.startsWith("��")).forEach(System.out::println);
		names.stream().filter(n->n.endsWith("��")).forEach(System.out::println);
		names.stream().filter(n->n.length() !=3).forEach(System.out::println);
		names.stream().filter(n->n.charAt(1) =='��').forEach(System.out::println);
		names.stream().filter(n->n.contains("��")).forEach(System.out::println);
	
				
	}
}
