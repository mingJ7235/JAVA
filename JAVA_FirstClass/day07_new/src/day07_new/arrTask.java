package day07_new;

import java.util.Scanner;

public class arrTask {
	public static void main(String[] args) {
		/*
		 * �ڽ� ����
		 * 				������ ȫ���� ������
		 * �Ϲ���
		 * Ű����
		 * 
		 * �� ������ �� �����, ��� �����
		 * �� ���ɺ� �� �����, ��� �����
		 * �ڽ� �� �����, ��� �����
		 * 
		 * �ڽ� ��� ����� ���� ���� ����� ������ �μ�Ƽ�� �������� ���
		 */
		Scanner sc = new Scanner(System.in);
		String [][] arrDAKS = {
				{"���� - �Ϲ���", "ȫ�� - �Ϲ���", "����- �Ϲ���"},
				{"���� - Ű����", "ȫ�� - Ű����", "����- Ű����"},
		};
		String q_msg = null;
		String n_income = "";
		String k_income = "";
		
		int num_shops = arrDAKS.length * arrDAKS[0].length;
		int n_sum = 0;
		int k_sum = 0; 
		int t_sum = 0;
		
		double n_avg = 0.0;
		double k_avg = 0.0;
		double t_avg = 0.0;
				
		int [][] arrIncome = new int [arrDAKS.length][arrDAKS[0].length];
		int [] arNormalIncome = new int [arrDAKS[0].length];
		int [] arKidsIncome = new int [arrDAKS[0].length];
		
		for (int i = 0; i < arrDAKS.length; i++) {
			for (int j = 0; j < arrDAKS[i].length; j++) {
				q_msg = arrDAKS [i][j] + " �� ������� �����ּ��� (������ ����) : ";
				System.out.print(q_msg);
				if (i == 0) {
					arNormalIncome[j] = sc.nextInt();
				}
				if (i == 1) {
					arKidsIncome[j] = sc.nextInt();
				}
			}
		}
		
		for (int i = 0; i < arrDAKS.length; i++) {
			for (int j = 0; j < arrDAKS[i].length; j++) {
				if (i == 0) {
					arrIncome[0][j] = arNormalIncome[j];
				}
				if (i == 1) {
					arrIncome[1][j] = arKidsIncome[j];
				}
			}
		}
		
		//�Ϲ��� �����
		System.out.println("DAKS �Ϲ��� �����");
		for (int i = 0; i < arNormalIncome.length; i++) {
			n_income += arrDAKS[0][i] + "�� ����� : " +  arNormalIncome[i] + "����\n";
		}
		System.out.println(n_income);
		
		//�Ϲ��� �� �����
		System.out.println("DAKS �Ϲ��� �� �����");
		for (int i = 0; i < arNormalIncome.length; i++) {
			n_sum += arNormalIncome[i];
		}
		System.out.println("�Ϲ��� �� ����� : " +  n_sum + "����");
		
		//�Ϲ��� ��� �����
		System.out.println("DAKS �Ϲ��� ��� �����");
		for (int i = 0; i < arNormalIncome.length; i++) {
			n_avg = Double.parseDouble(String.format("%.2f", (double)n_sum / arNormalIncome.length));
		}
		System.out.println("�Ϲ��� ��� ����� : " +  n_avg + "����");
				
		//Ű���� �����
		System.out.println("DAKS Ű���� �����\n");
		for (int i = 0; i < arKidsIncome.length; i++) {
			k_income += arrDAKS[1][i] + "�� ����� : " +  arKidsIncome[i] + "����\n";
		}
		System.out.println(k_income);
		
		//Ű���� �� �����
		System.out.println("DAKS Ű���� �� �����");
		for (int i = 0; i < arKidsIncome.length; i++) {
			k_sum += arKidsIncome[i];
		}
		System.out.println("Ű���� �� ����� : " +  k_sum + "����");
		
		//Ű���� ��� �����
		System.out.println("DAKS Ű���� ��� �����");
		for (int i = 0; i < arKidsIncome.length; i++) {
			k_avg = Double.parseDouble(String.format("%.2f", (double)k_sum / arKidsIncome.length));
		}
		System.out.println("Ű���� ��� ����� : " +  k_avg + "����");
		
		
		//�ڽ� �� �����, ��� �����
		
		t_sum = n_sum + k_sum;
		t_avg =  Double.parseDouble(String.format("%.2f", (double)t_sum / num_shops));
				
		System.out.println("DAKS �� ����� : " + t_sum + "����");
		System.out.println("DAKS ��� ����� : " + t_avg + "����");
		
		//�μ�Ƽ�� ����
		for (int i = 0; i < arrDAKS.length; i++) {
			for (int j = 0; j < arrDAKS[i].length; j++) {
				if(arrIncome[i][j] > t_avg) {
					System.out.println(arrDAKS[i][j] + "�� ��������Դϴ�!");
				}
			}
		}
	}
}
