package p02;

import java.util.stream.IntStream;

public class FromRangeEx {
	public static void main(String[] args) {
		IntStream num1  = IntStream.range(1, 100);
		IntStream num2  = IntStream.range(1, 100);
		IntStream num3  = IntStream.range(1, 100);
		int sum = num1.sum();
		double avg = num2.average().getAsDouble();
		
		System.out.println("�հ� : " + sum );
		System.out.println("��� : " + avg );
		num3.forEach(n ->System.out.println(n));
		
		IntStream cnum = IntStream.rangeClosed(1, 100);
		
	}
}
