package day10;

import javax.swing.JOptionPane;

public class ArrShopPrac2 {
	public static void main(String[] args) {
		//�����
		int [][] arrIncome = new int [2][3];
		int sum = 0;
		int [] arASum = new int [2];
		int [] arBSum = new int [3];
		int rLength = arrIncome.length;
		int cLength = arrIncome[0].length;
		
	    double avg = 0.0;
		String [][] arrShop = {
				{"������A","������A","����A"},
				{"������K","������K","����K"}
		};
		// ����� �հ� �ִ� �κ�		
		for (int i = 0; i < rLength; i++) {
			for (int j = 0; j < cLength; j++) {
				arrIncome[i][j] = Integer.parseInt(JOptionPane.showInputDialog(arrShop[i][j]+" �� ������� ���ÿ�. (������ ����)\n"));
				arASum[i] += arrIncome[i][j];
				arBSum[j] += arrIncome[i][j];
				sum += arrIncome[i][j];
			}
		}
		
		avg = Double.parseDouble(String.format("%.2f",(double)sum / (rLength * cLength)));
		// ��վ� �ִ� �κ�
		for (int i = 0; i < rLength; i++) {
			for (int j = 0; j < cLength; j++) {
				
			}
		}
		
		
		
		
		JOptionPane.showMessageDialog(null, "NIKE 6�� ������ �� ������� " + sum + "���� �Դϴ�.");
	}
}
