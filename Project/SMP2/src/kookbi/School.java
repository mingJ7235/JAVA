package kookbi;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class School {
	String [] arMode = {"������ ���� ���", "�л� ���� ���", "���� ���� ���"};
	int choice = 0;
	ImageIcon schoolImg = new ImageIcon("src/img/School.gif");
	public void MainView () {
		boolean check = false;
		while (!check) {
			choice = JOptionPane.showOptionDialog(null, "[�ڸ��� IT ��ī���̿� ���Ű��� ȯ���մϴ�]\n"
					+ "�Ʒ��� �޴��� �����Ͽ� ������ ��带 �������ּ���", "�л��� ���� Menu", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, schoolImg, arMode, null);
			if (choice == -1) break;
			switch (choice) {
			case 0 : 
				
				break;
			case 1 : 
				new StudentManagements_Joption().view();;
				break;
			case 2 : 
				
				break;
			
			}
		}
	}
}
