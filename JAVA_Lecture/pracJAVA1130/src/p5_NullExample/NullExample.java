package p5_NullExample;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		//null�� ������ ���ڳ�. null���� �ƴ��� �����ϴ� ����
		System.out.println(Objects.isNull(str1)); //null�Դϱ�?
		System.out.println(Objects.isNull(str2));
		System.out.println(Objects.nonNull(str1));//null�̾ƴմϱ�?
		System.out.println(Objects.nonNull(str2));
		System.out.println(Objects.requireNonNull(str1)); //null�ϰ�쿡�� Nullpointexception�߻���
//		try {
//			System.out.println(Objects.requireNonNull(str2, "null��"));
//		} catch (NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
		System.out.println("====================");
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "�⺻��"));//null�� ������ �⺻���� �������. 
		
	}
}
