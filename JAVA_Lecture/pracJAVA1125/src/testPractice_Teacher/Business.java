package testPractice_Teacher;

import java.util.Scanner;

public class Business {
	WirelessClass[] wir = {new AGrade(),new BGrade(), new CGrade(), new DGrade()};
			
   Scanner sc = new Scanner(System.in);
   void start() {
	   menuDisplay();//�޴� ���̰� �ϱ�
   }
   void menuDisplay() {
	   
	   boolean flag = true;
	   int choice=1;
	   while(flag) {
		   System.out.println("-----------------------");
		   System.out.println("1. �Է�    2. ���   3. ����  ");
		   System.out.println("-----------------------");
		   System.out.print("������ ? ");
		   choice = sc.nextInt();
		   switch(choice) {
		      case 1:input();
		             break;
		      case 2:output();
		              break;
		      case 3: flag = false; break;
		   }
	   }
   }//end menuDisplay()
   void input() {
	   System.out.println("����");
	   String custName=sc.next();
	   System.out.println("����ڵ�");
	   String grade=sc.next();
	   System.out.println("���ð�");
	   int useTime=sc.nextInt();
	   switch(grade) {
	   case "a":
	   case "A":  wir[0].input(custName,  useTime); break;
	   case "b":
	   case "B":  wir[1].input(custName, useTime); break;
	   case "c":
	   case "C":  wir[2].input(custName,  useTime); break;
	   case "d":
	   case "D":  wir[3].input(custName,  useTime); break;
	   default : break;
		         
	   }
   }//end input()
   void output() {
	   System.out.println("------------------------------------------------------");
	   System.out.println("���� ����ڵ� �ð���ܰ� �⺻��� ���ð� ���ο�� �̹�����ſ��");
	   System.out.println("------------------------------------------------------");
	   wir[0].output();
	   wir[1].output();
	   wir[2].output();
	   wir[3].output();
	   
   }
}

