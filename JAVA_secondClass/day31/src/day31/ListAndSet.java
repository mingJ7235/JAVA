package day31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.time.Duration;
import java.time.Instant;
/*
 * Set�� �˻��� ������ �ֱ� ������ ���������� ������ �ʿ䰡 ����. (�ε����� ����.)
 * ������ ũ�⿡ ������� �˻��� �ɸ��� �ð��� �ſ� ª��.
 * 
 *List�� index�� �����ؾ��ϱ� ������ ��������� �ð��� �����ɸ���.
 *
 *�׷��Ƿ� ����� ���̰� ���ٸ� HashSet�� ����Ѵ�. 
 * 
 */


public class ListAndSet {
	public static void main(String[] args) {
		final int SIZE = 10_000_000;
		final List<Integer> arrayList = new ArrayList<>(SIZE);
		final Set<Integer> hashSet = new HashSet<>(SIZE);
		//�����ڿ� ���ڸ� �ָ� ������ȴ�.
		final int data = 9_000_000;
		
		//���� ���� ���迬��
		IntStream.range(0, SIZE).forEach(value -> {
			arrayList.add(value);
			hashSet.add(value);
		});
		
		//�� �ð� - ���� �ð� = �ɸ��ð�
		//List �ð����ϱ�
		Instant start = Instant.now();
		arrayList.contains(data);
		Instant end = Instant.now();
		long eTime = Duration.between(start, end).toMillis();
		System.out.println("array list search time" + (eTime/1000.0) + "��");
		//Set �ð� ���ϱ�
		start = Instant.now();
		hashSet.contains(data);
		end = Instant.now();
		eTime = Duration.between(start, end).toMillis();
		System.out.println("hash set search time" + (eTime/1000.0) + "��");
		
		
		
	}
	
	
}
