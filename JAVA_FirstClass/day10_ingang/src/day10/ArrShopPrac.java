package day10;

import javax.swing.JOptionPane;

public class ArrShopPrac {
	public static void main(String[] args) {
		int [][] arrIncome = new int [2][3];
		int [] arASum = new int [2];
		int [] arBSum = new int [3];
		int sum = 0;
		int rLength = arrIncome.length;
		int cLength = arrIncome[0].length;
		double [] arAAvg = new double[2];
		double [] arBAvg = new double[3];
		double avg = 0.0;
		String [][] arrName = {
				{"������A" , "ȫ����A", "������A"},
				{"������K" , "ȫ����K", "������K"},
		};
		String inputMsg = "������� �Է��Ͻÿ�";
		String [] arAName = {"����" , "Ű��"};
		String [] arBName = {"������", "ȫ����", "������"};
		String result = "";
		
		for (int i = 0 ; i <rLength ; i++) {
			//arrIncome.length �� arrIncome[0].length �� ���� : ���� !!! ���ȣġ�� �����̴�. ���Ҹ�..
			for (int j = 0 ; j <cLength; j++) {
				arrIncome[i][j] = Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j] + "" + inputMsg));
				arASum[i] += arrIncome[i][j];
				arBSum[j] += arrIncome[i][j];
				sum += arrIncome[i][j];				
			}
		}
		for (int i = 0 ; i <arAAvg.length; i++) {
			arAAvg[i] = Double.parseDouble(String.format("%.2f", (double)arASum[i] / arBSum.length));
		}
		for (int i = 0 ; i <arBAvg.length; i++) {
			arBAvg[i] = Double.parseDouble(String.format("%.2f", (double)arBSum[i] / arASum.length));
		}
		
		avg = Double.parseDouble(String.format("%.2f", (double)sum / (rLength*cLength)));
		
		for (int i = 0; i < rLength; i++) {
			for (int j = 0; j < cLength; j++) {
				result += arrName[i][j] + "����� : " + arrIncome[i][j] + "����\n";
				
			}
			//���ɺ� �����
			result +=  arAName [i] + " ���� �� ����� : " + arASum[i] + "����\n";
			result += arAName [i] + " ���� ��� ����� : " + arAAvg[i] + "����\n";
			
		}
		for (int i = 0; i < arBSum.length; i++) {
			result += arBName [i] + " �� ����� : " + arBSum[i] + "����\n";
			result += arBName [i] + " ���� ��� ����� : " + arBAvg[i] + "����\n";
			
			
		}
	}
}
