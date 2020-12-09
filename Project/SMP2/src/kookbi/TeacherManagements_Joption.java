package kookbi;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TeacherManagements_Joption extends LibraryMagagements_Joption{
	
	ImageIcon teacherImg = new ImageIcon("src/img/teacherMain.gif");
	ImageIcon insertImg = new ImageIcon("src/img/teacherInsert.gif");
	int choice;
	ArrayList<Teachers>arTeachers = new ArrayList<>();
	Random r = new Random();
	public void TeachersView ( ) {
		String menu [] = {"���� ���", "���� �˻�", "���� ����", "���� ����", "���� ��ȸ", "��������"};
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
//				assignClass();
				viewcheck = true;
			case 6:
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
				break;
			case 1 :
				JOptionPane.showMessageDialog(null, "���� ����� ����մϴ�.");
				check = true;
				break;
			}
		}
	}//end insert
	
	public void teacherSearch () {
		boolean searchCheck = false;
		Iterator<Teachers> iter = arTeachers.iterator();
		if(arTeachers.isEmpty()) {
			JOptionPane.showMessageDialog(null, "��ϵ� ������� �����ϴ�. \n�ٽ� �ѹ� Ȯ�����ּ���.");
			return;
		}else {
			String name = JOptionPane.showInputDialog("��[����� �˻�]��\n�˻��Ͻ� ����� �̸��� �Է����ּ���");
			String result = "";
			while (iter.hasNext()){
				Teachers teacher = iter.next();
				if(name.equals(teacher.getTeachName())) {
					result += teacher.show();
					searchCheck = true;
				}
			}
			if (searchCheck) {
				JOptionPane.showMessageDialog(null, "��[�˻� ���]��\n  "+ result + "\n");
			}else {
				JOptionPane.showMessageDialog(null, "ã�� ������� �����ϴ�.");
			}
		}
	}//end search
	
	public void teacherDelete() {
		int num = 0;
		if(arTeachers.isEmpty()) {
			JOptionPane.showMessageDialog(null, "��ϵ� ������� �����ϴ�. \n�ٽ� �ѹ� Ȯ�����ּ���.");
			return;
		}
		teacherNumList();
		Teachers delteacher = null;
		try {
		num = Integer.parseInt(JOptionPane.showInputDialog("��[����� ���� ����]��"
					+ "\n������ ������� ����� �Է����ּ��� : "));
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "��ȣ�� �Է����ּ���");
			return;
		}
		Iterator<Teachers> iter = arTeachers.iterator();
		while (iter.hasNext()) {
			Teachers teacher = iter.next();
			if(num == teacher.getTeachNum()) {
				delteacher = teacher;
			}
		}
		if (delteacher == null) {
			JOptionPane.showMessageDialog(null, "ã�� ������� �����ϴ�. \n"
					+ "�ٽ� �ѹ� ������� ����� Ȯ���� �ּ���.");
		}else {
			arTeachers.remove(delteacher);
			JOptionPane.showMessageDialog(null, "�ش� ����� ������� ���� �Ǿ����ϴ�.");
		}
		
	}//end delete
	
	public void teacherUpdate() {
		boolean check = false;
		if (arTeachers.isEmpty()) {
			JOptionPane.showMessageDialog(null, "��ϵ� ������� �����ϴ�.");
			return;
		}
		teacherNumList();;
		int num = 0, choice = 0;
		Iterator<Teachers> iter = arTeachers.iterator();
		while (iter.hasNext()) {
			try {
				num = Integer.parseInt(JOptionPane.showInputDialog("������ ������� ����� �Է����ּ���"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "����� ���ڷ� �Է����ּ���");
				return;
			}
			Teachers tch = iter.next();
			if (num == tch.getTeachNum()) {
				check = true;
				JOptionPane.showMessageDialog(null, "[����� ���� ����]\n"
						+ "�̸�, ����, �������� ������� �Է��ϼ���");
				
				tch.setTeachName(JOptionPane.showInputDialog("������ ����� �̸��� �����ּ���"));
				
				try {
					tch.setAge(Integer.parseInt(JOptionPane.showInputDialog("����� " + tch.getTeachName() + " ������� ���̸� �����ּ���")));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "���ڷ� �����ּ���.");
					break;
				}
				tch.setTeachSubject(JOptionPane.showInputDialog(tch.getTeachName() + " ������� ����� ��� ������ �����ּ���"));
				
				JOptionPane.showMessageDialog(null, "����� ���� ���� �Ϸ�");
				teacherList();
				break;
			}
		}
		if (!check){
			JOptionPane.showMessageDialog(null, "����� ����� �ٽ� Ȯ�����ּ��� ");
		}
	}//end update
	
	public void teacherList () {
		Iterator<Teachers> iter = arTeachers.iterator();
		if (arTeachers.isEmpty()) {
			JOptionPane.showMessageDialog(null, "��ϵ� ������� �����ϴ�. \n�ٽ� �ѹ� Ȯ�����ּ���.");
			return;
		}else {
			String result = "��[�ڸ��� IT ��ī���� ����Ե�]��\n";
			while (iter.hasNext()) {
				Teachers teachers =iter.next();
				result += teachers.show() + "\n";
			}
			JOptionPane.showMessageDialog(null, result);
		}
	}//end list
	
	public void teacherNumList () {
		Iterator<Teachers> iter = arTeachers.iterator();
		if (arTeachers.isEmpty()) {
			return;
		}else {
			String result = "��[�ڸ��� IT ��ī���� ����Ե�]��\n";
			while (iter.hasNext()) {
				Teachers teachers =iter.next();
				result += teachers.showNum() + "\n";
			}
			JOptionPane.showMessageDialog(null, result);
		}
	}//end list
	
//	public void assignClass() {
//		if (arTeachers.isEmpty() || StudentsBook.isEmpty()) {
//			JOptionPane.showMessageDialog(null, "������ ������ Ȯ�����ּ��� \n"
//					+ "�� �����԰� �л��� ��� ����� �Ǿ��־�� �մϴ�.");
//			return;
//		}
//		r.nextInt(StudentsBook.size());
//	}//end assign
	


	
	
	
}
