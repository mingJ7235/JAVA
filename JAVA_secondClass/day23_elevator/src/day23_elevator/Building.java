package day23_elevator;

import java.util.Random;
import java.util.Scanner;

public class Building {
	public static void main(String[] args) {
		Elevator e = new Elevator();
		Random r= new Random();
		int cnt = 0;
		int floor = 0;
		String check = "";
		//���������� ����
		int [] arElevator = new int [5];
		
		//�ο����� �������� �� ����. 0�� ~ 5�� 
		cnt = r.nextInt(6);
		for (int i = 0; i < cnt; i++) {
			arElevator [i] = 1;
		}
		
		while (true) {
			//�ִ� : 10��
			//�ּ� : -3��
			//0���� �����ϸ� 14���� �ִ°�. 
			floor = r.nextInt(e.maxFloor + (e.minFloor*-1)+1) + e.minFloor;
			//e.minFloor*-1 ���ִ� ������ ����� ��ƾ��ؼ���. 
			//r.nextInt�ȿ��� 14�� ���� 0~13�� ���´�. 
			//0~13�� -3 �� �ϸ�  -3 ~10 �� ���´�. (������ 0���� ���� ������ 0���� ������ �ؾ��Ѵ�) 
			if (floor != 0) break; 
			//0�� �ƴҶ� ����.
			//while������ ��� �ݺ��� �� �ֵ��� �ϴ°� 0�ϰ�쿡 ��� �ݺ��������ϴ°���
			}
		if (cnt == 0) {
			System.out.println("���� ž�� �ο� : ���� (�ִ�5��)");
		} else {
			System.out.println("���� ž�� �ο� : " +cnt + "�� (�ִ�5��)");
		}
		System.out.println("Y : Ÿ��               N : ������");
		check = new Scanner(System.in).next().toUpperCase();
		//����ڰ� y��n�� �ҹ��ڷ� �Է��� �������� �𸣹Ƿ� toUpperCase() �޼��带 ����Ͽ� ������ �빮�ڷ� �Է¹޵�����.
		if(check.equals("Y")) {
			cnt++;
			try {
				arElevator[cnt-1] =1 ;
				Elevator.floor = floor;
				e.go();
			} catch (Exception e1) {
				System.out.println("�����ʰ�");
			}
		}
		
		
		
		
		
		
		
		
	}
}
