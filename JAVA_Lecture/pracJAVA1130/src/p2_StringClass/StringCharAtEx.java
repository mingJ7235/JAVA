package p2_StringClass;

public class StringCharAtEx {
	public static void main(String[] args) {
		String ssn1 = "010624-1230123";
		String ssn2 = "010624-1230123";
		String ssn3 = new String ("010624-1230123");
		
//		char s1 =ssn1.charAt(0);
//		char s2=ssn1.charAt(1);
//		System.out.println(""+s1 + s2);
		
		if (ssn1==ssn2)  { //�ּҰ� ����?
			System.out.println("���� �ֹι�ȣ");
		}else {
			System.out.println("�ٸ� �ֹι�ȣ");
		}
		if (ssn1==ssn3)  {
			System.out.println("���� �ֹι�ȣ");
		}else {
			System.out.println("�ٸ� �ֹι�ȣ");
		}
		if (ssn1.equals(ssn3))  {// �ּҾ��� ���� ����? 
			System.out.println("���� �ֹι�ȣ");
		}else {
			System.out.println("�ٸ� �ֹι�ȣ");
		}
		if (ssn1.equals(ssn2))  {
			System.out.println("���� �ֹι�ȣ");
		}else {
			System.out.println("�ٸ� �ֹι�ȣ");
		}
		
		
		
	}
}
