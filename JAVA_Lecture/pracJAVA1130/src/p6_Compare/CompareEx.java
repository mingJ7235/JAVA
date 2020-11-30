package p6_Compare;

import java.util.Comparator;
import java.util.Objects;

public class CompareEx {
	//��ü ���ϱ�
	public static void main(String[] args) {
		
		//����, ȫ����
		
		Student s1 = new Student(3, "ȫ����");
		Student s2 = new Student(5, "����");
		Student s3 = new Student(2, "�ּ���");
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		if (result == 0) System.out.println("s1�� s2�� ������ȣ");
		else if (result <0) System.out.println("s1�� s2�� �չ�ȣ");
		else System.out.println("s1�� s2�� �޹�ȣ");
		
	}
	static class Student {
		int sno;
		String name;
//		public Student(int sno) {
//			this.sno = sno;
//		}
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
	}
	static class StudentComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);// ���ڿ� �ڷ��
		}
		
		
		
//		@Override
//		public int compare(Student o1, Student o2) {
//			if (o1.sno < o2.sno) return -1;
//			else if (o1.sno == o2.sno) return 0;
//			else return 1;
//		}
		
//		@Override
//		public int compare(Student o1, Student o2) {
//
//			return Integer.compare(o1.sno, o2.sno);
//		}
		
	}
}//end CompareExample



