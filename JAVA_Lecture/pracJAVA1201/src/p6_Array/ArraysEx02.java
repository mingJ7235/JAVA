package p6_Array;

import java.util.Arrays;

public class ArraysEx02 {
	public static void main(String[] args) {
		int [][] original = {{1,2}, {3,4}};
		System.out.println("���� ����");
		int [][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("�迭 ���� �� : " + original.equals(cloned1)); //equal�� ���� �ּ� �� //false
		System.out.println("1���� �迭 �׸� �� �� : " + Arrays.equals(original, cloned1));//true
		//0���� �ּҺ���, 1���� �ּ� ����
		System.out.println("��ø �迭 �׸� �� �� : " + Arrays.deepEquals(original, cloned1));//true
		//////
		System.out.println("���� ����");
		int [][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2 [0] = Arrays.copyOf(original[0], original.length);
		cloned2 [1] = Arrays.copyOf(original[1], original.length);
		System.out.println("�迭 ���� �� : " + original.equals(cloned2)); //equal�� ���� �ּ� �� //false
		System.out.println("1���� �迭 �׸� �� �� : " + Arrays.equals(original, cloned2));//false << ��������� ������
		//0���� �ּҺ���, 1���� �ּ� ����
		System.out.println("��ø �迭 �׸� �� �� : " + Arrays.deepEquals(original, cloned2));//true
	}
}
