package sec05.exam01_treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx01 {
	public static void main(String[] args) {
		TreeSet <Integer> scores = new TreeSet <>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		//�����̵ɶ��� �������� ���������, ������ �� �� ����Ʈ���� �����ϸ鼭 �����
		Integer score = null;
		
		score = scores.first(); //����Ʈ������ ���� ���ʿ� �ִ� ��ü�� ��´�. ��, ���� ���� ����
		System.out.println("���� ���� ���� : " + score);
		
		score = scores.last(); //����Ʈ������ ���� �����ʿ� �ִ� ��ü�� ��´�. ��, ���� ū��
		System.out.println("���� ���� ���� : " + score + "\n");
		
		score = scores.lower(95); //lower()�޼ҵ�� �Ű������� �ٷ� ���� �ִ� ���� ���� �����Ѵ�. �ϳ� ���� ��
		System.out.println("95�� �Ʒ��� �� : " + score);
		
		score = scores.higher(95); //higher() �޼ҵ�� �Ű����� �ٷ� ������ �ִ� ���� ���� �����Ѵ�. �ϳ����� ��
		System.out.println("95�� ���� �� :" +score);
		
		score = scores.floor(95); //95�� �ִٸ� 95�� ������. 95�� ���ٸ�, 95���� �Ʒ��� ���� ����. ��, floor�� ����! lower�� �̸�!
		System.out.println("95�� �̰ų� �ٷ� �Ʒ����� : " + score);
		
		score = scores.ceiling(85); //85���ִٸ� 85����, 85�� ���ٸ�, 85���� ���ǰ��� ����, �� ceiling�� �̻�! higher()�� �ʰ�!
		System.out.println("85�� �̰ų� �ٷ� ���� ���� : " + score);
		
//		while (!scores.isEmpty()) {
//			score = scores.pollFirst(); //����Ʈ������ ���� ���� ���� ��ü�� ���� ����. �� treeset���� ������ ��. ���� ���� �ڽ� ��ü ������ ����
//														//������ treeset���� ���Ű� ��. !! iterator�� ����! iterator�� ���������ʰ� �������⸸�� 
//			System.out.println(score + "(���� ��ü�� : " + scores.size() + ")" + "���� ��ü : " +scores);
//			
//		} 
		
		while (!scores.isEmpty()) {
		score = scores.pollLast(); //����Ʈ������ ���� ������ ���� ��ü�� ���� ����. �� treeset���� ������ ��. ���� ������ �ڽ� ��ü ������ ����
													//������ treeset���� ���Ű� ��. !! iterator�� ����! iterator�� ���������ʰ� �������⸸�� 
		System.out.println(score + "(���� ��ü�� : " + scores.size() + ")" + "���� ��ü : " +scores);
		
	} 
		
		
//		Iterator <Integer> iterator = scores.iterator();
//		while (iterator.hasNext()) {
//			int s = iterator.next();
//			iterator.remove(); //iterator�� �����ϱ����ؼ��� remove�� ������Ѵ�.
//			System.out.println(s + "(���� ��ü�� : " + scores.size() + ")" + "���� ��ü : " +scores);
//		}
	}
}
