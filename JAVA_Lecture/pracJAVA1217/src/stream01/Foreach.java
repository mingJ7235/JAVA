package stream01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Foreach {
	public static void main(String[] args) {
		//�ݺ���
		List <String> list= Arrays.asList("ȫ�浿", "������", "���ڹ�");
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
		
		List <String> list2 =Arrays.asList("�̼���", "�ְ��");
		
		Stream <String> stream2 =list2.stream(); //��Ʈ�� = ��ü, �귯���� �ڷ� ��� �����ϱ�
		stream2.forEach(name -> System.out.println(name));
		
		
	}
}
