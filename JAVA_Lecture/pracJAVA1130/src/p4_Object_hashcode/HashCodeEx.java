package p4_Object_hashcode;

import java.util.Objects;

public class HashCodeEx {
	public static void main(String[] args) {
		Student s1 = new Student (1,"ȫ�浿");
		Student s2 = new Student (1,"ȫ�浿");
		Student s3 = null;
		
		//hashCode �޼ҵ带 student Ŭ�������� override�ߴ�.
		//return�� ObjectsŬ������ hash�޼ҵ带 �����ϵ�������
		
		System.out.println(s1.hashCode()); //Object Ŭ������ �ؽ��ڵ� �Լ�
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		System.out.println(Objects.hashCode(s1));//Objects Ŭ���� ���
		System.out.println(Objects.hashCode(s2));
		System.out.println(Objects.hashCode(s3));// 0 ����
	}
}
