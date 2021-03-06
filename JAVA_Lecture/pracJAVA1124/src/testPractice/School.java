package testPractice;

import java.util.Scanner;

public class School {
	Scanner sc = new Scanner(System.in);
	Students [][] studentbook = new Students [3][5]; 
	int choice = 0;
	int eleStd = 0, midStd = 0, highStd = 0;
	
	public void view () {
		System.out.println("학생의 grade를 확인해주세요"
				+ "\n1. 초등학생"
				+ "\n2. 중학생"
				+ "\n3. 고등학생");
		choice = sc.nextInt();
		switch(choice) {
		case 1 : 
			input();
			output();
			break;
		case 2 : 
			input();
			output();
			break;
		case 3 : 
			input();
			output();
			break;
		default :
			break;
		}
	}
	//입력
	public void input () {
		Students std = new High();
		System.out.print("과목을 입력해주세요 : ");
		std.subject = sc.next();
		System.out.print("중간고사 점수 : ");
		std.midterm = sc.nextInt();
		System.out.print("기말고사 점수 : ");
		std.finalterm = sc.nextInt();
		System.out.print("수행평가 점수 :");
		std.exp = sc.nextInt();
		std.total();
		if (choice == 1) { //초딩
			studentbook [choice-1][eleStd++] = std;
		}else { //중딩
			Middle mid = (Middle) std;
			System.out.println("출석점수를 입력해주세요");
			mid.attend = sc.nextInt();
			System.out.println("담당교사 이름을 입력해주세요 ");
			mid.teacher = sc.next();
			System.out.println("봉사점수를 입력해주세요");
			mid.volunteer = sc.nextInt();
			if (choice ==2) {
				studentbook [choice-1][midStd++] = mid;
			}else { //고딩
				High high = (High) mid;
				high.avg();
				studentbook [choice-2][highStd++] = high;
			}
		}
	}
	//출력
	public void output () {
		switch (choice) {
		case 1 : 
			System.out.println("초등학생 성적입니다.");
			for (int i = 0; i < eleStd; i++) {
				Elementary ele = (Elementary) studentbook[0][i];
				System.out.println("과목 : " + ele.subject + "\n중간고사 : " + ele.midterm + " 기말고사 : " + ele.finalterm
						+ " 수행평가 : " + ele.exp + "점수 : "  + ele.total());
			}
			break;
		case 2 : 
			System.out.println("중학생 성적입니다.");
			for (int i = 0; i < midStd; i++) {
				Middle mid = (Middle) studentbook[1][i];
				System.out.println("과목 : " + mid.subject + "담당교사 : " + mid.teacher + "\n중간고사 : " + mid.midterm + " 기말고사 : " + mid.finalterm
						+ " 수행평가 : " + mid.exp + " 출석점수 : " + mid.attend + " 봉사점수 : " + mid.volunteer + "\n점수 : " + mid.total());
			}
			break;
		case 3 : 
			System.out.println("고등학생 성적입니다.");
			for (int i = 0; i < highStd; i++) {
				High high = (High) studentbook[2][i];
				System.out.println("과목 : " + high.subject + "담당교사 : " + high.teacher + "\n중간고사 : " + high.midterm + " 기말고사 : " + high.finalterm
						+ " 수행평가 : " + high.exp + " 출석점수 : " + high.attend + " 봉사점수 : " + high.volunteer + "\n점수 : " + high.total() + " 평균 " + high.avg());
			}
			break;
		default :
			break;
		}
	}
	
}
