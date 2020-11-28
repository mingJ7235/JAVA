package kookbi;

import java.awt.HeadlessException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LibraryMagagements_Joption extends StudentManagements_Joption{
	//������
	//å�� ����Ʈ���ϰ�,
	//������ �л� ����� �˻��� �� ����
	ArrayList<Books> arBooks = new ArrayList<>();
	Books books = null;
	LinkedHashMap<Students, Books> arRentList = new LinkedHashMap<>();
	ImageIcon libraryMainImg = new ImageIcon("src/img/librarymain.gif");
	ImageIcon libraryInsertImg = new ImageIcon("src/img/libraryInsert.gif");
	
	int choice;
	public void libararyView () {
		boolean flag = false;
		String menu [] = {"å ���", "��ϵ� å ��ȸ", "å �˻�", "å �뿩", "�뿩�� ����Ʈ", "��������"};
		
		while (!flag) {
			choice = JOptionPane.showOptionDialog(null, "[�ڸ��� IT ��ī���� �������� �����ϼ̽��ϴ�.]\n"
					+ "�Ʒ��� �޴��� �����Ͽ� �������� �������ּ���", "������ ���� Menu", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, libraryMainImg, menu, null);
			if (choice == -1 || choice == 5) break;
			switch (choice) {
			//å ���
			case 0 :
				listUp();
				break;
			//��ϵ� å ��ü ��ȸ
			case 1 :
				bookList();
				break;
			//å �˻�
			case 2 :
				bookSearch();
				break;
			//å �뿩
			case 3 :
				rent();
				break;
			case 4 :
				rentList();
				break;
			case 5 :
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
				books = new Books(bookName, author, volume);
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
		if (arBooks.size() == 0) {
			result = "�������� ��ϵ� å�� �����ϴ�.";
		} else {
			result += "��[������ �������� å ���]��\n";
			for (int i = 0; i < arBooks.size(); i++) {
				result += arBooks.get(i) + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}
	//å �˻�
	public void bookSearch () {
		Iterator<Books> iter = arBooks.iterator();
		String result = "";
		if (arBooks == null) {
			result += "�������� ��ϵ� å�� �����ϴ�.";
		}else {
			String bookname = JOptionPane.showInputDialog("��[å ���� �˻�]��"
				+ "\n�˻��� å ������ ���ּ���.\n");
			while (iter.hasNext()) {
				Books temp = iter.next();
				if (bookname.equals(temp.getBookName())) {
					result += "[�˻��� �ڷ�� �Ʒ��� �����ϴ�.]\n";
					result += temp.toString();
				}
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}
	//å �뿩
	public void rent () {
		Iterator<Students> stIter = StudentsBook.keySet().iterator();
		Iterator<Books> bIter = arBooks.iterator();
		String result = "";
		boolean rentCheck = false;
		if (!(StudentsBook.size()==0)) {
			JOptionPane.showMessageDialog(null, "���� ��ϵ� �л��� �Դϴ�");
			list(StudentsBook);
			Integer number = 0;
			try {
				number = Integer.parseInt(JOptionPane.showInputDialog("å�� �뿩�� �л� �й��� ���ּ���"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "���ڷ� �Է����ּ���");
			}
			while (stIter.hasNext()) {
				Students std = stIter.next();
				if(std.getNumber() == number) {
					JOptionPane.showMessageDialog(null, "���� �������� ��ϵ� å ����� �����帮�ڽ��ϴ�.");
					bookList();
					String book = JOptionPane.showInputDialog("�뿩�� å�� ������ �Է����ּ���");
					rentCheck = true;
					while (bIter.hasNext()) {
						Books temp = bIter.next();
						if (book.equals(temp.getBookName())) {
							
							arRentList.put(std, books);
							
							JOptionPane.showMessageDialog(null, std.getName() +" �л����� "
									+ books.getBookName() +" å �뿩�� �Ϸ�Ǿ����ϴ�.");
							rentCheck = true;
						}else {
							JOptionPane.showMessageDialog(null, "�ش��ϴ� å�� �������� �����ϴ�.");
						}
					}
				} else {
					if (number instanceof Integer && !rentCheck) {
						JOptionPane.showMessageDialog(null, "�ش� �й��� �л��� �����ϴ�.");
					}
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "��ϵ� �л��� �����ϴ�.");
		}
	}
	//å �뿩 �л� ����Ʈ
	public void rentList () {
		String result = "";
//		result += arRentList.get(std).getBookName();
		JOptionPane.showMessageDialog(null, result);
	}
}




