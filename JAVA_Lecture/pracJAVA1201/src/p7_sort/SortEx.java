package p7_sort;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		int [] scores = {99,98,87,100};
		double [] avg = {4.5, 1.2, 100, -10.0};
		String [] stringArr = {"�����", "���", "�ڼ���", "Ȳ����"};
		for (int  s : scores) {
			System.out.print(s + "  ");
		}
		System.out.println();
		System.out.println("sort �� ___");
		Arrays.sort(scores);
		for (int s : scores) {
			System.out.print(s + "   ");
		}
		
		Arrays.sort(avg);
		Arrays.sort(avg);
		System.out.println();
		for (double s : avg) {
			System.out.print(s + "   ");
		}
		System.out.println();
		Arrays.sort(stringArr);
		for (String s : stringArr) {
			System.out.print(s + "  ");
		}
		
	}
}
class Member {
	int sno;//��ȣ
	String sname;//ȸ���̸�
	String stel;//��ȭ��ȣ
}
