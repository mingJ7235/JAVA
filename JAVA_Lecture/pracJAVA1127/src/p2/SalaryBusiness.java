package p2;

import java.util.Scanner;

public class SalaryBusiness {
	String serial = null;
	int salary;
	public void input () {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޿��� �Է����ּ���");
		salary = sc.nextInt();
		System.out.print("����� �Է����ּ���");
		serial = sc.next();
	}
	public void check () throws SalaryException,SabunException{
		if (salary <0) {
			throw new SalaryException("�޿��� ������ �� �� �����ϴ�.");
		}if(serial == null) {
			throw new SabunException("����� �ʼ� �Է��Դϴ�.");
		}
	}
}
