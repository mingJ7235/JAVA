package ams;

public class AmsField {
	//�װ���, �װ����ȣ, �ִ�°���, �����, ������
	
	String [][] arrPlane = new String [100][5];
	int cnt;
	int showCnt;
	int cLength = arrPlane[0].length;
	String result = "";
	int updateIndex;
	
	//�߰��ϱ�
	void insert (String [] arPlane) {
		arrPlane [cnt] = arPlane;
		cnt ++;
	}
	
	//�˻��ϱ�
	String search (String keyword, int index) {
		int arIndex [];
		String result = "";
		int searchCnt = 0;
		for (int i = 0; i < cnt; i++) {
			if (keyword.equals(arrPlane[i][index])) {
				searchCnt++;
				updateIndex = i;
				result += "" + i + ",";
			}
		}
		arIndex = new int[searchCnt];
		for (int i = 0; i < arIndex.length; i++) {
			arIndex[i] = Integer.parseInt(result.split(",")[i]);
		}
		return show(arIndex); 
	}
	
	//�����ϱ�
	void update (int btnIndex, String newValue) {
				arrPlane[updateIndex][btnIndex + 3] = newValue;
				//btnIndex
				//����� : 0
				//������ : 1
				//�� index ��ȣ
				//����� : 3
				//������ : 4
			}
		
	
	
	//�����ϱ�
	boolean delete (String keyword) {
		boolean deleteCheck = false;
		
		for (int i = 0; i < cnt; i++) {
			if (arrPlane[i][1].equals(keyword)) {
				//cnt -1 : ������ ������ ��� ��
				//cnt : null�� ��� ��
				for (int j = i; j < cnt; j++) {
					arrPlane[j] = arrPlane[j+1];
					
				}
				deleteCheck = true;
				cnt--;
				break;
			}
		}
		return deleteCheck;
	}
	
	//��Ϻ���
	String show () {
		String result = "�װ���, �װ����ȣ, �ִ�°���(��), �����, ������\n";
		
		for (int i = 0; i < cnt; i++) {
			result += " �� ";
			for (int j = 0; j < cLength; j++) {
				//3�׿����� ���� :  '���ǽ� ? true : false' 
				result += j == cLength -1 ? arrPlane[i][j] : arrPlane[i][j] + ",  ";
				
			}
			result += "\n";
		}
		if (cnt == 0 ) result = "��� ����";
		return result;
	}
	
	//�˻���� ����
	String show (int [] arIndex) {
		String result = "�װ���, �װ����ȣ, �ִ�°���(��), �����, ������\n";
		
		for (int i = 0; i < arIndex.length; i++) {
			result += " �� ";
			for (int j = 0; j < cLength; j++) {
				result += arrPlane[arIndex[i]][j] ;
				result += j == cLength -1 ? "" : ",  ";
			}
			result += "\n";
		}
		if (arIndex.length == 0 ) result = "�˻� ��� ����";
		return result;
	}
}
