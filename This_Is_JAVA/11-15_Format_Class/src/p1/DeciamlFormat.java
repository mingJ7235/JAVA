package p1;

import java.text.DecimalFormat;

public class DeciamlFormat {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num)); //������ ���

		df = new DecimalFormat("0.0"); //�Ǽ� �����ؼ� ��� (
		System.out.println(df.format(num));
		
		df = new DecimalFormat("000000000000.000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#############.###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0"); //���,����
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.#");
		System.out.println(df.format(num));
		
		
	}
}
