package p4_hashCode;

public class HashCodeEx {
	public static void main(String[] args) {
		String str1 = new String ("abc");
		String str2 = new String ("abc");
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//��״� System Ŭ������ �ִ� ����. ���� object���� ���ϴ� hashcode���� �˷��ش�.
		//��, ���� hashCode�� String���� �������̵� �� ���ε�,
		//identityHashCode�� �������̵� ���� ���� hashCode���� �����ش�. 
		// �������̵带 ���� ���ϰ� ������⶧���� �ٷ� ���� �� �ִ�. 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
	}
}
