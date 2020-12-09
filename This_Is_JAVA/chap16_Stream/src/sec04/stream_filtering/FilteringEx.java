package sec04.stream_filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {
	public static void main(String[] args) {
		List <String> names = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�", "�ſ��", "�Ź�ö");
		
		//�ߺ� ����
		names.stream()		//�������� ��Ʈ��
		.distinct()					//�ߺ� ���� �߰� ��Ʈ��
		.forEach(n -> System.out.println(n)); 	//������Ʈ�� forEach
		
		System.out.println();

		//���͸�
		names.stream()
		.filter(n -> n.startsWith("��"))	//starsWith : String Ŭ������ �޼ҵ�. �Ű������� �����ϴ� ���ڿ��������� true�� ������
		.forEach(System.out :: println);
		
		System.out.println();
		
		//�ߺ� ���� ��, ���͸� �ϱ� 
		names.stream().distinct().filter(n -> n.startsWith("��")).forEach(System.out :: print );
		
		
	}
}
