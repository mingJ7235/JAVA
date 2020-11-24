package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("O");
		set.add("B");
		set.add("AB");
		set.add("C");
		set.add("A");
		set.add("A");
//		set.add("AA");
		set.add("A");
		set.add("A");
		set.add("A");
		System.out.println("�� �� : " + set.size());
		System.out.println(set);
		
		
		//size�� 4��. ��? set�� �ߺ��� �ȵǴϱ�! A�� �ƹ��� �־!
		//�̰͵� toString�� �������ؼ� set������ص� ���� (���ĺ������� ���ĵǵ��� �������س���)

		//�ݺ��� : Iterator : �ݺ��ؼ� ���� ������� ���� �� ����Ѵ�.
		//Iterator�� Set�� ������ �ο����ش�. (���Ǵ�� ������ �ο���)
		
		//hasNest() : Ȥ�� �� �ڿ� ���� �ִ��� �������� Ȯ����. 
		//���� ��������ŭ �ݺ��ϼ�! �ڿ� ���� ������ false�� �Ǽ� �ݺ����� Ż����

		//iter�� �ٽ� �־����iterator() ����Ͽ� ���� ������ �� �ִ�. 
		
		
		Iterator<String> iter = set.iterator();
		System.out.println("�׽�Ʈ��");
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println("�׽�Ʈ��");
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		
		
		
		set.remove("AB");
		System.out.println(set.size());
		System.out.println(set);
		
		set.add("AB");
		System.out.println(set);
		System.out.println(iter.next());
		
		iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}
	
}

