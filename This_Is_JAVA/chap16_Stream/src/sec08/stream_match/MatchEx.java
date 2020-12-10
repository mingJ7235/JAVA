package sec08.stream_match;

import java.util.Arrays;

public class MatchEx {
	public static void main(String[] args) {
		int [] intArr = { 2,4,6 };
		
		//allMatch
		boolean result = Arrays.stream(intArr).allMatch(a -> a%2 ==0);
		System.out.println("��� 2�� ����ΰ� ? " + result);
		
		//anyMatch
		result = Arrays.stream(intArr).anyMatch(a -> a%3 ==0);
		System.out.println("3�� ����� �ִ°�? " + result );
		
		//nonMatch
		result = Arrays.stream(intArr).noneMatch(a -> a%5 ==0);
		System.out.println("5�� ����� ���� ���°�? " + result);
	}
}
