package Q8;

import java.util.StringTokenizer;

public class SplitEx {
	public static void main(String[] args) {
		String str = "���̵�,�̸� ,�н�����";

		// ��� 1 (split() �޼ҵ� �̿�)
		
		String [] names = str.split(",");
		for (String name : names) {
			System.out.println(name);
		}
		
		//��� 2 (StringTokenizer�̿�)
		
		StringTokenizer st = new StringTokenizer(str, ",");
		int cnt = st.countTokens();
		for (int i = 0; i < cnt; i++) {
			String tke = st.nextToken();
			System.out.println(tke);
		}
		
	}
}
