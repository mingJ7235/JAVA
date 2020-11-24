package day24_ObjectClass;

import java.util.Random;

public class ObjectTest {
	//�׻� ��� Ŭ������ Object�� ��ӹ޴´�
	public static void main(String[] args) {
		/*
		 * equals()�� �� �ּҰ��� ������ Ȯ���ϴ� �޼����. 
		 */
		//String�� Ŭ�����̱� ������ ��üȭ�� �����ϴ�. 
		//�ּҰ����� ���� ���� ���� ��������⶧���� data1,2 �� ���������ΰ��Ѵ�.
		
		String data1 = new String("ABC");
		String data2 = new String("ABC");
		System.out.println(data1 == data2);
		
		
		//�̰� �� false�ΰ�? 
		//== : ������ �ּҰ��� ������ �ּҰ��� �������� ���ϴ� �ּҰ� �� �����ڴ�. 
		//�׷��Ƿ� data1�� data2�� �ּҰ��� �ٸ��� ������ false�̴�. 
		
		System.out.println(data1.equals(data2));
		
		
		//�̰� ��� true�� �����°�? ==�� ���������� �ּҰ��� ���ϴµ�?
		//data1.equals()�� equals�� String Ŭ������ �ִ� �޼����.
		//Object Ŭ������ �ִ� equals() �޼��带 String���� �����ǵǾ� �ּҰ��� �ƴ� ���� ���ϱ� ���� �����ǵ�
		//�׷��� ������ ���� ���ϰ� �Ǵ� ���̴�. 
		//String Ÿ���� �ּҰ��� �����Ѵ�. �ֳ��ϸ� ��ü�̱� �����̴�. 
		//intern() �̶�� �޼���� ���� ���� ���� String�� pool���� ã��.
		//�׷��� �װ��� ��������. 
	
		String data3 = "ABC";
		String data4 = "ABC";
		System.out.println(data3 == data4);
		
		//��״� intern()�� ���� �Ⱦ��� �Ȱ��� ����.
		//������ �ִ� ������ �ߺ��� ���� �ʱ� ������ �Ȱ��� "ABC"��� �̹� ������� ������ 
		//data3�� data4�� ���� �� �ۿ� ����. ���Ӱ� "ABC"�� �� ����� ���� �����̴�. 
		//�Ȱ��� �ּҰ��� �����Ѵ�. 
		
		System.out.println(data3.equals(data4));
		System.out.println(data3.intern() == data4);
		//equals�� ������ ==�� ����Ҽ��ۿ� ���� ���� .intern()�� �Ἥ ���� ���ٸ� true�� ����� �� �ִ�. 
		//String���� ���� ���� .equals�� ���ϴ� ���� �����ϴ�. 
		
		System.out.println("RANDOM==============");
		Random r = new Random();
		Random r2 =new Random();
		
		System.out.println(r.equals(r2));
		System.out.println(r == r2);
		//���⿡�� ����� equals() �� Object �޼ҵ忡 �ִ� ���̹Ƿ� �ּҰ��� ���Ѵ�. 
		//�׷��Ƿ� r�� r2�� �ּҰ��� �ٸ��Ƿ� ��°��� false�� ���´�. 
		
		r=r2;
		//�̷��� �ϸ� �Ȱ�����. 
		System.out.println(r.equals(r2));
		System.out.println(r == r2);
		
		//hashcode
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		System.out.println(data3.hashCode());
		System.out.println(data4.hashCode());
		//4���� hashcode�� ��� ����. 
		//data1~4���� ��� ���� ��� ���� ������ hashcode�� ��� ����. 
		//�ֳ��ϸ� data1, data2 �ٸ� heap �޸𸮿� ������ (data3�� data4�� stack. ������)
		//�� ��ü�� ���⶧���� hashcode�� ��� ����. 
		
		
		System.out.println(data1.hashCode() == data2.hashCode());
		System.out.println(data1 == data2); 
		System.out.println(data3.hashCode() == data2.hashCode());
		// �� ���� true�� ���´�. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}
}
