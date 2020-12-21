package p06;

import java.util.ArrayList;
import java.util.List;

import p05.Student;

public class MaleStudent {
		private List <Student> list;	//��Ҹ� ������ �÷���
		public MaleStudent () {
			list = new ArrayList <Student> ();
			System.out.println("[" + Thread.currentThread().getName()+ "] MaleStudent()");
		}
		
		//��Ҹ� �����ϴ� �޼ҵ�
		public void accumulate (Student student) {
			list.add(student);
			System.out.println("[" + Thread.currentThread().getName()+ "] accumulate (Student student)");
		}
		
		//�� MaleStudent�� �����ϴ� �޼ҵ�
		public void combine (MaleStudent other) {
			list.addAll(other.getList());
			System.out.println("[" + Thread.currentThread().getName()+ "] combine (MaleStudent other)");
		}
		public List <Student> getList () {
			return list;
		}
		
}
