package Q7;

public class FindandReplaceEx {
	public static void main(String[] args) {
		String str = "��� ���α׷��� �ڹ� ���� ���� �� �� �ִ�.";
		int index = str.indexOf("�ڹ�");
//		System.out.println(index);
		if (index == -1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ���");
		} else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ�");
			str = str.replace("�ڹ�", "JAVA");
			System.out.println("-->" + str);
		}
	}
}
