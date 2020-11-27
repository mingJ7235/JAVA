package kookbi;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LibraryMagagements_Joption {
	//������
	//å�� ����Ʈ���ϰ�,
	//������ �л� ����� �˻��� �� ����
	ArrayList<Books> arBooks = new ArrayList<>();
	ImageIcon libraryMainImg = new ImageIcon("src/img/librarymain.gif");
	ImageIcon libraryInsertImg = new ImageIcon("src/img/libraryInsert.gif");
	
	int choice;
	public void view () {
		boolean flag = false;
		String menu [] = {"å ���", "��ϵ� å ��ȸ", "å �뿩", "�뿩�� ����Ʈ ��ȸ"};
		
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
				String bookName = JOptionPane.showInputDialog("����� å ������ �����ּ���");
				String author = JOptionPane.showInputDialog(bookName + "�� ���ڸ� �����ּ���");
				int volume;
				try {
					volume = Integer.parseInt(JOptionPane.showInputDialog(bookName+ "�� ���������� �����ּ���"));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "���ڸ� �Է����ּ���");
					break;
					//return�ϸ� ���ɵ�?
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "�����Դϴ�. �ٽ��Է����ּ���");
					break;
				}
				Books books = new Books(bookName, author, volume);
//				arBooks = new ArrayList<>();
				arBooks.add(books);
				JOptionPane.showMessageDialog(null, bookName + " å�� ������ �ԷµǾ����ϴ�.");
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
		String result = "";
		if (arBooks == null) {
			result = "�������� ��ϵ� å�� �����ϴ�.";
		} else {
			result += "��[������ �������� å ���]��\n";
			for (int i = 0; i < arBooks.size(); i++) {
				result += arBooks.get(i) + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}
	//å �뿩
	public void rent () {
		
	}
	//å �뿩 �л� ����Ʈ
	public void rentList () {
		
	}
}
