package dto;

import dao.MemberIF;

public class MemberVO implements MemberIF{
	//field
	
	private String name;	//�̸�
	private String number; //�ڵ�����ȣ
	private int age;	//��
	private int group; //�Ƿ�

	//������
	public MemberVO(String name, String number, int age, int group) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.group = group;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	
}
