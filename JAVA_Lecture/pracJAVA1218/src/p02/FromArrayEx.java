package p02;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayEx {
	public static void main(String[] args) {
		String [] strArray = {"ȫ�浿", "�ſ��", "��̳�"};
		
		//�迭���� ��Ʈ�� ���
		Stream <String> strStream = Arrays.stream(strArray);
		//�߰���Ʈ��
		strStream.forEach(m -> System.out.println(m));
		
//		strStream.forEach(m -> System.out.println(m)); //��Ʈ���� �ѹ� ��������� ���� �ι��ϸ�ȴ�
		
		
		Stream.of(strArray).forEach(m ->System.out.println(m));
		
		Double [] doubleArr = { 1.1, 2.2, 3.3};
		Arrays.stream(doubleArr).forEach(d ->System.out.println(d));
		long count = Stream.of(doubleArr).count();
		System.out.println(count);
	}
}
