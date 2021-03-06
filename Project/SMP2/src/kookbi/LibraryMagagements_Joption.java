package kookbi;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LibraryMagagements_Joption extends StudentManagements_Joption{
	//도서관
	//책을 리스트업하고,
	//빌려간 학생 목록을 검색할 수 있음
	Books books = null;
	ArrayList<Books> arBooks = new ArrayList<>();
	LinkedHashMap<Students, Books> arRentList = new LinkedHashMap<>();
	ImageIcon libraryMainImg = new ImageIcon("src/img/librarymain.gif");
	ImageIcon libraryInsertImg = new ImageIcon("src/img/libraryInsert.gif");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
	static Font myFont = new Font("맑은 고딕", Font.PLAIN, 15);
	
	int choice;
	String rentResult = "";
	public void libararyView () {
		UIManager.put("OptionPane.messageFont", myFont);
		boolean flag = false;
		String menu [] = {"책 등록", "등록된 책 조회","대여 코드 조회", "책 검색", "책 대여", "책 반납", "메인으로"};
		
		while (!flag) {
			choice = JOptionPane.showOptionDialog(null, "[코리아 IT 아카데미 도서관 관리 프로그램입니다.]\n"
					+ "아래의 메뉴를 선택하여 도서관을 관리해주세요", "도서관 관리 Menu", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, libraryMainImg, menu, null);
			if (choice == -1 || choice == 6) break;
			switch (choice) {
			//책 등록
			case 0 :
				listUp();
				break;
			//등록된 책 전체 조회
			case 1 :
				bookList();
				break;
			case 2 :
				libraryCodeList(StudentsBook);
				break;
			//책 검색
			case 3 :
				bookSearch();
				break;
			//책 대여
			case 4 :
				rent();
				break;
			case 5 :
				returnBook(arRentList);
				break;
			}
		}
	}
	//책 등록
	public void listUp () {
		boolean LUcheck = false;
		while (!LUcheck) {
			String [] yesOrno = {"YES", "NO"};
			choice = JOptionPane.showOptionDialog(null, "♡[책 등록]♡ \n책 등록을 진행하시겠습니까?", "학생부 등록", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, libraryInsertImg, yesOrno, null);
			if (choice == -1) break;
			switch (choice) {
			//책등록 yes
			case 0 :
				String bookName = JOptionPane.showInputDialog("등록할 책 제목을 적어주세요");
				String author = JOptionPane.showInputDialog(bookName + "의 저자를 적어주세요");
				int volume;
				try {
					volume = Integer.parseInt(JOptionPane.showInputDialog(bookName+ "의 페이지수를 적어주세요"));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "숫자를 입력해주세요");
					break;
					//return하면 어케됨?
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "오류입니다. 다시입력해주세요");
					break;
				}
				books = new Books(bookName, author, volume);
				arBooks.add(books);
				JOptionPane.showMessageDialog(null, bookName + " 책의 정보가 입력되었습니다.");
				break;
			//책등록 no
			case 1 :
				JOptionPane.showMessageDialog(null, "책 등록을 종료합니다.");
				LUcheck = true;
				break;
			}
		}
	}
	//책 리스트
	public void bookList() {
		String result = "";
		if (arBooks.size() == 0) {
			result = "도서관에 등록된 책이 없습니다.";
		} else {
			result += "♡[도서관 소장중인 책 목록]♡\n";
			for (int i = 0; i < arBooks.size(); i++) {
				result += arBooks.get(i) + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}
	//책 검색
	public void bookSearch () {
		String result = "";
		if (arBooks.size () == 0) {
			result += "도서관에 등록된 책이 없습니다.";
		}else {
			Iterator<Books> iter = arBooks.iterator();
			String bookname = JOptionPane.showInputDialog("♡[책 제목 검색]♡"
				+ "\n검색할 책 제목을 써주세요.\n");
			while (iter.hasNext()) {
				Books temp = iter.next();
				if (bookname.equals(temp.getBookName())) {
					result += temp.toString();
				}
			}
		}
		JOptionPane.showMessageDialog(null, "[검색된 자료는 아래와 같습니다.]\n" + result);
	}
	//책 대여
	public void rent () {
		Iterator<Students> stIter = StudentsBook.keySet().iterator();
		Iterator<Books> bIter = arBooks.iterator();
		String result = "";
		boolean rentCheck = false;
		if (!(StudentsBook.size()==0) && !(arBooks.size() ==0)) {
			JOptionPane.showMessageDialog(null, "현재 등록된 학생들 대여 코드 번호 리스트 입니다");
			libraryCodeList(StudentsBook);
			String stCode = JOptionPane.showInputDialog("책을 대여할 학생 코드를 써주세요");
			while (stIter.hasNext()) {
				Students std = stIter.next();
				if(std.getLibraryCode().equals(stCode)) {
					JOptionPane.showMessageDialog(null, std.getName() + "학생 환영합니다. \n"
							+ "현재 도서관에 등록된 책 목록을 보여드리겠습니다.");
					bookList();
					String book = JOptionPane.showInputDialog("대여할 책의 제목을 입력해주세요");
					
					while (bIter.hasNext()) {
						Books temp = bIter.next();
						if (book.equals(temp.getBookName()) && temp.getRent().equals("대여 가능")) {
							arRentList.put(std, temp);
							temp.setRent("대여 중");
							temp.setRentTime(sdf.format(new Date()));
							JOptionPane.showMessageDialog(null, std.getName() +" 학생에게 "
									+ temp.getBookName() +" 책 대여가 완료되었습니다.\n"
									+ "대여일 : " + temp.getRentTime());
							rentCheck = true;
							System.out.println(temp.getBookName());
						}else if (!book.equals(temp.getBookName())) {

						}else if (!temp.getRent().equals("대여 가능")) {
							JOptionPane.showMessageDialog(null, "그 책은 대여가능하지 않습니다.");
							return;
						}
					}
				}else if (!std.getLibraryCode().equals(stCode)){
					
				}else {
					JOptionPane.showMessageDialog(null, "등록한 학생이 없습니다.");
					return;
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "누락된 정보가 있습니다 다시 한 번 확인해주세요.");
		}
		if (!(arBooks.size()==0) && !(StudentsBook.size() ==0) && !rentCheck) {
			bookList();
		}
	}
	
	public void returnBook (LinkedHashMap<Students, Books> arRentList) {
		String result = "";
		if (arRentList.size() ==0) {
			JOptionPane.showMessageDialog(null, "대여된 책이 없습니다. ");
			return;
		}else {
			Iterator<Map.Entry<Students, Books>> iter = arRentList.entrySet().iterator();
			String bookName = JOptionPane.showInputDialog("[책 반납 메뉴입니다.]\n"
					+ "반납하실 책 제목을 써주세요.") ;
			while(iter.hasNext()) {
				Map.Entry<Students, Books> temp = iter.next();
				if(bookName.equals(temp.getValue().getBookName()) && temp.getValue().getRent().equals("대여 중")) {
					temp.getValue().setReturnTime(sdf.format(new Date()));
					temp.getValue().setRent("대여 가능");
					JOptionPane.showMessageDialog(null, temp.getKey().getName() + "학생 " + 
							temp.getValue().getBookName()+ " 반납이 완료되었습니다.\n"
							+"반납일 : " + temp.getValue().getReturnTime());
					arRentList.remove(temp.getKey(), temp); 
					System.out.println(temp.getValue().getBookName());
					
					break;
				}else {
					JOptionPane.showMessageDialog(null, "정보를 다시 확인 해주세요. ");
					break;
				}
			}
		}
		if (!(arRentList.size()==0)) {
			bookList();
		}
	}
//	public void returnBook (ArrayList<Books> arBooks) {
//		String result = "";
//		Iterator<Books> iter = arBooks.iterator();
//		if (arBooks.isEmpty()) {
//			JOptionPane.showMessageDialog(null, "등록된 책이 없습니다.");
//			return;
//		}
//		String bookName = JOptionPane.showInputDialog("반납할 책 제목을 입력해주세요");
//		while (iter.hasNext()) {
//			Books books = iter.next();
//			if (bookName.equals(books.getBookName()) && books.getRent().equals("대여 중")) {
//				books.setReturnTime(sdf.format(new Date()));
//				JOptionPane.showMessageDialog(null, books.getBookName() +"책이 반납 완료 되었습니다.\n" + 
//						"반납 일자 : " + books.getReturnTime());
//			}else if (!(bookName.equals(books.getBookName()))){
//				JOptionPane.showMessageDialog(null, "찾으시는 책이 없습니다.");
//				break;
//			}else if (books.getRent().equals("대여 가능")) {
//				JOptionPane.showMessageDialog(null, "해당 책은 현재 대여 가능입니다.");
//				break;
//			}
//			books.setRent("대여 가능");
//		}
//		bookList();
//	}
}
