package day27_CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList
 * �÷��� Ŭ���� �� ���� ���� ���Ǵ� Ŭ������. 
 * �迭�� �̿��ؼ� ���� �����ϴ� �����̴�.
 * 
 * �ε����� �̿��ؼ� �迭 ��ҿ� ������ ���� ����������
 * ũ�⸦ �ø��� ���ؼ��� ���ο� �迭�� �����ϰ� ������ ������ �Űܾ� �ϹǷ� ������. 
 * ��, ���ο� �迭�� �þ ��ŭ�� ������ ã�Ƽ� ���� �����ϴ°��̴�. 
 * ���϶��� ���ڸ����� ����. ���϶��� ���� ����.
 *  
 *  �����迭 : ũ�Ⱑ �����Ǿ���. (ó���� �迭�� �����Ҷ� ũ�⸦ �������ش�. ) 
 *  �����迭 : ũ�Ⱑ �����Ǿ����� �ʴ�. (���� ������)
 *  			�����迭�� ���� �迭 �ּҰ��� ĭ�� �߰��ϴ°��̾ƴ϶�
 *  			���ο� �ּҰ����� ���� �迭�� ������ �����ϰ�, �迭�� ũ�⸦ �ø��°��̴�. 
 *  			��°�ΰ� �̵��ϴ� ���̴�. �׷��� �����迭���� ��������. 
 *  
 *  �׵��� ��� �迭 : �ӵ��� �������� ������ �޸� ������ ���� ���߿� �ø� �� ����. 
 *  ArrayList : �޸� ���� ����� �ø��� ���� �� ������, �迭���� ������.
 *  
 */
public class ArList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = null;
		
		list.add(10);	//0��°��
		list.add(20);	//1��°��
		list.add(80);	//2
		list.add(90);	//3
		list.add(30);	//4
		list.add(50);	//5
		list.add(40);	//6
		
		
		list2 = new ArrayList<>(list.subList(2, 5));
		//�߶� �־�޶�� ����. list�� 2~4��° ���� ��
		
		System.out.println(list);
		System.out.println(list.toString());
		System.out.println(list2);
		//ArrayList�� ��ü���� ġ�� �ּҰ��� �ƴ϶� �迭�� ���� ���´�.
		//���⼭ toString�� �����ǵǾ �迭�� ���� �������� �Ȱ��̴�. �׷��� ��ü���� ġ�� �ּҰ��� �ƴ� �迭�� ���� �����°��̴�.
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		System.out.println(list.size());
		//ArrayList �� �迭 ����
		
		//�����ϱ� (�������� ����)
		//�̷��� �˰����̶���Ѵ�. 
		System.out.println("���� �� list : " + list);
		Collections.sort(list);
		System.out.println("���� �� list : " + list);
		
		//������ ���� (������� �������� ����, �������� �������ִ°���.�׷��� ���� �Ŀ� �������� ���� ���������� �Ǵ°���
		//�׷��� ������ ���������� �ϰ� �ʹٸ� ������������ �����ϰ� �������� ����Ѵ�.)
		Collections.reverse(list);
		System.out.println("������ : " + list);
		
		ArrayList<String> list3 = null;
		
		list3 = new ArrayList<>();
		list3.add("efg");
		list3.add("abc");
		list3.add("cde");
		list3.add("bcd");
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
		
		list3 =new ArrayList<>();
		list3.add("����");
		list3.add("Ÿ��");
		list3.add("�ٶ�");
		list3.add("����");
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
		
		list3 =new ArrayList<>();
		list3.add("����");
		list3.add("ab");
		list3.add("AB");
		list3.add("����");
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
		
		//���� : shuffle() �����ϰ� ����. 
		Collections.shuffle(list);
		System.out.println(list);
		
		
	}
}
