package mjProjects;

import java.util.Scanner;

public class Day02Prac {
	public static void main(String[] args) {
		String qMsg = "���� �� �ǰ���� ������ �ϳ� ������.";
		String choiceMsg = "1. ���׿� ���� �ݺؾ�\n"
				+ "2. �������� �� �������� ������\n"
				+ "3. �̻��� ���� �Ǿ�\n"
				+ "4. �� �� ���� ���� �罿";
		
		String answerMsg1 = "����� ������!";
		String answerMsg2 = "���� ������!";
		String answerMsg3 = "ġ���� �ֱ���!";
		String answerMsg4 = "�ܷӱ���!";
		String errMsg = "�ٽ� �õ��ϼ���";
		
		Scanner sc = new Scanner(System.in);
		
		int choice= 0;
		String result = "";
		System.out.println(qMsg + "\n" + choiceMsg);
		choice = sc.nextInt();
		
		result = choice == 1 ? answerMsg1 :
			choice == 2 ? answerMsg2 : 
				choice == 3 ?answerMsg3 :
					choice == 4 ? answerMsg4 : errMsg;
		
		System.out.println(result);
		
	}
}
