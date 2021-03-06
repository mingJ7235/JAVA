package kookbi;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.util.Map.Entry;

public class StudentManagements_Joption{

	Scanner sc = new Scanner(System.in);
	final public int SUBJECTS = 3;
	String arSubjects[] = {
			"C언어", "JAVA", "Spring", "평균"
	};
	ArrayList<Integer> arScores = null;
	LinkedHashMap<Students, ArrayList<Integer>> StudentsBook = new LinkedHashMap<>();
	ImageIcon mainImg = new ImageIcon("src/img/giphy.gif");
	ImageIcon insertImg = new ImageIcon("src/img/insert.gif");
	ImageIcon updateImg = new ImageIcon("src/img/source.gif");
	
	int choice;
	
	public void studentView () {
		String menu [] = {"학생부 등록", "학생부 검색", "학생부 삭제", "학생부 수정", "학생부 조회", "장학생 조회", "재수강자 조회", "메인으로"};
		
		while (true) {
			choice = JOptionPane.showOptionDialog(null, "[코리아 IT 아카데미 학생관리 프로그램입니다..]\n"
					+ "아래의 메뉴를 선택하여 학생들을 관리해주세요 :)", "학생부 관리 Menu", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, mainImg, menu, null);
			if (choice == -1|| choice == 7) break;
			
			switch (choice) {
			case 0:
				insert();
				break;
			case 1:
				search();
				break;
			case 2:
				delete();
				break;
			case 3:
				update();
				break;
			case 4:
				list (StudentsBook);
				break;
			case 5:
				list_scholarship(StudentsBook);
				break;
			case 6:
				list_fail_students(StudentsBook);
				break;
			case 7: 
				break;
			}
		} 
	}
	void insert () {
		boolean check = true;
		while (check) {
			String [] yesOrno = {"YES", "NO"};
			
			choice = JOptionPane.showOptionDialog(null, "♡[학생부 등록]♡ \n학생 등록을 진행하시겠습니까?", "학생부 등록", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, insertImg, yesOrno, null);
			
			boolean flag = false;
			if (choice == -1) break;
			switch (choice) {
			case 0 :
				String name = JOptionPane.showInputDialog("등록할 학생 이름을 적어주세요");
				int age;
				
				try {
					age = Integer.parseInt(JOptionPane.showInputDialog(name + "학생의 나이를 입력해주세요"));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "숫자로 입력해주세요");
					break;
				}
				
				int total= 0, avg = 0;
				int c_score = 0, java_score = 0, spring_score = 0;
				arScores = new ArrayList<>();
				try {
					c_score = Integer.parseInt(JOptionPane.showInputDialog(name + " 학생의 C언어 점수를 입력해주세요"));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "숫자로 입력해주세요");
					break;
				}
				if(c_score < 0 || c_score > 100) {
					JOptionPane.showMessageDialog(null, "점수는 0점에서 100점 사이입니다.");
					break;
				}
				
				try {
					java_score = Integer.parseInt(JOptionPane.showInputDialog(name + " 학생의 JAVA 점수를 입력해주세요"));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "숫자로 입력해주세요");
					break;
				}
				if(java_score < 0 || java_score > 100) {
					JOptionPane.showMessageDialog(null, "점수는 0점에서 100점 사이입니다.");
					break;
				}
				
