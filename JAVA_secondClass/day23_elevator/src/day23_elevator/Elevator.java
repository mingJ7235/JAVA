package day23_elevator;

import java.util.Scanner;

public class Elevator extends Lift{
	
	final int maxFloor = 10;
	final int minFloor = -3;
	
	@Override
	public void up() {
		floor++;
	}

	@Override
	public void down() {
		floor--;
	}

	@Override
	public void start(int choice) {
		if(choice < floor) {
			for (int i = 0; i <= floor-choice+i; i++) {
				//i�� �����ִ� ������ floor�� ���ϱ⶧���� i�� �����༭ ��⸦ ��Ų��. 
				//floor�� �ݺ����� ���� down�� ������ 1�� �����ϰ�, i�� �ݺ��� �Ҽ��� 1�� �����ϹǷ� ��Ⱑ�ȴ�. 
				if (floor!=0) {
					//0���� �����ϱ�!
					System.out.println(floor +"��");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				down();
			}
			stop();
		}else if (choice != floor) {
			//if ���� ���� ����. ������ choice�� floor ���� ������ ������ �ɸ��Ƿ� ���� ���� ���� ���°� �� ȿ�����̴�. 
			//���� if������ �ϳ� �ɷ����� ���°Ŵ�. 
			for (int i = 0; i < choice - floor + i ; i++) {
				if (floor!=0) {
					System.out.println(floor + "��");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				up();
			}
			stop();
		}else {
			System.out.println("���� �� ���� �Ұ�");
		}
	}
	@Override
	public void stop() {
		System.out.println("�ܵ�����");
	}

	@Override
	public void go() {
		int choice = 0;
		String msg = "";
		while (true) {
			//������ �� �Է��Ҷ����� �ݺ��ϰڴٶ�� �ǹ�. �� ������ ��°�
			msg = "������ �Է��ϼ��� (������ : " + floor +"��)";
			System.out.println(msg);
			choice = new Scanner(System.in).nextInt();
			if(choice > maxFloor || choice < minFloor) {
				System.out.println("B3�� ���� 10�������� �����մϴ�.");
			}else {
				break;
				//choice�� �Է��� �� ������� Ż���ؼ� start(choice)�� ����. 
			}
		}
		start(choice);
		
	}

}
