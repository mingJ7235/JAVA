package sec07.stream_looping;

import java.util.Arrays;

public class LoopingEx {
	public static void main(String[] args) {
		int [] intArr = {1,2,3,4,5};
		
		System.out.println("[peek()]�� �������� ȣ���� ���");
		Arrays.stream(intArr)
			.filter(a -> a%2 == 0)
			.peek(a -> System.out.println(a));
		//�߰� ó�� �޼ҵ��̹Ƿ�, ����ó�� �޼ҵ尡 ������ �������� ����. ! 
		System.out.println();
		
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(a -> System.out.println(a))
		.forEach(a -> System.out.println(a)); //forEach ������ �����Ƿ� peek�� �۵��ؼ� 2���� ����
		System.out.println();
		
		int total  = Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(a -> System.out.println(a))
		.sum();
		
		System.out.println("���� : " + total);
		//peek �� �����ϰ�, sum�� ���� total�� �����. 
		
	}
}
