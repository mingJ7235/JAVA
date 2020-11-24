package day27_CollectionFrameWork;

import java.util.ArrayList;

public class ArrList2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		//10~80 ���� ������ 10 20 30 ... �ֱ�
		
		for (int i = 1; i < 9; i++) {
			list.add(i*10);
		}
		System.out.println(list);
		list.add(90);
		//add�ϴ� ���� �迭�� ������ ã�� �̵��Ѵ�.
		System.out.println(list);
		
		//indexOf() : ���� ������ �� ���� ����ִ� ���ȣ�� ���� 
						// ���� ������ -1�� �ش�. 
						// ��, ���� �ִ��� �������� Ȯ���� �����ϴ�. 
		int idx = list.indexOf(10);
		//�̰� ��ü�� ���� �ѹ��� ����ȴ�. �� 0�̴�.
		
		if (idx != -1) {
		//idx�� -1 �� �ƴ϶�°� ���� �ִٴ°���
			list.add(idx+1, 15);
			//10 ���� 15�� �ִ� ���
		} else {
			list.add(0,15);
		}
		System.out.println(list);
		
		//�ǽ� 60�� 600���� �ٲٱ�
		list.set(list.indexOf(60), 600);
		System.out.println(list);
		//15�����
		list.remove(list.indexOf(15));
		System.out.println(list);
		System.out.println(list.size());
		list.remove(new Integer(600));
		System.out.println(list);
		System.out.println(list.size());
		
		
	}
}
