package testPractice;

public class Elementary extends Students{
	String subject;
	int midterm;
	int finalterm;
	int exp;
	
	//���� ���� �ջ�
	public int total () {
		return midterm + finalterm + exp;
	}
	
}
