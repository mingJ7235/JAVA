package p1;

import java.text.MessageFormat;

public class MessageFormatEx {
	public static void main(String[] args) {
		//�����͸� ���Ͽ� �����ϰų�, ��Ʈ��ũ�� ������ ��, �����ͺ��̽� SQL �� �ۼ��� ������ ���� ���ڿ� ���
		//MessageFormat Ŭ���� ������� ���ڿ��� �����Ͱ��� �ڸ��� ǥ��! �صΰ�, 
		//���α׷��� �����ϸ鼭 �������� �����͸� ������ ���ڿ��� �ϼ���ų �� �ִ�. 
		String id = "joshuara7235";
		String name = "�����";
		String tel = "010-6470-7235";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸� : {1} \nȸ�� �ڵ��� ��ȣ : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1+ "\n");
		
		String sql = "insert into member values ({0}, {1}, {2})";
		Object [] arInformation = {id, name, tel};
//		String [] arInformation = {id, name, tel};
		String result2 = MessageFormat.format(sql, arInformation);
		System.out.println(result2);
	
	}
}
