package p8_CellphoneFareCalProgram;

import java.util.Scanner;

public class BusinessLogic {
	AGrade ag = null;
	BGrade bg = null;
	CGrade cg = null;
	DGrade dg = null;
	//��� ���� ��ü�� ��üȭ ��Ű��
	public BusinessLogic() {
		ag = new AGrade();
		bg = new BGrade();
		cg = new CGrade();
		dg = new DGrade();
	}
	
	Scanner sc = new Scanner(System.in);
	void start ( ) {
		menuDisplay(); //�޴� ���̰� �ϱ�
	}
	
	void menuDisplay () {
		boolean flag = true;
		int choice =0;
		while (flag) {
			System.out.println("------------------------");
			System.out.println("1. �Է� 2. ��� 3. ����");
			System.out.println("------------------------");
			System.out.print("���� : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: input ();break;
			case 2: /*output ()*/; break;
			case 3 : flag =false; break;
			}
		}
	}//end menuDisplay()
	
	void input () {
		System.out.print("���� : ");
		String customer =  sc.next();
		System.out.print("��� : ");
		String grade = sc.next();
		System.out.print("���ð� : ");
		int useTime = sc.nextInt();
		
		switch (grade) {
		case "A" :
		case "a" : ag.aInput(customer, grade, useTime); break;
		case "B" :
		case "b" :
		case "C" :
		case "c" :
		case "D" :
		case "d" :
		}
		
	}
	
	void output() {
		
	}
	
	
	
}
