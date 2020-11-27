package p6_Clone;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//1�ܰ� ���� ������ �Ѵ�.
		Member cloned = (Member) super.clone();
		//2�ܰ� scores�� �����Ѵ�.
		return super.clone();
	}
	
	public Member getMember () {
		Member cloned = null;
		try {
			cloned = (Member) clone ();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} //�ڼ� �������� = Object ������
		return cloned;
	}
	
}
