package kookbi;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TeacherManagements_Joption extends LibraryMagagements_Joption{
	
	ImageIcon teacherImg = new ImageIcon("src/img/teacherMain.gif");
	
	
	public void TeachersView ( ) {
		int choice = 0;
		String menu [] = {"���� ���", "���� �˻�", "���� ����", "���� ����", "���� ��ȸ", "���ǽ� ����", "��������"};
		choice = JOptionPane.showOptionDialog(null, "[�ڸ��� IT ��ī���̿� ���Ű��� ȯ���մϴ�]\n"
				+ "�Ʒ��� �޴��� �����Ͽ� �л����� �������ּ��� :)", "�л��� ���� Menu", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE, teacherImg, menu, null);
	}
	
	
	
	
}
