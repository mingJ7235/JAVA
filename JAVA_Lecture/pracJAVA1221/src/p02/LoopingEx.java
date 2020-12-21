package p02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopingEx {
	public static void main(String[] args) {
		int [] intArr = {1,2,3,4,5};
		
		IntStream ins = Arrays.stream(intArr).filter(a -> a%2 ==0)
				.peek(n -> System.out.println(n));
		//peek�� �߰� ó���� 
		
		int s = ins.sum();
		System.out.println("���� : " + s);
		
		
//		double avg = Arrays.stream(intArr).filter(a -> a%2 ==0).average().getAsDouble();
		
		double avg = ins.average().getAsDouble();
		System.out.println("��� : " + avg);
		
		//��Ʈ���� �ѹ� �귯������ �ι��� �� ����. 
		
	}
}
