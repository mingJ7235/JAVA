package p06;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

import p05.Student;

public class MaleStudentEx {
	public static void main(String[] args) {
		List<Student> totalList=Arrays.asList(
				new Student("ȫ�浿", 10, Student.Sex.MALE,Student.City.PUSAN),
				new Student("�����", 6, Student.Sex.FEMALE,Student.City.SEOUL),
				new Student("�ſ��", 10, Student.Sex.MALE,Student.City.PUSAN),
				new Student("�ڼ���", 6, Student.Sex.FEMALE,Student.City.SEOUL), 
				new Student("�ڼ�ȣ", 6, Student.Sex.MALE,Student.City.SEOUL) 
				
				);
//		Stream <Student> totalStream = totalList.stream(); //�������� ��Ʈ��
//		Stream <Student> totalStream = totalList.parallelStream(); //���� ��Ʈ��
//		Stream <Student> maleStream =totalStream.filter(s->s.getSex() == Student.Sex.MALE);
//		Supplier <MaleStudent> supplier = () -> new MaleStudent();
//		BiConsumer<MaleStudent, Student> accumulator = (m,s) ->m.accumulate(s);
//		BiConsumer<MaleStudent, MaleStudent> combine = (ms1, ms2) -> ms1.combine(ms2);
//		
//		MaleStudent maleStudent = maleStream.collect(supplier, accumulator, combine);
//		System.out.println(maleStudent + " ~~~");
		
		//2. ���ٽ� ǥ��
//		MaleStudent maleStudent = totalList.parallelStream()
//				.filter(s ->s.getSex() == Student.Sex.MALE)
//				.collect(() -> new MaleStudent(),
//						(m,s)->m.accumulate(s),
//						(ms1,ms2) ->ms1.combine(ms2)
//						);
//		
//		System.out.println(maleStudent.getList());
		
		//3. �޼ҵ� ������ ǥ��
		MaleStudent maleStudent = totalList.parallelStream()
				.filter(s->s.getSex() ==Student.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		
		
		
	} 
}
