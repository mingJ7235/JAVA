package P;

import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
	Rank rankArr[] = new Rank [10]; //��޹迭
	Customer customer[] = new Customer[10]; //���迭
	int rankCnt = 0, customerCnt = 0;

	public Business() { //������ �� ��� 4�� �⺻ ����
		rankArr[rankCnt++] = new Rank("A", 86, 10000);
		rankArr[rankCnt++] = new Rank("B", 81, 12000);
		rankArr[rankCnt++] = new Rank("C", 104, 15000);
		rankArr[rankCnt++] = new Rank("D", 52, 20000);
	}

	public int mainMenu() {
		System.out.println("--------------�޴�--------------");
		System.out.println("1.�Է� 2.��� 3.����߰� 4.����");
		System.out.println("--------------------------------");
		System.out.print("���� --> ");
		return sc.nextInt();
	}

	public void input() {
		if(customerCnt == 10) {
			System.out.println("�� ���� �̹� �ִ��Դϴ�.");
			return; //�޼��� Ż��
		}
		System.out.println("--------------�Է�--------------");
		Rank tmpRank = null; //�ӽ� ���
		System.out.print("����: ");
		String name = sc.next();
		System.out.print("����ڵ�: ");
		String rank = sc.next();
		System.out.print("���ð�: ");
		int time = sc.nextInt();

		for (int i = 0; i < rankCnt; i++) {
			if(rankArr[i].rankName.equals(rank)) { //�Է¹��� ����� ���� ��
				tmpRank = rankArr[i];
			}
		}
		if(tmpRank == null) {//��� �߸��Ǿ��� �� �޼��� Ż��
			System.out.println("�Է��Ͻ� ����� �������� �ʽ��ϴ�.");
			return;
		}
		customer[customerCnt++] = new Customer(name, tmpRank, time);
		System.out.println("��ϵǾ����ϴ�.");
	}

	public void output() {
		System.out.println("--------------���--------------");
		System.out.println("����\t����ڵ�\t�ð���ܰ�\t�⺻���\t���ð�\t���ο��\t�̹�����ſ��");
		for (int i = 0; i < customerCnt; i++) {
			Customer cus = customer[i];
			System.out.print(cus.custName+"\t"); //����
			System.out.print(cus.gradeCode+"\t\t"); //����ڵ�
			System.out.print(cus.unitPrice+"\t\t"); //�ð���ܰ�
			System.out.print(cus.basePrice+"\t\t"); //�⺻���
			System.out.print(cus.useTime+"\t\t"); //���ð�
			System.out.print(cus.discountRate()+"\t\t"); //���ο��
			System.out.print(cus.communicationFee()); //�̹�����ſ��
			if(i != (customerCnt-1)) System.out.println();
		}
		System.out.println();
	}
	
	public void addRank() {
		System.out.println("---------����߰�---------");
		System.out.print("�߰��� ����ڵ�: ");
		String rank = sc.next();
		for (int i = 0; i < rankCnt; i++) { //����ڵ� �����ϴ��� Ȯ��
			if(rankArr[i].rankName.equals(rank)) {
				System.out.println("�̹� �����ϴ� ����Դϴ�.");
				return;
			}
		}
		System.out.print("�ð��� �ܰ�: ");
		int timePrice = sc.nextInt();
		System.out.print("�⺻���: ");
		int basicPrice = sc.nextInt();
		rankArr[rankCnt++] = new Rank(rank, timePrice, basicPrice);
		System.out.println("�߰��Ǿ����ϴ�.");
	}
}
