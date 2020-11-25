package p1;

import java.util.Scanner;

public class BankApplicationMain {
	Scanner sc = new Scanner(System.in); //���������� ���
	// => 2������ �޼ҵ忡�� �������� �̿��ϱ� ���ؼ�
	BankApplication [] bankAddress = new BankApplication[10];
	static int cnt = 0;
	public BankApplicationMain(int arrayLe) {
		bankAddress = new BankApplication[arrayLe];
	}
	public static void main(String[] args) {
		BankApplicationMain ba = new BankApplicationMain(10);
		int choice;
		boolean flag = true;
		while(flag) {
			ba.headTitle();
			choice = ba.inputChoice();
			switch (choice) {
			case 1 : 
				ba.createBank();
				break;
			case 2 : 
				ba.display();
				break;
			case 3 : 
				ba.deposit();
				break;
			case 4 : 
				ba.withdraw();
				break;
			case 5 : 
				flag = false;
				break;
			}
		}
	}
	
	void deposit() {
		System.out.println("____________________");
		System.out.println("��   ��");
		System.out.println("____________________");
		System.out.print("���¹�ȣ");
		String inputbankNumber ;
		inputbankNumber = sc.next();
		//�ش� ���� ã��
		boolean searchOk = false;
		for (int i = 0; i < cnt; i++) {
			if (inputbankNumber.equals(bankAddress[i].getBankNumber())) {
				System.out.print("���ݾ� : ");
				int money = sc.nextInt();
				bankAddress[i].setMoney(money + bankAddress[i].getMoney());
				searchOk = true;
			}
		}
		if (searchOk) System.out.println("��� : ������ �����߽��ϴ�.");
		else System.out.println("��� : ���¹�ȣ�� Ʋ���ϴ�.");
	}

	void withdraw() {
		System.out.println("____________________");
		System.out.println("��   ��");
		System.out.println("____________________");
		System.out.print("���¹�ȣ");
		String inputbankNumber ;
		inputbankNumber = sc.next();
		
		for (int i = 0; i < cnt; i++) {
			if (inputbankNumber.equals(bankAddress[i].getBankNumber())) {
				System.out.print("��ݾ� : ");
				int money = sc.nextInt();
				if (money > bankAddress[i].getMoney()) {
					System.out.println("�ݾ��� �����մϴ�.");
				}else {
					bankAddress[i].setMoney(bankAddress[i].getMoney() - money);
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				}
			}
		}
	}
	void display() {
		System.out.println("____________________");
		System.out.println("���� ���");
		System.out.println("____________________");
		for (int i = 0; i < cnt; i++) {
			System.out.print(bankAddress [i].getBankNumber()+ "   ");
			System.out.print(bankAddress [i].getBankName()+ "   ");
			System.out.print(bankAddress [i].getMoney()+ "   ");
			System.out.println();
		}
	}

	void createBank() {
		cnt++;
		int i = cnt-1;
		bankAddress [i] = new BankApplication();
		System.out.println("-------------");
		System.out.println("���»���");
		System.out.println("-------------");
		System.out.print("���� ��ȣ : ");
		bankAddress [i].setBankNumber(sc.next());
		System.out.print("������ : ");
		bankAddress [i].setBankName(sc.next());
		System.out.print("�ʱ� �Աݾ� :");
		bankAddress [i].setMoney(sc.nextInt());
		System.out.println("���°� �����Ǿ����ϴ�.");
	}

	//�޴� ����ϴ� �޼ҵ�
	void headTitle () {
		System.out.println("-------------------------------------------------------");
		System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
		System.out.println("-------------------------------------------------------");
		System.out.println("����>");
	}
	
	//�Է� �޴� �޼ҵ�
	int inputChoice () {
		int choice = sc.nextInt();
		return choice;
	}
}
