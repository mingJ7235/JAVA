package kookbi;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LibraryMagagements_Joption {
	//������
	//å�� ����Ʈ���ϰ�,
	//������ �л� ����� �˻��� �� ����
	StudentManagements_Joption sm = new StudentManagements_Joption();
	
	ArrayList<Books> arBooks = null;
	ImageIcon libraryMainImg = new ImageIcon("src/img/librarymain.gif");
	ImageIcon libraryInsertImg = new ImageIcon("src/img/libraryInsert.gif");
	
	int choice;
	
	public void view () {
		boolean flag = false;
		String menu [] = {"å ���", "å �˻�", "å �뿩", "�뿩�� ����Ʈ ��ȸ"};
		
		while (!flag) {
			choice = JOptionPane.showOptionDialog(null, "[�ڸ��� IT ��ī���� �������� �����ϼ̽��ϴ�.]\n"
					+ "�Ʒ��� �޴��� �����Ͽ� �������� �������ּ���", "������ ���� Menu", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, libraryMainImg, menu, null);
			if (choice == -1) break;
			switch (choice) {
			//å ���
			case 0 :
				listUp();
				break;
			//å �˻�
			case 1 :
				bookList();
				break;
			//å �뿩
			case 2 :
				rent();
				break;
			//�뿩�� ����Ʈ ��ȸ
			case 3 :
				rentList();
				break;
			}
		}
	}
	
	//å ���
	public void listUp () {
		boolean LUcheck = false;
		while (!LUcheck) {
			String [] yesOrno = {"YES", "NO"};
			
			choice = JOptionPane.showOptionDialog(null, "��[å ���]�� \nå ����� �����Ͻðڽ��ϱ�?", "�л��� ���", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, libraryInsertImg, yesOrno, null);
			if (choice == -1) break;
			
			switch (choice) {
			//å��� yes
			case 0 :
				
				break;
				
			//å��� no
			case 1 :
				JOptionPane.showMessageDialog(null, "å ����� �����մϴ�.");
				LUcheck = true;
				break;
			}
		}
	}
	
	//å ����Ʈ
	public void bookList() {
		
	}
	
	//å �뿩
	public void rent () {
		
	}
	
	//å �뿩 �л� ����Ʈ
	public void rentList () {
		
	}
}
