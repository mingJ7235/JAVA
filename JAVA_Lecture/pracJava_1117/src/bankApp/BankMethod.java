package bankApp;

import java.util.Scanner;

public class BankMethod {
	
	String accountNum;
	String name;
	int balance;
	
	public BankMethod(String accountNum, String name, int balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}
	
	//���»���
	void make () {
		Scanner sc = new Scanner(System.in);
		System.out.print("���¹�ȣ : ");
		accountNum = sc.next();
		System.out.print("������ : ");
		name = sc.next();
		System.out.print("�ʱ��Աݾ� : ");
		balance = sc.nextInt();
		
		System.out.println("���°� �����Ǿ����ϴ�.");
	}
	
	//���¸��
	void list () {
		
	}
	
	void deposit () {
		
	}
	
	void withdraw () {
		
	}
	
	void exit () {
		
	}
	
	
}
