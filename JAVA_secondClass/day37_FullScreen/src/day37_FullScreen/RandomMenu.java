package day37_FullScreen;

import java.util.Random;

public class RandomMenu {
	public static void main(String[] args) {
		Random r = new Random();
		String arMenu [] = {"����","�ܹ���","ġŲ","��â","����"};
		int num = r.nextInt(5);
		
		System.out.println("������ ������ ����޴�");
		
		for (int i = 0; i <3; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(3-i);
		}
		System.out.println(arMenu[num]);
	}
}
