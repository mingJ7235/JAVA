package day10;

import javax.swing.JOptionPane;

public class ArrPrac {
	public static void main(String[] args) {
		//�����
		int [][] arrIncome = new int [2][3];
		int rLength = arrIncome.length;
		int cLength = arrIncome[0].length;
		int sum = 0;
		int [] arASum = new int [2];
		int [] arBSum = new int [3];
		
		double avg = 0.0;
		double [] arAAvg = new double [2];
		double [] arBAvg = new double [3];
		
		String [][] arrName = {
				{"������A", "������A", "����A"},
				{"������K", "������K", "����K"},
		};
		String [] arAName = {"���� ����", "Ű�� ����"};
		String [] arBName = {"������", "������", "����"};
		String result = "_________________________________\n";
		
		//�����
		for (int i = 0; i < rLength; i++) {
			for (int j = 0; j < cLength; j++) {
				arrIncome [i][j] = Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j] + " �� ������� �Է��Ͻÿ� (���� : ����) \n"));
				arASum[i] += arrIncome[i][j];
				arBSum[j] += arrIncome[i][j];
				sum += arrIncome[i][j];
			}
		}
		
		//��վ� 
		for (int i = 0; i < arAAvg.length; i++) {
			arAAvg [i] = Double.parseDouble(String.format("%.2f", (double) arASum [i] / arBSum.length));
			
		}
		for (int i = 0; i < arBAvg.length; i++) {
			arBAvg [i] = Double.parseDouble(String.format("%.2f", (double) arBSum [i] / arASum.length));
		}
		avg = Double.parseDouble(String.format("%.2f", (double) sum / (rLength * cLength)));
		
		//��� ���
		for (int i = 0; i < rLength; i++) {
			for (int j = 0; j < cLength; j++) {
				result += arrName[i][j] + "����� : " + arrIncome [i][j] + "����\n";
			}
			//���ɺ� �����
			result += arAName [i] + " �� ����� : " + arASum [i] + "����\n";
			result += arAName [i] + " ��� ����� : " + arAAvg [i] + "����\n";
			result += "_________________________________\n";
		}
		
		for (int i = 0; i < arBSum.length; i++) {
			result += arBName [i] + "�� ����� : " + arBSum [i] + "����\n";
			result += arBName [i] + "��� ����� : " + arBAvg [i] + "����\n";
			result += "_________________________________\n";
			}
		result += "�� ����� : " + sum + "����\n";
		result += "��� ����� : " + avg + "����\n";
		result += "_________________________________\n";
		JOptionPane.showMessageDialog(null, result);
		
		}
	}
