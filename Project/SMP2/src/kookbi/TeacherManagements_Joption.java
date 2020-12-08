package kookbi;

import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TeacherManagements_Joption extends LibraryMagagements_Joption{
	
	ImageIcon teacherImg = new ImageIcon("src/img/teacherMain.gif");
	ImageIcon insertImg = new ImageIcon("src/img/teacherInsert.gif");
	int choice;
	ArrayList<Teachers>arTeachers = new ArrayList<>();
	public void TeachersView ( ) {
		String menu [] = {"���� ���", "���� �˻�", "���� ����", "���� ����", "���� ��ȸ", "���ǽ� ����", "��������"};
		boolean viewcheck = false;
		while (!viewcheck) {
			choice = JOptionPane.showOptionDialog(null,
					"[�ڸ��� IT ��ī���� ������ ���� ���α׷��Դϴ�..]\n" + "�Ʒ��� �޴��� �����Ͽ� ������� �������ּ��� :)", "������ ���� Menu",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, teacherImg, menu, null);
			if (choice == -1)
				break;
			switch (choice) {
			case 0:
				//������
				teacherInsert();
				break;
			case 1:
				//����˻�
				teacherSearch();
				break;
			case 2:
				//�������
				teacherDelete();
				break;
			case 3:
				//�������
				teacherUpdate();
				break;
			case 4:
				//������ȸ
				teacherList();
				break;
			case 5:
				//���ǽ� ����
				assignClass();
				break;
			case 6:
				viewcheck = true;
			}
		}
	}//end view

	public void teacherInsert() {
		boolean check = false;
		String [] yesOrno = {"YES", "NO"};
		while (!check) {
			choice = JOptionPane.showOptionDialog(null, "��[���� ���]�� \n���� ����� �����Ͻðڽ��ϱ�?", "���� ���", 
			JOptionPane.DEFAULT_OPTION, 	JOptionPane.PLAIN_MESSAGE, 
			insertImg, yesOrno, null);
			if (choice == -1) break;
			switch (choice) {
			case 0 :
				String name = JOptionPane.showInputDialog("����� ���� �̸��� �����ּ���") ;
				int age = 0;
				try {
					age = Integer.parseInt(JOptionPane.showInputDialog(name + "������� ���̸� �Է����ּ���"));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "���ڷ� �Է����ּ���");
				}
				String teachSubject = JOptionPane.showInputDialog(name + "������� ��� ������ �Է����ּ���");
				
				Teachers tch = new Teachers(name, age, teachSubject);
				arTeachers.add(tch);
				System.out.println(tch.getTeachName() + " " + tch.getAge() + " " + tch.getTeachSubject());
				break;
				
			case 1 :
				JOptionPane.showMessageDialog(null, "���� ����� ����մϴ�.");
				check = true;
				break;
			}
		}
		
		
	}//end insert
	
	public void teacherSearch () {
		
		
	}//end search
	
	public void teacherDelete() {
		
	}//end delete
	
	public void teacherUpdate() {
		
	}//end update
	
	public void teacherList () {
		
	}//end list
	
	public void assignClass() {
		
	}//end assign
	


	
	
	
}
