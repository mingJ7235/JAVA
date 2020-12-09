package sec02.stream_kind;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {
	public static void main(String[] args) {
		//�迭���� ��Ʈ�������� ��
		String [] strArray = {"ȫ�浿", "�ſ��", "��̳�"};
		Stream<String> strStream = Arrays.stream(strArray); //Arrays.stream(�迭)
		strStream.forEach(a -> System.out.print(a + ", ")); //a�� ��Ҹ� ������. 
		
		System.out.println();
		
		int [] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(i -> System.out.print(i + ", "));
		
	}
}
