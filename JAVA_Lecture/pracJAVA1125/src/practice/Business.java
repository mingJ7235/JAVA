package practice;

import java.util.Scanner;

public class Business {
	Agrade a = new Agrade();
	Bgrade b= new Bgrade();
	Cgrade c= new Cgrade();
	Dgrade d = new Dgrade();
	
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	int cnt = 0;
//	Customers [][] arCustomer = null;
	String arCustomers [] = new String [cnt];
	
	void view () {
		boolean check = false;
		while (!check) {
			System.out.print("��Ű��� ���α׷��Դϴ�. "
					+ "\n�޴��� �������ּ���."
					+ "\n1. �Է� 2. ��� 3. ����"
					+ "\n���� : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				input(gradecheck());
				break;
			case 2: 
				
				break;
			case 3: 
				
				break;
			
			}
		}
	}
	
	Customers gradecheck () {
		System.out.println("����� �Է����ּ���");
		Customers cst = new Customers();
		String grade = sc.next();
		if (grade == "A" || grade == "a" ) {
			Agrade a = (Agrade) cst;
			return a;
		}if (grade.equals("B") || grade.equals("b") ) {
			Bgrade b = (Bgrade) cst;
			return b;
		}if (grade.equals("C") || grade.equals("c")) {
			Cgrade c = (Cgrade) cst;
			return c;
		}if (grade.equals("D") || grade.equals("d")) {
			Dgrade d = (Dgrade) cst;
			return d;
		}
		return cst;
	}
	
	void input (Customers cst) {
		if (cst instanceof Agrade) {
			System.out.print("���� : ");
			cst.customer = sc.next();
			System.out.print("���ð� :");
			cst.useTime = sc.nextInt();
			arCustomers[cnt] = cst.customer + "   " + a.grade + "   ";
		}
		cnt++;
	}
	
	void output () {
		for (int i = 0; i < arCustomers.length; i++) {
			System.out.println(arCustomers[i]);
			
		}
	}
	
}
