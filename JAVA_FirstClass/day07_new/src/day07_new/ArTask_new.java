package day07_new;

import java.util.Random;
import java.util.Scanner;

public class ArTask_new {
	public static void main(String[] args) {
		//[�ʱ�]
		//100~1���� �迭�� ��� ����ϱ�
//		int [] arData = new int [100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 100-i;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//1~100���� �� ¦���� �迭�� ��� ����ϱ�
//		int [] arData = new int [50];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]	= (i+1)*2;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(arData[i] + " ");
//		}
		
		//1~10���� �迭�� ��� �� �� ���ϱ�
//		int [] arData = new int [10];
//		int result = 0;
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//			result += arData[i];
//		}
//		System.out.println(result);
		
		//1~n ���� �迭�� ��� �� �� ���ϱ�
		
//		Scanner sc = new Scanner (System.in);
//		int [] arData =  null;
//		//��ĭ���� �𸣴ϱ� �ּҰ��� �𸣴� null�� �ʱⰪ����
//		int total = 0;
//		System.out.println("1~n������ �� \nn�� : ");
//		arData = new int [sc.nextInt()];
//		// �̰� ��°�� ù��° ���� �ּҰ��̴�. ���̰� ¯�߿�. �ű��ϴ�. �̰� �ٽ�.
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			total += arData[i];
//		}
//		System.out.println(total);
		
		//A~F ���� �迭�� ��� ����ϱ� (�ƽ�Ű)
		//A : 65
		//B : 66 ...
//		char [] arData = new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i) ;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(arData[i]);
//		}
		
		//			�ƽ�Ű	i
		//A	:	65	0
		//B	:	66	1
		//C	:	67	2
		//D	:	68	3
		//E	:	69	4
		//temp�� ��������. for���ȿ��� i�� ������Ű��, �������ȴ�. 
		//�� ��ü�� �ݺ����� ������ i �� ����ϱ⿡, ���� ���Ǹ�, arData[i]�� ���׷�����.
//		//�׷��� �ӽ÷� temp��� ������ �������ְ�, temp�� ���������ذ��̴�.
		
		//A~F ���� �� C�����ϰ� �迭�� ���� �� ����ϱ�
//		char []	arData = new char[5];
//		int temp = 0;
//		for (int i = 0; i < arData.length; i++) {
//			temp = i;
//			if(i > 1) {
//				temp++;
//			}
//			arData [i]	 = (char)(temp+65);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		//A~F ���� �� C�����ϰ� �迭�� ���� �� ����ϱ� (2��° ���)
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1? 66+ i : 65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		//[�߱�]
		//aBcDeF....Z �迭�� ��� ����ϱ�
//		char [] arData = new char [26];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData [i] = (char)(i % 2 == 0 ? 97+i : 65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		//5���� ������ �Է¹ް� �ִ밪�� �ּҰ� ����ϱ�
//		Scanner sc = new Scanner(System.in);
//		int [] arData = new int [5];
//		int max = 0;
//		int min = 0;
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(i+ 1+ "��° ���� : ");
//			arData[i] = sc.nextInt()	;
//		}
//		max = arData[0];
//		min = arData[0];
//		for (int i = 1; i < arData.length; i++) {
//			//3 5 1 6 2
//			if (max < arData[i]) {
//				max = arData[i];
//				}
//			if (min > arData[i]) {
//				min = arData[i];
//				}
//			//�������鼭 0��°�� ��Եǰ�, �̰��� ��� ���ϰԵ�
//		}
//		System.out.println("�ִ밪 : " +max + "�ּҰ� : " + min);
		
		//����ڰ� �Է��� �� ��ŭ ������ �Է¹ް� �迭�� ���� �� 3�� ����� ����ϱ�
//		Scanner sc = new Scanner(System.in);
//		int [] arData = null;
//		
//		System.out.println("�Է��� ������ ���� : ");
//		arData = new int[sc.nextInt()];
//		//����ڰ� �Է��� ���ڸ�ŭ ĭ�� �Ҵ�.
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println( i + 1 + "��° ���� : ");
//			arData[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			if (arData[i] % 3 ==0) {
//				System.out.println(arData[i]);
//			}
//		}

			//���ڿ��� ���� �迭�̴�. ��� ���� �˾ƾ��Ѵ�. String�̶�� Ÿ���� �׷��� ���� ���̴�. 
			//���ڿ��� ���� �迭������, Ŭ�����̶�°��� �˾ƾ��Ѵ�. 
			//�׷��⶧���� �޼��带 ����ϴ°��̴�. �޼���� �����ؾ��Ѵ�. 
		//���ڿ� ���� null�� �ʱ�ȭ�Ҷ����� �Ʒ����� ���Կ����ڸ� ����Ѵٴ� �ǹ��̴�.
		//���ڿ� ���� ""�� �ʱ�ȭ�Ҷ����� �Ʒ����� ���������� ����ϰڴٴ� �ǹ��̴�. 
		//null �̶�� ���� ���̱� ������ ������ �ϸ� null�� ����Ǽ� ���Ǳ� ������
		//�������� �°� �ʱ�ȭ���־���Ѵ�.
		//���ڿ��� �Է¹ް� �ҹ��ڸ� �빮�ڷ� �ٲٱ�
//		Scanner sc = new Scanner(System.in);
//		String str = null;
//		String result = "";
//		System.out.println("���ڿ� : ");
//		
//		str = sc.next();
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if(c >= 97 && c <= 122) {
//				result += (char)(c-32);
//			}else {
//				result += c;
//			}
//		}
//		System.out.println(result);
		//�ҹ���
		// ������ ���. str.charAt(); �̰� ��ü�� ���̴�. 
		//charAt(i) �� �迭���� ������ �ּҿ� ���ִ� ���� �����ϴ� �Ͱ� �Ȱ��� ���ڿ����� �������� �ϴ� �޼����.
		
//		str.toUpperCase());
//		str.toLowerCase());
		//��� ���ڿ����ִ� �ҹ��ڸ� �빮�ڷ�, �빮�ڸ� �ҹ��ڷ� �� �ٲ��ش�. �츮�� �� ������ �����. 
		
		//[���]
		//Ȯ���� ������ 10�̶��, 10ĭ �迭�� �����Ѵ�.
		// ��� 0���� �ʱ�ȭ�� �� ���ϴ� Ȯ�� / 10 ��ŭ 1�� �������ش�.
		//������ �ε��� ��ȣ�� �����Ͽ� ���� ������ ���� ��
		//0�� ������ 100	-	���ϴ� Ȯ��, 
		//1�� ������ ���ϴ� Ȯ���� ������ �ȴ�. 

		
		//new �� �����ؼ� heap�޸𸮿� �Ҵ� ���� ��, 10ĭ���� �����Ⱚ�� ���ִ�. (�����������𸣴ϱ�)
		//�׷��� �ڵ� �ʱ�ȭ�� �Ǿ��ִ�. �׷��� �� �ڵ������� 0�� ���ִ�. 
		//new int[10]; �ϸ�, 0�� �ٵ���ִ�. 
		//new double[10]; �ϸ� 10���� 0.0�� ����ִ�. ����.
		
		
		//90%Ȯ���� ���� ����ϰ� 10%Ȯ���� ��÷�� ����ϱ�
//		int [] arData = new int[10];
//		Random r = new Random();
//		int idx = r.nextInt(arData.length);
//		int rating = 1;
//		//rating �� Ȯ���� �����ϴ� ����. 
//		
//		for (int i = 0; i < rating; i++) {
//			arData[i] = 1; 
//		}
//		System.out.println(arData[idx] == 1? "��÷" : "��");
//				idx�� ���⿡ ����Ͽ���, �̰� ���������� �ִ´�. 
		
		//������ �ѱ۷� �����ϱ� 1024 -> �ϰ��̻�
//	[1]	
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String result = "";
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0;
//		
//		System.out.print("���� : ");
//		num = sc.nextInt();
//		
//		while (num != 0) {
//			result = hangle.charAt(num % 10) + result;
//			// ���������� �ƴ϶� �ڷ� ���̴� ���. ��....
//			num /= 10;
//		}
//		System.out.println(result);
		
//	[2]	
		//������ �ѱ۷� �����ϱ� 1024 -> �ϰ��̻�
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String data = null;
//		String result = "";
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("���� : ");
//		data = sc.nextInt() + "";
//		for (int i = 0; i < data.length(); i++) {
//			result += hangle.charAt(data.charAt(i) - 48);
//		}
//		System.out.println(result);
		//-48�� ������ �ƽ�Ű �ڵ忡��  ����1�� ������ 49�̱� �����̴�. �׷��⿡
		//����1�� �ٲٱ� ���ؼ� -48�� ���ְ�, �̰��� hangle.charAt() �� �ε���(����)�� �־��ִ°��̴�. 
		// �̰� �ѹ� ����غ���. �ٽ� ... 
		
		//�ѱ��� ������ �����ϱ� �ϰ��̻� -> 1024
		Scanner sc = new Scanner(System.in);
		String hangle_org = "�����̻�����ĥ�ȱ�";
		String hangle = null;
		String result = "";
		int total = 0;
		
		System.out.println("�ѱ� : ");
		hangle = sc.next();
		for (int i = 0; i < hangle.length(); i++) {
			int index = hangle_org.indexOf(hangle.charAt(i));
			total += index;
//			System.out.println(index);
//			result += hangle_org.indexOf(hangle.charAt(i));
			//indexOf �� �˻����ִ� �޼���.... 
		}
		System.out.println(total);
		}
	}