				try {
					spring_score = Integer.parseInt(JOptionPane.showInputDialog(name + " 학생의 Spring 점수를 입력해주세요"));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "숫자로 입력해주세요");
					break;
				}
				if(spring_score < 0 || spring_score > 100) {
					JOptionPane.showMessageDialog(null, "점수는 0점에서 100점 사이입니다.");
					break;
				}
				arScores.add(c_score);
				arScores.add(java_score);
				arScores.add(spring_score);
				
				Students std = new Students(name, age);
				//평균점수 등록
				for (int j = 0; j < SUBJECTS; j++) {
					total +=arScores.get(j);
				}
				avg = (total / SUBJECTS);
				arScores.add(avg);
				StudentsBook.put(std, arScores);
				JOptionPane.showMessageDialog(null, name + "학생의 정보가 입력되었습니다.");
				list(StudentsBook);
				continue;
				
			case 1 : 
				JOptionPane.showMessageDialog(null, "학생 등록을 취소합니다.");
				check = false;
				break;
			}
		}
	}
	void search () {
		boolean searchCheck = false;
		Iterator<Students> iter = StudentsBook.keySet().iterator();
		if (StudentsBook.size() ==0 ) {
			JOptionPane.showMessageDialog(null, "등록된 학생이 없습니다. 다시 확인해주세요..");
			return;
		}
		String name = JOptionPane.showInputDialog("♡[학생 검색]♡"
				+ "\n검색할 학생의 이름을 써주세요.");
		String result = "";
		while(iter.hasNext()) {
			Students std = iter.next();
			if(name.equals(std.getName())) {
				result +=  std.show()+"\n"
				+ arSubjects[0] + " : " + StudentsBook.get(std).get(0) + "점 "
				+ arSubjects[1] + " : " + StudentsBook.get(std).get(1) + "점 "
				+ arSubjects[2] + " : " + StudentsBook.get(std).get(2) + "점 "
				+ arSubjects[3] + " : " + StudentsBook.get(std).get(3) + "점\n";
				searchCheck = true;
				if (StudentsBook.get(std).get(3) >= 85) {
					result += "축하합니다. " + name + "학생은 장학생입니다.\n"
							+ "===============\n";
				} else if (StudentsBook.get(std).get(3) <= 60) {
					result += ""+ name+ "학생은 재수강 대상자입니다. 분발하세요.\n"
							+ "===============\n";
				} else {
					result += "===============\n";
				}
			}
		}
		if (searchCheck) {
			JOptionPane.showMessageDialog(null, "====[검색 결과]====\n" + result);
		}else {
			JOptionPane.showMessageDialog(null, "검색된 학생이 없습니다.");
		}
	}
	
	void update () {
		boolean flag = false;
		Iterator<Students> iter = StudentsBook.keySet().iterator();
		if(StudentsBook.size() == 0) {
			JOptionPane.showMessageDialog(null, "등록된 학생이 없습니다. 다시 확인해주세요..");
			return;
		}
		list(StudentsBook);
		int num = 0, choice = 0;
		String result = "";
		String [] updateMenu = {"신상정보 수정", "점수 수정"};
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog("수정할 학생의 번호를 입력해주세요."));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "숫자로 입력해주세요");
		}
		while (iter.hasNext()) {
			Students std = iter.next();
			if (num == std.getNumber()) {
				flag = true;
				choice = JOptionPane.showOptionDialog(null, "♡[정보수정]♡ \n" + std.getName() + "학생의 어떤 정보를 수정하겠습니까?", "학생부 수정", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, updateImg, updateMenu, null);
				switch (choice) {
				case 0 :
					JOptionPane.showMessageDialog(null, "[신상정보 수정]"
							+ "\n이름, 나이를 순서대로 입력하세요.");
					std.setName(JOptionPane.showInputDialog("변경할 이름을 적어주세요"));
					try {
						std.setAge(Integer.parseInt(JOptionPane.showInputDialog("변경할 나이를 적어주세요")));
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "숫자를 입력해주세요 \n입력을 취소합니다.");
						break;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "오류입니다. \n입력을 취소합니다.");
						break;
					}
					JOptionPane.showMessageDialog(null, "신상정보 수정 완료");
					break;
				case 1: 
					int total = 0, avg = 0;
					int updateCScore = 0, updateJAVAScore =0, updateSpringScore =0;
					JOptionPane.showMessageDialog(null, "[점수 수정] \n각 과목의 수정될 점수를 입력해주세요.");
					try {
						updateCScore = Integer.parseInt(JOptionPane.showInputDialog(std.getName() + " 학생의 C언어 점수를 입력해주세요"));
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "숫자로 입력해주세요");
						break;
					}
					if(updateCScore < 0 || updateCScore > 100) {
						JOptionPane.showMessageDialog(null, "점수는 0점에서 100점 사이입니다.");
						break;
					}
					
					try {
						updateJAVAScore = Integer.parseInt(JOptionPane.showInputDialog(std.getName() + " 학생의 JAVA 점수를 입력해주세요"));
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "숫자로 입력해주세요");
						break;
					}
					if(updateJAVAScore < 0 || updateJAVAScore > 100) {
						JOptionPane.showMessageDialog(null, "점수는 0점에서 100점 사이입니다.");
						break;
					}
					
					try {
						updateSpringScore = Integer.parseInt(JOptionPane.showInputDialog(std.getName() + " 학생의 Spring 점수를 입력해주세요"));
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "숫자로 입력해주세요");
						break;
					}
					if(updateSpringScore < 0 || updateSpringScore > 100) {
						JOptionPane.showMessageDialog(null, "점수는 0점에서 100점 사이입니다.");
						break;
					}
					
					StudentsBook.get(std).set(0, updateCScore);
					StudentsBook.get(std).set(1, updateJAVAScore);
					StudentsBook.get(std).set(2, updateSpringScore);
					
					for (int j = 0; j < SUBJECTS; j++) {
						total +=StudentsBook.get(std).get(j);
					}
					avg = (total / SUBJECTS);
					StudentsBook.get(std).set(3, avg);
					JOptionPane.showMessageDialog(null, "성적 수정 완료");
					break;
				}
			}
			break;
		}
		if (!flag) {
			JOptionPane.showMessageDialog(null, "수정할 학생의 번호를 다시 확인해 주세요");
		}
		if(!(StudentsBook.size() == 0))list(StudentsBook);
	}
	
	void delete () {
		int num = 0;
		if (StudentsBook.size() == 0) {
			JOptionPane.showMessageDialog(null, "등록된 학생이 없습니다. 다시 확인해주세요..");
			return;
		}
		Students delStd = null;
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog("♡[학생부 삭제]♡"
					+ "\n삭제할 학생의 학번을 입력해주세요 : "));
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "번호를 입력해주세요");
			return;
		}
		Iterator<Students> iter = StudentsBook.keySet().iterator();
		while (iter.hasNext()) {
			Students std = iter.next();
			if (num == std.getNumber()) {
				delStd =std;
			}
		}
		if(delStd == null) {
			JOptionPane.showMessageDialog(null, "찾는 학생이 없습니다. 다시 학번을 확인해주세요");
		}else {
			StudentsBook.remove(delStd);
			JOptionPane.showMessageDialog(null, "해당 번호의 학생이 삭제 되었습니다.");
			if (!(StudentsBook.size() == 0)) {
				list(StudentsBook);
			}
		}
	}
	
	void list (LinkedHashMap<Students, ArrayList<Integer>> book) {
		Iterator<Map.Entry<Students, ArrayList<Integer>>> iter = book.entrySet().iterator();
		int size = StudentsBook.size();
		if (size == 0) {
			JOptionPane.showMessageDialog(null, "등록된 학생이 없습니다. 다시 확인해주세요.");
			return;
		}else {
			String result = "♡[코리아 IT 아카데미 학생]♡\n";
			while (iter.hasNext()) {
				Entry<Students, ArrayList<Integer>> temp = iter.next();
				result += temp.getKey().show() + "\n";
				result += "|  C언어  |  JAVA  |  Spring  |  평균  | \n";
				for (int score : temp.getValue()) {
					result += "      "+ score + "점 ";
				}
				result += "\n";
			}
			JOptionPane.showMessageDialog(null, result);
		}
	}
	
	void libraryCodeList (LinkedHashMap<Students, ArrayList<Integer>> book) {
		Iterator<Map.Entry<Students, ArrayList<Integer>>> iter = book.entrySet().iterator();
		int size = StudentsBook.size();
		if (size == 0) {
			JOptionPane.showMessageDialog(null, "등록된 학생이 없습니다. 다시 확인해주세요.");
			return;
		}else {
			String result = "♡[학생 도서 대여 코드]♡\n";
			while (iter.hasNext()) {
				Entry<Students, ArrayList<Integer>> temp = iter.next();
				result += temp.getKey().libraryShow() + "\n";
			}
			JOptionPane.showMessageDialog(null, result);
		}
	}
	void list_scholarship (LinkedHashMap<Students, ArrayList<Integer>> book) {
		Iterator<Map.Entry<Students, ArrayList<Integer>>> iter = book.entrySet().iterator();
		int size = StudentsBook.size();
		int avg = 0;
		boolean flag = false;
		String result = "";
		if (size == 0)  {
			result += "등록된 학생이 없습니다. 다시 확인해주세요.";
			flag = true;
		}else {
			result += "♥[코리아 IT 아카데미 장학생]♥"
					+ "\n(장학생은 평균점수 85점 이상인 학생들입니다.)\n";
			while (iter.hasNext()) {
				Entry<Students, ArrayList<Integer>> std = iter.next();
				avg = std.getValue().get(3);
				if (avg >= 85) {
					result += "★장학생 : " + std.getKey().getName()+"★";
					flag = true;
				}
			}
		}
		if (!flag) {
			result += "장학생은 없습니다.\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}
	void list_fail_students (LinkedHashMap<Students, ArrayList<Integer>> book) {
		Iterator<Map.Entry<Students, ArrayList<Integer>>> iter = book.entrySet().iterator();
		int size = StudentsBook.size();
		int avg = 0;
		String result = "";
		boolean flag = false;
		if (size == 0) {
			result = "등록된 학생이 없습니다. 다시 확인해주세요. ";
			flag = true;
		}else {
			result += "◆[재수강 대상자]◆"
					+ "\n(재수강 대상자는 평균점수 60점 아래인 학생들입니다.)\n";
			while (iter.hasNext()) {
				Entry<Students, ArrayList<Integer>> std = iter.next();
				avg = std.getValue().get(3);
				if (avg <= 60) {
					result += "♠재수강 대상자 : " + std.getKey().getName()+"♠";
					flag = true;
				}
			}
		}
		if (!flag) {
			result += "재수강 대상자는 없습니다.\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}
}