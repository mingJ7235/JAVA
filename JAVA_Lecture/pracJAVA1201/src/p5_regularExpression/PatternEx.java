package p5_regularExpression;

import java.util.regex.Pattern;

public class PatternEx {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�. ��ȭ��ȣ ������ �½��ϴ�.");
		}else {
			System.out.println("��ȭ��ȣ ������ ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���");
		}
		
		String regExp1 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String data1 = "angel@naver.com";
		boolean result1 = Pattern.matches(regExp1, data1);
		if (result1) {
			System.out.println("�̸����ּ� ������ �½��ϴ�.");
		}else {
			System.out.println("�̸����ּ� ������ ���� �ʽ��ϴ�.");
		}
	}
}
