package examJAVA1126;

import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	int area = 0, time = 0, weight = 0;
	Locations arData [] = new Locations [10];
	int cnt = 0;
	
	public void view () {
		boolean flag = false;
		while (!flag) {
			System.out.println("=======================");
			System.out.println("��� ��Ȳ ���α׷�");
			System.out.println("=======================");
			System.out.println("���α׷��� : �����");
			
			System.out.print("1. �Է� 2. ��� 3. ����"
					+ "\n���� ==> ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1 : 
				insert ();
				break;
			case 2 : 
				print();
				break;
			case 3 : 
				System.out.println("���α׷��� �����մϴ�.");
				flag = true;
				break;
			}
		}
	}
	
	public void insert () {
		System.out.println("=======================");
		System.out.println("�Է�ȭ�� �Դϴ�.");
		System.out.println("=======================");
		
		System.out.print("��� ����\n"
				+ "(1. ��������, 2. �������� 3. �������� 4. ��������) ���� : ");
		area = sc.nextInt();
		
		System.out.print("��� �ð� :");
		time = sc.nextInt();
		
		System.out.print("��޷� ���� : ");
		weight = sc.nextInt();
		
		switch (area) {
		case 1 : 
			arData[cnt] = new Kangdong("��������", "�嵿��", time, weight);
			cnt++;
			break;
		case 2 : 
			arData[cnt] = new Kangseo("��������", "�ڿ���", time, weight);
			cnt++;
			break;
		case 3 : 
			arData[cnt] = new Kangnam("��������", "�̱⿵", time, weight);
			cnt++;
			break;
		case 4 : 
			arData[cnt] = new Kangbuk("��������", "������", time, weight);
			cnt++;
			break;
		}
	}
	
	public void print () {
		System.out.println("=======================");
		System.out.println("���ȭ�� �Դϴ�.");
		System.out.println("=======================");
		System.out.print("�޴��� �������ּ���"
				+ "\n1. �������� 2.������� 3. ����"
				+ "\n���� : ");
		
		choice = sc.nextInt();
		switch (choice) {
		//������ ���
		case 1 :
			System.out.print("��� ���ϴ� ���� (1. ��������, 2. �������� 3. �������� 4. ��������) :");
			choice = sc.nextInt();
			switch (choice) {
			//��������
			case 1: 
				System.out.println("=======");
				System.out.println("��������");
				System.out.println("=======");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				for (int i = 0; i < arData.length; i++) {
					if (arData[i] == null) {
						break;
					}
					if(arData[i].area.equals("��������")) {
						System.out.println(arData[i].deliever + " " + arData[i].time + " " + arData[i].weight + " " + arData[i].totalPayCal());
					}else {
					}
				}
				break;
			//��������
			case 2: 
				System.out.println("=======");
				System.out.println("��������");
				System.out.println("=======");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				for (int i = 0; i < arData.length; i++) {
					if (arData[i] == null) {
						break;
					}
					if(arData[i].area.equals("��������")) {
						System.out.println(arData[i].deliever + " " + arData[i].time + " " + arData[i].weight + " " + arData[i].totalPayCal());
					}else {
					}
				}
				
				break;
			//��������
			case 3: 
				System.out.println("=======");
				System.out.println("��������");
				System.out.println("=======");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				for (int i = 0; i < arData.length; i++) {
					if (arData[i] == null) {
						break;
					}
					if(arData[i].area.equals("��������")) {
						System.out.println(arData[i].deliever + " " + arData[i].time + " " + arData[i].weight + " " + arData[i].totalPayCal());
					}else {
					}
				}
				break;
			//��������
			case 4: 
				System.out.println("=======");
				System.out.println("��������");
				System.out.println("=======");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				for (int i = 0; i < arData.length; i++) {
					if (arData[i] == null) {
						break;
					}
					if(arData[i].area.equals("��������")) {
						System.out.println(arData[i].deliever + " " + arData[i].time + " " + arData[i].weight + " " + arData[i].totalPayCal());
					}else {
					}
				}
				break;
			}
			
			
			break;
		//������� ���
		case 2 :
			System.out.println("=======");
			System.out.println("�������");
			System.out.println("=======");
			System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
			for (int i = 0; i < arData.length; i++) {
				if (arData[i] == null) {
					break;
				} else {
					System.out.println(arData[i].deliever + " " + arData[i].time + " " + arData[i].weight + " " + arData[i].totalPayCal());
				}
				
			}
			break;
		case 3 :
			
			break;
		}
		
	}
	
}
