package day06_new;

import java.util.Random;
import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		//[�ʱ�]
		//100~1���� �迭�� ��� ����ϱ�
		//1~100���� �� ¦���� �迭�� ��� ����ϱ�
		//1~10���� �迭�� ��� �� �� ���ϱ�
		//1~n ���� �ſ��� ��� �� �� ���ϱ�
		//A~F ���� �迭�� ��� ����ϱ� (�ƽ�Ű)
		//A~F ���� �� C�����ϰ� �迭�� ���� �� ����ϱ�
		
		//[�߱�]
//		aBcDeF....Z �迭�� ��� ����ϱ�
//		int [] arData = new int [26];
//		String result = "";
//		for (int i = 0; i < arData.length; i++) {
//			if ( !(i % 2 == 0)) {
//				arData[i] = (65+ i);
//			}else {
//				arData[i] = (97+ i);
//			}
//			result += (char)arData[i];
//		}
//		System.out.println(result);
		
		//5���� ������ �Է¹ް� �ִ밪�� �ּҰ� ����ϱ�
		
//		Scanner sc = new Scanner(System.in);
//		int [] arData = new int [5];
//		int max = 0;
//		int min = 0;
//		String result = "";		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i +1 + "��° �� ������ �Է��ϼ��� : ");
//			arData[i] = sc.nextInt();
//			result += " " + arData[i];
//		}
//		max = arData [0];
//		min = arData [0];
//		for (int i = 0; i < arData.length; i++) {
//			if (arData[i] > max)
//				max = arData[i];
//			if (arData[i] < min)
//				min = arData[i];
//		}
//		System.out.println("����ڰ� �Է��� �� : " + result + "�߿���"
//				+ "\n�ִ밪�� : " + max + 
//				"\n�ּҰ��� : " + min + 
//				"\n �Դϴ�.");
		
		
//		//���ڿ��� �Է¹ް� �ҹ��ڸ� �빮�ڷ� �ٲٱ�
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("��� �Է����ּ���. (��ҹ��ڹ���)");
//		String inputData = sc.next();
//		String resultData = "";
//		int data = 0;
//		for (int i = 0; i < inputData.length(); i++) {
//			data = (int)(inputData.charAt(i));
//			if (data > 96 && data < 123) {
//				 data -= 32;
//				 resultData += (char)data;
//			}else {
//				resultData += (char)data;
//			}
//		}
//		System.out.println(resultData);
//		
		//����ڰ� �Է��� �� ��ŭ ������ �Է¹ް� �迭�� ���� �� 3�� ����� ����ϱ�
//		Scanner sc = new Scanner(System.in);
//		String mainMsg = "1. �� �Է��ϱ�\n2. �Է��� �� �� 3�� ����� ����ϱ�\n3. ���ݱ��� �Է��� �� ����\n4. ������";
//		String errMsg = "�����Դϴ�. �ٽ� Ȯ�����ּ���";
//		String inputNum = "";
//		int choice = 0;
//		String result = "";
//		while (true) {
//			System.out.println(mainMsg);
//			choice = sc.nextInt();
//			switch(choice) {
//			case 1 :
//				//�����Է�
//				System.out.print("������ �Է����ּ��� : ");
//				int num = sc.nextInt();
//				inputNum += num + ", ";			
//				break;
//			case 2 :
//				//�Է��� �� �� 3�� ����� ����ϱ�
//				if (inputNum.equals("")) {
//					System.out.println(errMsg);
//					break;
//				}
//				for (int i = 0; i < inputNum.split(", ").length; i++) {
//					if (Integer.parseInt(inputNum.split(", ")[i]) % 3 == 0) {
//						result += Integer.parseInt(inputNum.split(", ")[i]);
//					}else {
//						result += "";
//					}
//					System.out.print(result);
//				}
//				System.out.print("�Է��� �� �� 3�� ��� : ");
//				if (result.equals("")) {
//					System.out.println("3�� ����� �����ϴ�.");
//				}else {
//					System.out.println(result);
//				}
//				break;
//			case 3 :
//				//���ݱ��� �Է��� �� ����
//				if (inputNum.equals("")) {
//					System.out.println(errMsg);
//					break;
//				}else {
//					System.out.print("����� �Է��� �� : ");
//					System.out.println(inputNum);
//					break;
//				}
//			default :
//				break;
//			}
//		}
		
		
		//[���]
		//90%Ȯ���� ���� ����ϰ� 10%Ȯ���� ��÷�� ����ϱ� (���� Ȱ��?)
		
//		String lucky ="��÷";
//		String sorry ="��";
//		Random r = new Random();
//		int data = r.nextInt(10);
//		System.out.println(data);
//		if (data == 0) {
//			System.out.println(lucky);
//		}else {
//			System.out.println(sorry);
//			}
//		}

		
		//������ �ѱ۷� �����ϱ� 1024 -> �ϰ��̻�
		
		Scanner sc = new Scanner(System.in);
		String kor = "�����̻�����ĥ�ȱ�";
		System.out.println("������ �ѱ۷� �����ص帳�ϴ�. \n"
				+ "������ �Է����ּ���.");
		String inPutData = sc.next();
		int data = Integer.parseInt(inPutData);
		String result = "";
		
		for (int i = 0; i < inPutData.length(); i++) {
			result += kor.charAt(data % 10);
			data /= 10;
		}
		
		for (int i = inPutData.length()-1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}
		
		//�ѱ��� ������ �����ϱ� �ϰ��̻� -> 1024
		
//		Scanner sc = new Scanner(System.in);
//		
//		String kor = "�����̻�����ĥ�ȱ�";
//		String num = "0123456789";
//		
//		System.out.println("�ѱ��� ������ �����ص帳�ϴ�. \n"
//				+ "�ѱ��� �Է����ּ���. (0�� ������. ���̶�� ���� ����)");
//		String inPutData = sc.next();
//		
//		//�ϰ����
//		
//		for (int i = 0; i < inPutData.length(); i++) {
//			
//			
//		}
//		
		
		
		
		
		
		
		
	}	

}








	
