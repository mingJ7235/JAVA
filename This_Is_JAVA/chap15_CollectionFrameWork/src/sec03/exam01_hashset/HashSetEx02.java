package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx02 {
	public static void main(String[] args) {
		Set <Member> set = new HashSet <Member> ();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		//new�� ����߱⿡, �ٸ� ��ü��. ������, �̸������̰� ����. (MemberŬ�������� equal�� hashcode�� �����������Ƿ�
		//���ü��. �׷��⿡ set���� �Ѱ��� ����ȴ�.
		
		System.out.println("�� ��ü�� : " + set.size());
		//��ü�� �ٸ�����! ���ü��! �׷��⿡ �ϳ��� ������ �ȴ�. 
	}
}
