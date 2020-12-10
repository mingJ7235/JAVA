package sec11.stream_collect;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<Student> list; //��Ҹ� ������ �÷���

	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	public void accumulate (Student student) {	// ��Ҹ� �����ϴ� �޼ҵ�
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	
	public void combine(MaleStudent other) {	// �� MaleStudent�� �����ϴ� �޼ҵ� (���� ó���ÿ��� ȣ��)
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	public List <Student> getList () {	//��Ұ� ����� �÷����� ����
		return list;
	}
}
