package salesProgramm;

import javax.swing.JOptionPane;

public class MethodClass {
	Seoul seoulBranch = new Seoul();
	KyungIn kyunginBranch = new KyungIn();
	Kangwon kangwonBranch = new Kangwon();
	Jeju jejuBranch = new Jeju();
	String [] mainMenu = {"�Է�", "���", "����"};
	String [] choiceBranch = {"��������", "��������", "��������", "��������"};
	String [] productChoice = {"��ǻ��", "������"};
	boolean check = false;
	int sales;
	//���
	public void view () {
		while (!check) {
			int choice = JOptionPane.showOptionDialog(null, "�޴��� �������ּ���", 
					"�Ǹŷ����� ������Ʈ",	JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, null, mainMenu, null);
			if (choice ==-1) break;
			switch (choice) {
			//�Է�
			case 0 : 
				insert();
				break;
			//���
			case 1 :
				output();
				break;
			//����	
			case 2:
				exit ();
				break;
			}
		}
	}
	//�Է�
	public void insert () {
		
		while (!check) {
			int choice = JOptionPane.showOptionDialog(null, "���縦 �������ּ���", "�Ǹŷ����� ������Ʈ", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, null, choiceBranch, null);
			if (choice == -1) break;
			switch (choice) {
			//��������
			case 0 : 
				choice = JOptionPane.showOptionDialog(null, "��ǰ�� �������ּ���", "�Ǹŷ����� ������Ʈ", JOptionPane.DEFAULT_OPTION, 
						JOptionPane.PLAIN_MESSAGE, null, productChoice, null);
				switch (choice) {
				//��ǻ��
				case 0 :
					sales = Integer.parseInt(JOptionPane.showInputDialog("��ǻ�� �Ǹŷ��� �����ּ���"));
					salesComCal(seoulBranch, sales);
					break;
				//������
				case 1 :
					sales = Integer.parseInt(JOptionPane.showInputDialog("������ �Ǹŷ��� �����ּ���"));
					salesPrintCal(seoulBranch, sales);
					break;
				}
				break;
			//��������
			case 1 :
				choice = JOptionPane.showOptionDialog(null, "��ǰ�� �������ּ���", "�Ǹŷ����� ������Ʈ", JOptionPane.DEFAULT_OPTION, 
						JOptionPane.PLAIN_MESSAGE, null, productChoice, null);
				switch (choice) {
				//��ǻ��
				case 0 :
					sales = Integer.parseInt(JOptionPane.showInputDialog("��ǻ�� �Ǹŷ��� �����ּ���"));
					salesComCal(kyunginBranch, sales);
					break;
				//������
				case 1 :
					sales = Integer.parseInt(JOptionPane.showInputDialog("������ �Ǹŷ��� �����ּ���"));
					salesPrintCal(kyunginBranch, sales);
					break;
				}
				break;
			//��������
			case 2: 
				choice = JOptionPane.showOptionDialog(null, "��ǰ�� �������ּ���", "�Ǹŷ����� ������Ʈ", JOptionPane.DEFAULT_OPTION, 
						JOptionPane.PLAIN_MESSAGE, null, productChoice, null);
				switch (choice) {
				//��ǻ��
				case 0 :
					sales = Integer.parseInt(JOptionPane.showInputDialog("��ǻ�� �Ǹŷ��� �����ּ���"));
					salesComCal(kangwonBranch, sales);
					break;
				//������
				case 1 :
					sales = Integer.parseInt(JOptionPane.showInputDialog("������ �Ǹŷ��� �����ּ���"));
					salesPrintCal(kangwonBranch, sales);
					break;
				}
				break;
			//��������
			case 3:
				choice = JOptionPane.showOptionDialog(null, "��ǰ�� �������ּ���", "�Ǹŷ����� ������Ʈ", JOptionPane.DEFAULT_OPTION, 
						JOptionPane.PLAIN_MESSAGE, null, productChoice, null);
				switch (choice) {
				//��ǻ��
				case 0 :
					sales = Integer.parseInt(JOptionPane.showInputDialog("��ǻ�� �Ǹŷ��� �����ּ���"));
					salesComCal(jejuBranch, sales);
					break;
				//������
				case 1 :
					sales = Integer.parseInt(JOptionPane.showInputDialog("������ �Ǹŷ��� �����ּ���"));
					salesPrintCal(jejuBranch, sales);
					break;
				}
				break;
			}
		}
	}
	
	public void salesComCal (Branch branch, int sales) {
		branch.comsales = sales;
		branch.Comtotal = branch.computerPrice * branch.comsales;
	}
	
	public void salesPrintCal (Branch branch, int sales) {
		branch.printsales = sales;
		branch.Printtotal = branch.printerPrice * branch.printsales; 
	}
	
	public void output () {
		String result = "";
		result += "|   �����    |   ��ǰ��    |   ��ǰ����    |   �Ǹŷ�   |   ������Ȳ    |\n";
		if (!(seoulBranch.Comtotal == 0)) {
			result += "��������     ��ǻ��     " + seoulBranch.computerPrice + "      "
					+ seoulBranch.comsales +"      "+ seoulBranch.Comtotal + "\n";
		}if (!(seoulBranch.Printtotal == 0)) {
			result += "��������     ������     " + seoulBranch.printerPrice + "      "
					+ seoulBranch.printsales +"      "+ seoulBranch.Printtotal + "\n";
		}if (!(kyunginBranch.Comtotal == 0)) {
			result += "��������     ��ǻ��     " + kyunginBranch.computerPrice + "      "
					+ kyunginBranch.comsales +"      "+ kyunginBranch.Comtotal + "\n";
		}if (!(kyunginBranch.Printtotal ==0)) {
			result += "��������     ������     " + kyunginBranch.printerPrice + "      "
					+ kyunginBranch.printsales +"      "+ kyunginBranch.Printtotal + "\n";
		}if (!(kangwonBranch.Comtotal == 0)) {
			result += "��������     ��ǻ��     " + kangwonBranch.computerPrice + "      "
					+ kangwonBranch.comsales +"      "+ kangwonBranch.Comtotal + "\n";
		}if (!(kangwonBranch.Printtotal ==0)) {
			result += "��������     ������     " + kangwonBranch.printerPrice + "      "
					+ kangwonBranch.printsales +"      "+ kangwonBranch.Printtotal + "\n";
		}if (!(jejuBranch.Comtotal == 0)) {
			result += "��������     ��ǻ��     " + jejuBranch.computerPrice + "      "
					+ jejuBranch.comsales +"      "+ jejuBranch.Comtotal + "\n";
		}if (!(jejuBranch.Printtotal ==0)) {
			result += "��������     ������     " + jejuBranch.printerPrice + "      "
					+ jejuBranch.printsales +"      "+ jejuBranch.Printtotal + "\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}
	
	public void exit () {
		JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
		check = true;
	}
}
