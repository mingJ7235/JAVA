package forTest;

public class Arr {
	public static void main(String[] args) {
//		String [] arData = {"�ȳ�", "�ݰ���", "�̸���", "����?"};
//		
//		//����for��
//		for(String i : arData) {
//			System.out.println(i);
//		}
		
		int [][] arrScore = {
				{10, 20, 30}, //1���л�
				{11, 25, 39}, //2���л�
				{12, 26, 38}, //3���л�
				{13, 27, 37}, //4���л�
 				{13, 28, 36}  //5���л�
		};
		int total = 0;
		double avg = 0.0;
		int cnt = 0;
		//�� �л��� ������ ��� ����ϱ� ������������
		
		for(int [] arScore : arrScore) {
			total = 0;
			//�ʱ�ȭ �Ƚ����ָ� �����̵Ǽ� ������.
			//�����Ҷ� total�� 0���� �ʱ�ȭ��Ű�� ����. 
			cnt++;
			for(int score : arScore) {
				total += score;
			}
			avg = Double.parseDouble(String.format("%.2f", (double) total / arScore.length));
			System.out.println(cnt +"�� ���� : " + total+ "��");
			System.out.println(cnt + "�� ��� : " + avg + "��");
		}
		
	}
}
