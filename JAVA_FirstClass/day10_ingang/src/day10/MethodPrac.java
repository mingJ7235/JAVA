package day10;

import java.util.concurrent.SynchronousQueue;

public class MethodPrac {
	int add (int num1, int num2){
		System.out.println("���� �޼��� ����.");
		return num1 + num2;
	}
	
	int multi (int num1, int num2) {
		System.out.println("���� �޼��� ����.");
		return num1 * num2;
	}

	public static void main(String[] args) {
		// int result = add (1, 5);
		// �ȵǴ� ����. main �޼��忡 static (������ ���ڸ��� �� �޼��带 ���� ���� �����ض�! ��� ���) �� �پ��ֱ� ������
		// �����Ϸ��� �޼��� �� main ���� ������ �Ѵ�. �׷��� add �޼��弱���� �ν� ����ä main �� �ִ� add (1,5);�� ������ϴ� ��.
		// �����Ϸ� : add �޼��尡����..? �ֳĸ� main ���� �ν��ϴϱ�. 
		// �׷��� 1��° ��� : int �޼��忡 static�� �ٿ��ش�.
		MethodPrac m = new MethodPrac();
		// 2��° ��� : add �޼����� �Ҽ��� �����ش�. MethodPrac�̶�� Ŭ���� �ȿ� �ִ�. => main �޼��忡�� ������ ������Ѵ�.
		int result_add = m.add(5, 7);
		int result_multi = m.multi(6 ,8);
		//Scanner �����Ҷ�ó��. ��.......��¾��. Scanner sc = new Scanner(System.in); �ߴ���ó��...sc.next(); �ߴ� ��ó��..
		System.out.println(result_add);
		System.out.println(result_multi);
	
	}			
}

