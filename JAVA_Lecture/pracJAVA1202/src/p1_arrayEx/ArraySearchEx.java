package p1_arrayEx;

import java.util.Arrays;

public class ArraySearchEx {
	public static void main(String[] args) {
		//�⺻ Ÿ�԰� �˻�
		int [] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
//		System.out.println("ã�� �ε��� : " + index); //2 �����ϸ� 99�� �ǵڷΰ�
//		System.out.println(scores[index]); //�� ����
		
		int indexError = Arrays.binarySearch(scores, 100);
//		System.out.println("���� �ε��� : " + indexError);
//		System.out.println(scores[indexError]);
		//ã�� �ε����� ������ ������ ���´�.
		
		//���ڿ� �˻�
		String [] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
//		System.out.println("ã�� �ε��� : " + index);
		
		//��ü�˻�
		Member m1 = new Member("ȫ�浿", "123456");
		Member m2 = new Member("�ڵ���", "324241");
		Member m3 = new Member("��μ�", "235352");
		Member [] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, "123456");
		System.out.println("ã�� �ε��� : " + index);
		System.out.println(members[index].name + "  " + members[index].num);
	}
}
class Member implements Comparable<Member>{
	String name;
	String num;
	public Member(String name, String num) {
		this.name = name;
		this.num = num;
	}
	@Override
	public int compareTo(Member o) {
		return num.compareTo(o.num);
	}

	
}
