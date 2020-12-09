package kookbi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LibraryMagagements_Joption extends StudentManagements_Joption{
	//������
	//å�� ����Ʈ���ϰ�,
	//������ �л� ����� �˻��� �� ����
	Books books = null;
	ArrayList<Books> arBooks = new ArrayList<>();
	LinkedHashMap<Students, Books> arRentList = new LinkedHashMap<>();
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
				rent();
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
	public void rent () {
		Iterator<Students> stIter = StudentsBook.keySet().iterator();
		Iterator<Books> bIter = arBooks.iterator();
		String result = "";
		boolean rentCheck = false;
		if (!(StudentsBook.size()==0) && !(arBooks.size() ==0)) {
			JOptionPane.showMessageDialog(null, "���� ��ϵ� �л��� �뿩 �ڵ� ��ȣ ����Ʈ �Դϴ�");
			libraryCodeList(StudentsBook);
			String stCode = JOptionPane.showInputDialog("å�� �뿩�� �л� �ڵ带 ���ּ���");
			while (stIter.hasNext()) {
				Students std = stIter.next();
				if(std.getLibraryCode().equals(stCode)) {
					JOptionPane.showMessageDialog(null, std.getName() + "�л� ȯ���մϴ�. \n"
							+ "���� �������� ��ϵ� å ����� �����帮�ڽ��ϴ�.");
					bookList();
					String book = JOptionPane.showInputDialog("�뿩�� å�� ������ �Է����ּ���");
					
					while (bIter.hasNext()) {
						Books temp = bIter.next();
						if (book.equals(temp.getBookName()) && temp.getRent().equals("�뿩 ����")) {
							arRentList.put(std, temp);
							temp.setRent("�뿩 ��");
							temp.setRentTime(sdf.format(new Date()));
							JOptionPane.showMessageDialog(null, std.getName() +" �л����� "
									+ temp.getBookName() +" å �뿩�� �Ϸ�Ǿ����ϴ�.\n"
									+ "�뿩�� : " + temp.getRentTime());
							rentCheck = true;
							
						}else if (!book.equals(temp.getBookName())) {

						}else if (!temp.getRent().equals("�뿩 ����")) {
							JOptionPane.showMessageDialog(null, "�� å�� �뿩�������� �ʽ��ϴ�.");
							return;
						}
					}
				}else if (!std.getLibraryCode().equals(stCode)){
					
				}else {
					JOptionPane.showMessageDialog(null, "����� �л��� �����ϴ�.");
					return;
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "������ ������ �ֽ��ϴ� �ٽ� �� �� Ȯ�����ּ���.");
		}
		if (!(arBooks.size()==0) && !(StudentsBook.size() ==0) && !rentCheck) {
			bookList();
		}
	}
	
	public void returnBook (LinkedHashMap<Students, Books> arRentList) {
		String result = "";
		if (arRentList.size() ==0) {
			JOptionPane.showMessageDialog(null, "�뿩�� å�� �����ϴ�. ");
			return;
		}else {
			Iterator<Map.Entry<Students, Books>> iter = arRentList.entrySet().iterator();
			String bookName = JOptionPane.showInputDialog("[å �ݳ� �޴��Դϴ�.]\n"
					+ "�ݳ��Ͻ� å ������ ���ּ���.") ;
			while(iter.hasNext()) {
				Map.Entry<Students, Books> temp = iter.next();
				if(bookName.equals(temp.getValue().getBookName()) && temp.getValue().getRent().equals("�뿩 ��")) {
					temp.getValue().setReturnTime(sdf.format(new Date()));
					temp.getValue().setRent("�뿩 ����");
					JOptionPane.showMessageDialog(null, temp.getKey().getName() + "�л� " + 
							temp.getValue().getBookName()+ " �ݳ��� �Ϸ�Ǿ����ϴ�.\n"
							+"�ݳ��� : " + temp.getValue().getReturnTime());
					arRentList.remove(temp.getKey()); 
					break;
				}else {
					JOptionPane.showMessageDialog(null, "������ �ٽ� Ȯ�� ���ּ���. ");
					break;
				}
			}
		}
		if (!(arRentList.size()==0)) {
			bookList();
		}
	}
}
