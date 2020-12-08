package sec05.exam01_treeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx02 {
	public static void main(String[] args) {
		TreeSet <Integer> scores = new TreeSet <>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		//������������ ���ĵ� //������ ��ü���� ����ɶ��� ����Ʈ���� ���������, descendingSet()�� ���� ������������ ���ĵ�
		
		System.out.println("���� ���� ���� (descendingset() ���)");
		for(Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet(); 
		//descendingSet() �޼ҵ�� ���������� �ǹ̰� �ƴ϶�, ������ �ڹٲ۴ٴ� �ǹ���!!!
		//descending()�Ѱ��� �ٽ��ѹ� descending() �ϸ� ���������� �����Ǵ� ���� �ƴ϶� ���������� �ȴ�. ��, ������ ���� 
		System.out.println("���� ���� ���� (descendingset() ���) "); 
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		
	}
}
