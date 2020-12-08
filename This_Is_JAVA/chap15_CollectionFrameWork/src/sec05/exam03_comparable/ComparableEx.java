package sec05.exam03_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("������", 31));
		
		Iterator <Person> iterator = treeSet.iterator();
		
		while (iterator.hasNext()) { //������ �Ѽ�����, ������ ������ ������ �ٸ���. �� ? compareTo() �޼ҵ�� ��������� �������ϱ�!
			Person person = iterator.next();
			System.out.println(person.name + " : " +person.age);
		}
		
	}
}
