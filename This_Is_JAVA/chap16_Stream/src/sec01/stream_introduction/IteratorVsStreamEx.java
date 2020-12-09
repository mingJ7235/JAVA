package sec01.stream_introduction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamEx {
	public static void main(String[] args) {
		List <String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
		
		//Iterator �ݺ��� �̿��ϴ¹�
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
		
		//Stream �ݺ��� �̿��ϴ¹�
		Stream<String>stream = list.stream();
		stream.forEach(name -> System.out.println(name));
		
	}
}
