package kookbi;

public class Teachers {
	//������ ���� ���α׷�
	private String teachName;
	private int age;
	private int teachNum;
	private static int FTNUM = 1000;
	private String teachSubject;
	
	public Teachers(String teachName, int age, String teachSubject) {
		this.teachName = teachName;
		this.age = age;
		this.teachSubject = teachSubject;
		this.teachNum = FTNUM++;
	}

	public String getTeachName() {
		return teachName;
	}
	public void setTeachName(String teachName) {
		this.teachName = teachName;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getTeachSubject() {
		return teachSubject;
	}
	public void setTeachSubject(String teachSubject) {
		this.teachSubject = teachSubject;
	}
	
	public int getTeachNum() {
		return teachNum;
	}
	public void setTeachNum(int teachNum) {
		this.teachNum = teachNum;
	}

	public String show () {
		return "| ���� �̸� :  " + teachName + "  | ���� ���� :  " + age + "  | ��� ���� :  " + teachSubject;
	}
	
	public String showNum () {
		return "| ���� �̸� : " + teachName + "  | ���� ��� : " + teachNum;
	}
	
	
}
