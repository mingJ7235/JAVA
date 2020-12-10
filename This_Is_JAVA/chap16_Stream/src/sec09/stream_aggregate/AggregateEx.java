package sec09.stream_aggregate;

import java.util.Arrays;
import java.util.OptionalInt;

public class AggregateEx {
	public static void main(String[] args) {
		long count = Arrays.stream(new int [] {1,2,3,4,5})
			.filter(n -> n %2 ==0)
			.count(); //count() ���� Ÿ���� long�̹Ƿ�
		
		System.out.println("2�� ��� ���� : " + count);
		
		int sum = Arrays.stream(new int [] {1,2,3,4,5})
			.filter(n -> n%2 ==0)
			.sum();
		System.out.println("2�� ����� �� : " +sum);
		
		int max =Arrays.stream(new int [] {1,2,3,4,5})
			.filter(n -> n%2 ==0)
			.max()
			.getAsInt();	//optionalIntŸ������ max()�� ���ϵǱ� ������
		System.out.println("�ִ밪 : " + max);
		
		int min =Arrays.stream(new int [] {1,2,3,4,5})
				.filter(n -> n%2 ==0)
				.min()
				.getAsInt();	//optionalIntŸ������ min()�� ���ϵǱ� ������
		System.out.println("�ּҰ� : " + min);
		
		int firstValue = Arrays.stream(new int [] {1,2,3,4,5})
			.filter(n -> n%3 ==0)
			.findFirst()
			.getAsInt();
		System.out.println("3�� ����� ù��° �� : " + firstValue);
	}
}
