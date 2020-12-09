package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelEx {
	public static void main(String[] args) {
		List <String>list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�", "���ٽ�", "�ں���");
		
		//����ó�� (�̱۽�����)
		Stream<String> stream = list.stream();
//		stream.forEach(name -> print(name));
		stream.forEach(ParallelEx :: print); //���ٽ� �޼ҵ� ���� �Ű����� �����̵ȴ�. ����;
		
		System.out.println(); //����
		
		//����ó�� (��Ƽ������)
		Stream<String> parallelStream = list.parallelStream();
//		stream.forEach(name -> print(name));
		parallelStream.forEach(ParallelEx :: print);
		
	
	}
	public static void print (String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
	
	/* �����
	 * ȫ�浿 : main
		�ſ�� : main
		���ڹ� : main
		���ٽ� : main
		�ں��� : main
		
		���ڹ� : main
		�ſ�� : ForkJoinPool.commonPool-worker-1
		�ں��� : ForkJoinPool.commonPool-worker-2
		���ٽ� : ForkJoinPool.commonPool-worker-2
		ȫ�浿 : ForkJoinPool.commonPool-worker-2
	 */
}
