package p7_format;

import java.text.MessageFormat;

public class FormatEx {
	public static void main(String[] args) {
		//MessageFormat
		String id = "java";
		String name = "�ſ��";
		String tel = "010-123-5678";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ : {2}";
		Object[] arguments = {id, name, tel};
		String result = MessageFormat.format(text, arguments);
		System.out.println(result);
	}
}
