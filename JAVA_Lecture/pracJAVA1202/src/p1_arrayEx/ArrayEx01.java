package p1_arrayEx;

import java.util.Arrays;

public class ArrayEx01 {
	public static void main(String[] args) {
		Members m1 = new Members(1, "ȫ�浿", "123");
		Members m2 = new Members(2, "�ڱ浿", "234");
		Members m3 = new Members(3, "��浿", "567");
		Members m4= new Members(4, "���浿", "567");
		Members [] members = {m1,m2,m3,m4};
		Arrays.sort(members);
		
		for (Members m : members) {
			System.out.println(m);
		}
		
		
		
//		int [] scores = {99,98,87,100};
//		double [] avg = {4.5, 1.2, 100, -10.0};
//		String [] stringArr = {"�����", "���", "�ڼ���", "Ȳ����"};
//		for (int  s : scores) {
//			System.out.print(s + "  ");
//		}
//		System.out.println();
//		System.out.println("sort �� ___");
//		Arrays.sort(scores);
//		for (int s : scores) {
//			System.out.print(s + "   ");
//		}
//		
//		Arrays.sort(avg);
//		Arrays.sort(avg);
//		System.out.println();
//		for (double s : avg) {
//			System.out.print(s + "   ");
//		}
//		System.out.println();
//		Arrays.sort(stringArr);
//		for (String s : stringArr) {
//			System.out.print(s + "  ");
//		}
		
	}
}
//���� (���α׷���)�� ������ ������ �����ִ� ���α׷� �ۼ�
class Members implements Comparable<Members> {
	int sno;//��ȣ
	String sname;//ȸ���̸�
	String stel;//��ȭ��ȣ
	
	@Override
	public String toString() {
		return sno + "  " + sname + "   " + stel;
	}
	
	public Members() {

	}
	
	public Members(int sno, String sname, String stel) {
		this.sno = sno;
		this.sname = sname;
		this.stel = stel;
	}

	//�̸� ������� ���ĵ� ��, ������ �����ִ� ����
//	@Override
//	public int compareTo(Member o) {
//		return sname.compareTo(o.sname);
//	}
	
	//��ȭ��ȣ ������ ����
	@Override
	public int compareTo(Members o) {
		return stel.compareTo(o.stel);
	}
	
	
	
	
	
	
	
	
	
}
