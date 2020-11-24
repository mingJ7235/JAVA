package ams;

import javax.swing.JOptionPane;

public class AmsField {
	//�װ���, �װ����ȣ, �ִ�°���, �����, ������
	
	String [][] arrPlane = new String [100][5];
	int cnt;
	int showCnt;
	int cLength = arrPlane[0].length;
	int updateIndex;

	//�߰��ϱ�
	void insert (String [] arPlane) {
		arrPlane[cnt] = arPlane;
		cnt++;
	}
	
	//�˻��ϱ�
	String search (String keyword, int index) {
		int [] arIndex;
		String result = "";
		int searchCnt = 0;
		
		for (int i = 0; i < cnt; i++) {
			if(keyword.equals(arrPlane[i][index])) {
				searchCnt++;
				updateIndex = i;
				result = "" + i + ",";
			}
		}
		arIndex = new int [searchCnt];
		for (int i = 0; i < arIndex.length; i++) {
			arIndex [i] = Integer.parseInt(result.split(",")[i]);
		}
		return show(arIndex);
	}
	
	//�����ϱ�
		void update (int btnIndex, String newValue) {
				arrPlane[updateIndex][btnIndex+3] = newValue;
			}
	
	//�����ϱ�
	boolean delete (String keyword) {
		boolean deleteCheck = false;
		
		for (int i = 0; i < cnt ; i++) {
			if (arrPlane[i][1].equals(keyword)) {
				for(int j = i ; j < cnt; j++) {
					//��°�� ���� �ٲ��ַ��� �ϴ� ��. 
					arrPlane [j] = arrPlane [j+1];
				}
				deleteCheck = true;
				cnt --;
				break;
			}
		}
		return deleteCheck;
	}
	
	//��Ϻ���
	String show () {
		String result = "�װ���, �װ����ȣ, �ִ�°���(��), �����, ������\n";
		
		for (int i = 0; i < cnt ; i++) {
			result += "��";
			for (int j = 0; j < cLength; j++) {
				result += j == cLength -1 ? arrPlane[i][j] : arrPlane[i][j] + ",  ";
			}
			result += "\n";
		}
		if (cnt == 0) result = "��� ����";
		return result;
	}
	
	//�˻���� ����
	String show (int [] arIndex) {
		//arIndex��� ���� search �޼��忡�� �˻��� ���ȣ�� arIndex��� �迭�� ��ڴٴ� ���̴�.
		//�����װ��� �˻��ߴµ�, ���� insert���� ������� �����װ� �������� 1, 3, 5 �� �࿡ �ִٸ�
		//arIndex = {1, 3, 5} �� ��� ���̴�. 
		
		String result = "�װ���, �װ����ȣ, �ִ�°���(��), �����, ������\n";
		for (int i = 0; i < arIndex.length; i++) {
			result += "��";
			for (int j = 0; j < cLength; j++) {
				result += arrPlane[arIndex[i]][j];
				result += j == cLength-1 ? "" : ",";
			}
			result += "\n";
		}
		if (arIndex.length == 0) result = "�˻� ��� ����";
		return result;
	}
}
