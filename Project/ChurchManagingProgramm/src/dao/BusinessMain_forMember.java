package dao;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class BusinessMain_forMember {
	static Font myFont = new Font ("�޸�����ü", Font.PLAIN, 15);
	int choice = 0;
	
	public void view () {
		boolean viewFlag = false;
		String [] menu = {"ȸ�� ���", "ȸ�� ����", "ȸ�� ����", "�⼮����"};
		UIManager.put("OptionPane.messageFont", myFont);		
		while (!viewFlag) {
			choice = JOptionPane.showOptionDialog(null, "[û��� ȸ�� ���� ���α׷�]\n"
					+ "�Ʒ� �޴��� �������ּ���", "û��� ȸ�� ���� ���α׷�", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, null, menu, null);
			if (choice == -1) break;
			switch (choice) {
			case 0 : 
				register();
				break;
			case 1 :
				update ();
				break;
			case 2: 
				delete ();
				break;
			case 3 :
				attend ();
				break;
			}
		}
	}
	//û��� ȸ�� ���
	public void register () {
		
	}
	//ȸ�� ����
	public void update () {
		
	}
	//ȸ�� ����
	public void delete () {
		
	}
	//�⼮ ����
	public void attend () {
		
	}
	
}
