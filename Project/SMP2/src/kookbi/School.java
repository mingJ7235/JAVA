package kookbi;

import javax.swing.JOptionPane;

public class School {
	String [] arMode = {"������ ���� ���", "�л� ���� ���", "���� ���� ���"};
	int choice = 0;
	public void MainView () {
		JOptionPane.showOptionDialog(null, "[�ڸ��� IT ��ī���̿� ���Ű��� ȯ���մϴ�]\n"
				+ "�Ʒ��� �޴��� �����Ͽ� ������ ��带 �������ּ���", "�л��� ���� Menu", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE, null/*�̹���*/, arMode, null);		
		
		
	}
}
