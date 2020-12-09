package sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesEx {
	public static void main(String[] args) {
		List <Member> list = Arrays.asList(  
			new Member("ȫ�浿", Member.MALE, 30),
			new Member("�質��", Member.FEMALE, 20),	
			new Member("�ſ��", Member.MALE, 45),	
			new Member("�ڼ���", Member.FEMALE, 27)	
		);
		
		double maleAgeAvg= list.stream()							//���� ��Ʈ��
				.filter(m -> m.getSex() == Member.MALE)		//filter �߰� ��Ʈ��
				.mapToInt(Member :: getAge)							//mapping �߰� ��Ʈ��
				.average()															//average() ���� ��Ʈ��
				.getAsDouble();													//Optionaldouble Ÿ���� double�� ��ȯ
		
		
		double femaleAgeAve = list.stream()
				.filter(m -> m.getSex()==Member.FEMALE)
				.mapToInt(Member :: getAge)
				.average().getAsDouble();
		
		
		System.out.println("���� ��� ���� :"  + maleAgeAvg);
		System.out.println("���� ��� ���� :"  + femaleAgeAve);
	}
}
