package sec11.stream_collect;

import java.util.Arrays;
import java.util.List;

public class MaleStudentEx {
	public static void main(String[] args) {
		List <Student> totalList = Arrays.asList(
				new Student ("ȫ�浿", 10, Student.Sex.MALE),
				new Student ("�����", 6, Student.Sex.FEMALE),
				new Student ("�ſ��", 10, Student.Sex.MALE),
				new Student ("�ڼ���", 6, Student.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.stream()
			.filter(s -> s.getSex() == Student.Sex.MALE)
			.collect(
					() -> new MaleStudent(), //����� ���� �����̳ʸ� ������. ���ٽ�����
					(r, t) -> r.accumulate(t), //r : ����� ���� �����̳� / t : ���͸��� ��ҵ�. ��, r�� t�� ������Ű�� ����
															//accumulate�� r�̰����� �ִ� �޼ҵ�. ���� �ϴ� ����. 
					(r1, r2) -> r1.combine(r2)); //�����̳ʸ� ��ġ�� ���̱⶧���� r1, r2�� �Ű���. ������ �̱ۿ����� �ʿ����. �׷��� ��������.
																//����ó���� ���ؼ� ���ʿ���. �̱ۿ����� �ʿ������, �������� ������ �ȴ�
		
		//collect�� MaleStudent Ÿ���� ������
		
		maleStudent.getList().stream()
			.forEach(s ->System.out.println(s.getName()));
		
	}
}
