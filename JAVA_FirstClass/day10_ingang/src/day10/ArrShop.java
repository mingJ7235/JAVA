package day10;


import javax.swing.JOptionPane;

public class ArrShop {
	//����Ű
	//������, ȫ����, ����
	//����, Ű��
	// ������ Ű��, ȫ���� Ű��, ���� Ű��
	// ������ ����, ȫ���� ����, ���� ����
	public static void main(String[] args) {
		int [][] arrIncome = new int [2][3]; 
		int [] arASum = new int [2];
				//���ɺ��̴ϱ� A K �ΰ����ϱ� 2��¥�� �迭
		int [] arBSum = new int [3];
				//�������̴ϱ� 3�����ϱ� 3��¥�� �迭
		int sum = 0; 
		double [] aAvg = new double [2];
		double [] bAvg = new double [3];
		double avg = 0.0;
		
		int rLength = arrIncome.length;
		int cLength = arrIncome[0].length;
		String result = "__________________________\n";
		
		String [][] arrName = {
				{"������ A", "ȫ���� A", "���� A"},
				{"������ K", "ȫ���� K", "���� K"}
		};
		
		String [] arAName = {"����", "Ű��"};
		String [] arBName = {"������", "ȫ����", "����"};
		
		String inputMsg = "������� �Է��ϼ���.";
//2�� 3���̴ϱ� 2�� for���� ����. 				
		for (int i = 0 ; i < rLength; i++) {
			for (int j = 0; j < cLength; j++) {
				arrIncome[i][j] = Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j] + " " + inputMsg));
				// ���ɺ� sum�� ������Ų ��. 
				arASum[i] += arrIncome [i][j];
				// �������̶� j �� ������Ű�� arrIncome ���� ������Ų ��. 
				arBSum[j] += arrIncome [i][j];
				sum += arrIncome[i][j];
				//�� �����

			}
		}
		for (int i = 0 ; i <aAvg.length; i++) {
			aAvg[i] = Double.parseDouble(String.format("%.2f", (double)arASum[i] / arBSum.length));
		}
		for (int i = 0 ; i <bAvg.length; i++) {
			bAvg[i] = Double.parseDouble(String.format("%.2f", (double)arBSum[i] / arASum.length));
		//���ɺ� ����� ���
		}
		
		avg = Double.parseDouble(String.format("%.2f", (double)sum / (rLength * cLength)));
		
		for (int i = 0 ; i < rLength ; i++) {
			for (int j = 0 ; j < cLength ; j++) {
				result += arrName [i][j] + "����� : " + arrIncome[i][j] + "����\n";
				
			}
			//���ɺ� �����
			result += arAName[i] + " �� ����� : " + arASum[i] + "����\n";
			result += arAName[i] + " ��� ����� : " + aAvg[i] + "����\n";
			result += "__________________________\n";
			
		}
		for (int i = 0 ; i < arBSum.length; i++) {
			result += arBName[i] + " �� ����� : " + arBSum[i] + "����\n";
			result += arBName[i] + " ��� ����� : " + bAvg[i] + "����\n";
			result += "__________________________\n";
		}
		
		result += "�� ����� : " + sum + "����\n";
		result += "��� ����� : " + avg + "����\n";
		result += "__________________________\n";
		
		JOptionPane.showMessageDialog(null, result);
				
				
	}
}

