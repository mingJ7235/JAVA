package grade_Manage;

import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
	School data [][] = new School[3][5]; //�б��� 5�� ���� �Է°���
	int eleNum = 0, mdlNum = 0, highNum = 0;

	public int main() { //���θ޴� ����
		System.out.println("-------------");
		System.out.println("1.�Է� 2.��ȸ");
		System.out.println("-------------");
		System.out.print("����-> ");
		return sc.nextInt();
	}

	public int choiceSc() {
		System.out.println("-----------�б� ����-----------");
		System.out.println("1.�ʵ��б� 2.���б� 3.����б�");
		System.out.println("------------------------------");
		System.out.print("����-> ");
		return sc.nextInt() - 1;
	}
	
	public void input(int school) {
		School a = new High();
		System.out.print("�����: ");
		a.subject = sc.next();
		System.out.print("�߰����: ");
		a.middleSc = sc.nextInt();
		System.out.print("�⸻���: ");
		a.endSc = sc.nextInt();
		System.out.print("������: ");
		a.performSc = sc.nextInt();
		a.score = a.middleSc + a.endSc + a.performSc;

		if(school == 0) { //�ʵ��б�
			data[school][eleNum++] = (Elementary) a;
		}else{//���б� �Ǵ� ����б�
			Middle tmp = (Middle) a;
			System.out.print("�⼮����: ");
			tmp.attendance = sc.nextInt();
			System.out.print("��������: ");
			tmp.volunteer = sc.nextInt();
			System.out.print("��米��: ");
			tmp.teacher = sc.next();
			a.score += tmp.attendance + tmp.volunteer;
			if(school == 1) { //���б�
				data[school][mdlNum++] = tmp;				
			}else { //����б�
				High tmp2 = (High) tmp;
				tmp2.deviation = 1234;
				data[school][highNum++] = tmp2;								
			}
		}
	}
	public void output(int school) {
		String schoolName;
		if(school == 0) schoolName = "�ʵ��л�";
		else if(school == 1) schoolName = "���л�";
		else schoolName = "����л�";
		System.out.println("----------------------");
		System.out.println(schoolName+" �����Դϴ�.");
		System.out.println("----------------------");
		for (int i = 0; i < data[school].length; i++) {
			if(data[school][i] == null) break;
			Middle tmp = (Middle)data[school][i];
			System.out.println("�����: "+data[school][i].subject);
			if(school != 0) {
				System.out.println("��米��: "+tmp.teacher);				
			}
			System.out.print("����: �߰����: "+data[school][i].middleSc+", �⸻���: "+data[school][i].endSc
					+", ������: "+data[school][i].performSc);
			if(school != 0) {
				System.out.print(", �⼮����: "+tmp.attendance+", ������: "+tmp.volunteer);
			}
			System.out.println("\n����: "+data[school][i].score);
			if(school == 2) {
				High tmp2 = (High)data[school][i];
				System.out.println("ǥ������: " + tmp2.deviation);
			}
			System.out.println("\n");
		}
	}
}
