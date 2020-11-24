package day25Prac;

public class ObjectTest {
	public static void main(String[] args) {
		//constant pool (������� �����Ǿ��ִ� pool)
		//����� str1�� str2 �� constant pool�� �ִ� �ϳ���data�� �����ϴ� ��.  
		String str1 = "data";
		String str2 = "data";
		String str3 = new String("data");		
		String str4 = new String("data");		
		
		System.out.println(str1 == str2);
		System.out.println(str3.intern() == str4.intern());
		System.out.println(str1 == str3); //false
		System.out.println(str1 == str3.intern()); //true
		// intern()
		// constant pool�� ���� '��'�� �˻��Ͽ� �� ���� constant pool�� �ִٸ� �� �ּҰ��� ��ȯ�� �ش�.
		// ���, �� ���� 4���� str���� �����ϰ� �ִ� ���̴�. 
		
		System.out.println(str1.equals(str3)); //true
		//String Ŭ������ equals()�� ���� ���ϱ⶧���� true�� ���´�. 
		System.out.println("____________________________________________________");
		
		String [] arStr ={
			new String ("data1"),
			new String ("data2"),
			new String ("data3")
		};
		
		System.out.println(arStr); // �迭�� �����ּҰ� ���� ��, "data1" �� ����ִ� �ּ���.
		
		System.out.println(arStr[0] =="data1");	//== �� �ּҰ��� ���ϹǷ� false��. �ּҰ��� �ٸ���. 
		System.out.println(arStr[0].intern() =="data1");	
		System.out.println(arStr[0].equals("data1")); // String Ŭ�������� equals()�� ���� ���ϴϱ�. 
		
		
	}
}
