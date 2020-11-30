package p3_Object_Equals;

import java.util.Objects;

public class EqualsAndDeepEqualsEx {
	public static void main(String[] args) {
		Integer o1 = null; //������ Ŭ���� o1 -> ��������
		Integer o2 = null;
//		System.out.println(o1.equals(o2));	 //ObjectŬ������ �޼ҵ�
//		System.out.println(o1.equals(null));
//		System.out.println(null.equals(o2));	//ObjectŬ������ equals �޼ҵ忡���� �̷��� ������.
//		System.out.println(null.equals(null)); //null���� �񱳸� �� �� ������ �׷��� Objects Ŭ������ ���°���
		System.out.println("ObjectsŬ���� Ȱ��");
		System.out.println(Objects.equals(o1, o2)); //o1.equals(o2)�� ��������
		System.out.println(Objects.equals(o1, null));  
		System.out.println(Objects.equals(null, o2));//�Ϲ� ��ü���� null�϶� null���� �� ����
		System.out.println(Objects.equals(null, null));
		
		System.out.println("\ndeepEquals �޼ҵ�");
		Integer [] arr1 = {1,2};
		Integer [] arr2 = {1,2};
		Integer [] arr3 = {1,2,3};
		
		//deepEquals �޼ҵ�� ��ü�� ��Ҹ� ���ϴ� Ŭ������. ��...�̰� Ȱ�� ũ�ڴ�. 
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr3));
		
	}
}
