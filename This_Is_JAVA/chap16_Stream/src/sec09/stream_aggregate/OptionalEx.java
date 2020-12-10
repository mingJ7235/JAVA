package sec09.stream_aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx {
	public static void main(String[] args) {
		List <Integer> list = new ArrayList <> ();
		
		
		//List�� ��Ұ� ����. 
		/*double avg = list.stream()
//				.mapToInt(Integer :: intValue) //intValue�� ��Ʈ���� �������� �ҷ��´�����.
				.mapToInt(n -> n.intValue())
				.average() // ��� ���� ���� ���� ���� -> ���ܰ� �߻� (NoSuchElementException)
				.getAsDouble();
		
		System.out.println(avg);*/
		
		//��Ұ� �ִ��� ������ Ȯ���� ��� ���1 : isPresent
		OptionalDouble optional = list.stream()
			.mapToInt(Integer::intValue)
			.average();
		if (optional.isPresent()) { //true�� ������ ���� �ִ°��̰�, false�� ���� ���°�
			System.out.println("��� 1 ��� : " + optional.getAsDouble());
		}else {
			System.out.println("��� 1 ��� : 0.0");
		}
		
		// ��� 2 : orElse
		double avg = list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0); //������� ������쿡 ���� �Ű����� ���� ���� ��!
		System.out.println("��� 2 ��� : " + avg);
		
		//��� 3 : ifPresent
		
		list.add(3);
		list.add(6);
		
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(a -> System.out.println("��� 3 ��� : " + a)); //���� average()�� �ִٸ� a�� ���
								//���� ���ٸ� false�� �Ǿ �ƹ��ϵ� ����������
		
	}
}
