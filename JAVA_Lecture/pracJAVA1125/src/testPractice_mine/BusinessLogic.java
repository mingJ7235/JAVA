package testPractice_mine;

import java.util.Scanner;

public class BusinessLogic {
	Scanner sc = new Scanner(System.in);
	int choice; 
	int cnt = 0;
	GradesManage arData [] = new GradesManage [10]; 
	//view��
	public void view () {
		boolean flag = false;
		while (!flag) {
			System.out.print("��ſ�� ����"
					+ "\n1. �Է�  2. ���  3. ����"
					+ "\n��ȣ �Է� : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1 : 
				insert();
				break;
			case 2 : 
				print(arData);
				break;
			case 3 : 
				System.out.println("���α׷��� �����մϴ�.");
				flag = true;
				break;
			}
			
		}
	}
	
	//�Է�
	public void insert () {
		boolean check = false;
		String yesOrno = "";
		while (!check) {
			System.out.print("���� ������ �Է��մϴ�. "
					+ "\n���� ���� : ");
			String customer = sc.next();
			
			System.out.print("���� ��� : ");
			String grade = sc.next();
			
			System.out.print("���� ���ð� : ");
			int usingTime = sc.nextInt();
			
			if (grade.equals("A") || grade.equals("a")) {
				arData[cnt] = new Agrade(customer, grade, 86, 10000, usingTime);
				cnt++;
			}
			if (grade.equals("B") || grade.equals("b")) {
				arData[cnt] = new Bgrade(customer, grade, 81, 12000, usingTime);
				cnt++;
			}
			if (grade.equals("C") || grade.equals("c")) {
				arData[cnt] = new Cgrade(customer, grade, 104, 15000, usingTime);
				cnt++;
			}
			if (grade.equals("D") || grade.equals("d")) {
				arData[cnt] = new Dgrade(customer, grade, 52, 20000, usingTime);
				cnt++;
			}
			System.out.println("�Է��� �׸��Ͻðڽ��ϱ� ? ( y/n )");
			yesOrno = sc.next();
			if(yesOrno.equals("Y") || yesOrno.equals("y")) {
				System.out.println("�Է��� �׸��մϴ�.");
				check = true;
			}
		}
	}//end insert()
	
	//���
	public void print (GradesManage [] arData) {
		System.out.println("����     ����ڵ�     �ð���ܰ�     �⺻���     �����     ���ð�     ���ο��     �����ſ��");
		for (int i = 0; i < arData.length; i++) {
			if (arData[i] == null) {
				break;
			}else {
				System.out.println(arData[i].customer + "   " + arData[i].grade + "   " + arData[i].pricePerTime + "   " + arData[i].basicPrice +
						"   " + arData[i].usingTime + "    " + arData[i].discountPrice() + "    " + arData[i].totalPrice());
			}
		}
	}

}
