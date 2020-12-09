package kookbi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BE_LibraryMagagements_Joption2_try extends StudentManagements_Joption{
	//������
	//å�� ����Ʈ���ϰ�,
	//������ �л� ����� �˻��� �� ����
	Books books = null;
	ArrayList<Books> arBooks = new ArrayList<>();
	LinkedHashMap<Students, Set <Books>> arRentList = new LinkedHashMap<>();
	ImageIcon libraryMainImg = new ImageIcon("src/img/librarymain.gif");
	ImageIcon libraryInsertImg = new ImageIcon("src/img/libraryInsert.gif");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
	
	int choice;
	String rentResult = "";
	public void libararyView () {
		boolean flag = false;
		String menu [] = {"å ���", "��ϵ� å ��ȸ","�뿩 �ڵ� ��ȸ", "å �˻�", "å �뿩", "å �ݳ�", "��������"};
		
		while (!flag) {
			choice = JOptionPane.showOptionDialog(null, "[�ڸ��� IT ��ī���� ������ ���� ���α׷��Դϴ�.]\n"
					+ "�Ʒ��� �޴��� �����Ͽ� �������� �������ּ���", "������ ���� Menu", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, libraryMainImg, menu, null);
			if (choice == -1 || choice == 6) break;
			switch (choice) {
			//å ���
			case 0 :
				listUp();
				break;
			//��ϵ� å ��ü ��ȸ
			case 1 :
				bookList();
				break;
			case 2 :
				libraryCodeList(StudentsBook);
				break;
			//å �˻�
			case 3 :
				bookSearch();
				break;
			//å �뿩
			case 4 :
				rent(arRentList);
				break;
			case 5 :
				returnBook(arRentList);
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
		String result = "";
		if (arBooks.size () == 0) {
			result += "�������� ��ϵ� å�� �����ϴ�.";
		}else {
			Iterator<Books> iter = arBooks.iterator();
			String bookname = JOptionPane.showInputDialog("��[å ���� �˻�]��"
				+ "\n�˻��� å ������ ���ּ���.\n");
			while (iter.hasNext()) {
				Books temp = iter.next();
				if (bookname.equals(temp.getBookName())) {
					result += temp.toString();
				}
			}
		}
		JOptionPane.showMessageDialog(null, "[�˻��� �ڷ�� �Ʒ��� �����ϴ�.]\n" + result);
	}
	//å �뿩
	public void rent (LinkedHashMap<Students, Set<Books>>arRentList) {
		Iterator<Entry<Students, Set<Books>>> iter = arRentList.entrySet().iterator();
		
		
		
		
		
	}
	
	public void returnBook (LinkedHashMap<Students, Set<Books>> arRentList) {
		String result = "";
		if (arRentList.size() ==0) {
			JOptionPane.showMessageDialog(null, "�뿩�� å�� �����ϴ�. ");
			return;
		}else {
			Iterator<Map.Entry<Students, Set<Books>>> iter = arRentList.entrySet().iterator();
		
			
	}
//	public void returnBook (ArrayList<Books> arBooks) {
//		String result = "";
//		Iterator<Books> iter = arBooks.iterator();
//		if (arBooks.isEmpty()) {
//			JOptionPane.showMessageDialog(null, "��ϵ� å�� �����ϴ�.");
//			return;
//		}
//		String bookName = JOptionPane.showInputDialog("�ݳ��� å ������ �Է����ּ���");
//		while (iter.hasNext()) {
//			Books books = iter.next();
//			if (bookName.equals(books.getBookName()) && books.getRent().equals("�뿩 ��")) {
//				books.setReturnTime(sdf.format(new Date()));
//				JOptionPane.showMessageDialog(null, books.getBookName() +"å�� �ݳ� �Ϸ� �Ǿ����ϴ�.\n" + 
//						"�ݳ� ���� : " + books.getReturnTime());
//			}else if (!(bookName.equals(books.getBookName()))){
//				JOptionPane.showMessageDialog(null, "ã���ô� å�� �����ϴ�.");
//				break;
//			}else if (books.getRent().equals("�뿩 ����")) {
//				JOptionPane.showMessageDialog(null, "�ش� å�� ���� �뿩 �����Դϴ�.");
//				break;
//			}
//			books.setRent("�뿩 ����");
//		}
//		bookList();
//	}
	}
}

