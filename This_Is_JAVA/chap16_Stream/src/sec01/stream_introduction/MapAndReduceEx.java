package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx {
	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
		);
		
		//�߰�ó�� : ����!! mapToŸ�� () ���� �ؼ� �� �ش� Ÿ������ ���� stream�� ��ҷ� �ٲٴ� �� 
		//����ó�� : ���!! average() !!!
//		studentList.stream().mapToInt(s->s.getScore()) �̹�ĵ��ְ�
		double avg = studentList.stream()	 //�������� ��Ʈ��
				.mapToInt(Student :: getScore) //�߰� ó���Ͽ�, �����ϴ°�. ��Ʃ��Ʈ���� ���ھ ���°�
				.average()	//����ó��. �߰����� ���� ���� ��Ʈ���� Ȱ���Ͽ� ��հ��� ���ϴ� �żҵ�. �ٵ� �̰� �����ϴ� ���� OptionalDouble�̶�
				.getAsDouble();	// getAsDouble() �޼ҵ带 Ȱ���Ͽ� average() ���� �����ϵ�����.
		
		System.out.println("��� ���� : "  + avg);
		
	}
}
