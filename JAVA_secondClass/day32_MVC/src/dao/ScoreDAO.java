package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import dto.StudentVO;

public class ScoreDAO {
	//������
	public final int SUBJECT_SIZE = 3;
	public Scanner sc = new Scanner(System.in);
	private ArrayList<StudentVO> arStudent = null;
	private ArrayList<Integer> arScore = null;
	//����� : HashMap/ key�� : studentVO, values : arSocre�� Ÿ���� arrayList(Integer) 
	private LinkedHashMap<StudentVO, ArrayList<Integer>> smsMap = new LinkedHashMap<>();
	//LinkedHashMap => ������ �����. ������� link���ȴٰ�����ϸ��. ������� �����̵ȴ�. 
	
	
	public void index () {
		//���� view ��
		int choice = 0;
			do {
				System.out.println("�л� ���� �ý���"
						+ "\n1. ���"
						+ "\n2. �˻�"
						+ "\n3. ����"
						+ "\n4. ����"
						+ "\n5. ������");

				choice = sc.nextInt();
				//���� ��⸦ ���� sc.nextLine����
				sc.nextLine();
				if (choice == 5) break;
				switch (choice) {
				case 1:
					join();
					break;
				case 2:
					search();
					break;
				case 3 :
					delete();
					break;
				case 4 : 
					update();
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			} while (true);
	}
	
	public void join () {
		String isQuit = "";
		do {
			System.out.println("============[�л����� �Է�(����� q)=============");
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			//�Է¹��� �� ����Ű�� �Ա����ؼ� sc.nextLine();�ϳ� �� ���ذ���
			sc.nextLine();
			StudentVO std = new StudentVO(name, age);
			arStudent = new ArrayList<>();
			arScore = new ArrayList<>();
			
			arStudent.add(std);
			//�л��� ����ҿ� �Է�!
			System.out.println("���� ���� ���� ������ �Է��ϼ��� \n���� > 100 90 20");
			for (int i = 0; i < SUBJECT_SIZE; i++) {
				arScore.add(Integer.parseInt(sc.next()));
			}
			//������ arScore�� ���
			smsMap.put(std, arScore);
			//�л�����, ������ Map ����ҿ� ����.
			System.out.println("����?");
			
			//���� �Է� �� ���� ���
			sc.nextLine();
			isQuit = sc.nextLine();
			
		}while(isQuit.intern() != "q");
		//intern()���ؼ� ���� ��������Ѵ�. �׳� isQuit != "q" �ϸ� �ȴ�!!
		list(smsMap);
	}
	
	public void list (LinkedHashMap <StudentVO, ArrayList<Integer>> db) {
		Set<Entry<StudentVO, ArrayList<Integer>>> set = db.entrySet();
		Iterator<Map.Entry<StudentVO, ArrayList<Integer>>> iter = set.iterator();
		int size = smsMap.size();
		
		if (size == 0) {
			System.out.println("��ϵ� �л��� �����ϴ�.");
		}else {
			System.out.println("======[���� ���]======");
			while (iter.hasNext()) {
				//HashMap : FILO (First in Last Out)
				Entry<StudentVO, ArrayList<Integer>> temp = iter.next();
				temp.getKey().show();
				System.out.println("      ����      ����       ����");
				System.out.print("    ");
				for (int score : temp.getValue()) {
					System.out.print(score + "��    ");
				}
				System.out.println("\n");
			}
		}
	}
	
	public void search () {
		Set <StudentVO> scoreSet = smsMap.keySet();
		Iterator<StudentVO> iter = scoreSet.iterator();
		
		String name = null;
		System.out.println("�˻��� �л��� �̸� : ");
		name = sc.nextLine();
		
		System.out.println("======[�˻� ���]======");
		while(iter.hasNext()) {
			StudentVO std = iter.next();
			if(name.equals(std.getName())) {
				std.show();
				System.out.println("      ����      ����       ����");
				System.out.print("    ");
				for(int score : smsMap.get(std)) {
					System.out.print(score + "��    ");
				}
				System.out.println("\n");
			}
		}
	}
	
	public void update () {
		list(smsMap);
		int num = 0, choice = 0;
		boolean isUser = false;
		System.out.println("������ �л��� ��ȣ : ");
		num = sc.nextInt();
		
		Iterator<StudentVO> iter = smsMap.keySet().iterator();
		
		while(iter.hasNext()) {
			StudentVO std = iter.next();
			if (num == std.getNumber()) {
				isUser = true;
				System.out.println("1. �������� \n2. ��������");
				choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1 :
					System.out.println("�̸��� ���̸� ������� �Է��ϼ���.");
					std.setName(sc.next());
					std.setAge(Integer.parseInt(sc.next()));
					sc.nextLine();
					//setter�� ��������� �������!!!! ��������!!!
					System.out.println("�����Ϸ�");
					break;
				case 2 :
					System.out.println("���� ���� ���� ������ ������� �Է��ϼ���.");
					for (int i = 0; i < SUBJECT_SIZE; i++) {
						smsMap.get(std).set(i, sc.nextInt());
					}
					sc.nextLine();
					System.out.println("�����Ϸ�");
					break;
				default:
					isUser = false;
					System.out.println("���� ����");
				}
			}
		}
		if (!isUser) {
			System.out.println("�����Ͻ� �л��� �������� �ʽ��ϴ�. ");
		}
		list(smsMap);
	}
	
	public void delete () {
		//Iterator�� �˻� (��ȣ)
		int num = 0;
		StudentVO delStd = null;
		
		System.out.println("������ �л��� ��ȣ�� �Է��ϼ��� : ");
		num = sc.nextInt();
		//���� ���
		sc.nextLine();
		
//		Set<StudentVO> stdSet = smsMap.keySet();
//		Iterator<StudentVO> iter = stdSet.iterator();
		Iterator <StudentVO> iter = smsMap.keySet().iterator();
		
		while(iter.hasNext()) {
			StudentVO std = iter.next();
			if (num == std.getNumber()) {
				delStd = std;
			}
		}
		if (delStd == null) {
			System.out.println("�л��� �����ϴ�.");
		}else {
			smsMap.remove(delStd);
			System.out.println("���� �Ϸ�");
			list(smsMap);
		}
		
	}
}
