package tms_ownProject;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TMS_Main {

	
	public static void main(String[] args) {
		int tmsIndex;
		int busStartIndex;
		int busDestIndex;
		int subDestIndex;
		Bus b = new Bus ();
		Random startR = new Random ();
		Random destR = new Random ();
		
		ImageIcon img = new ImageIcon("src/img/bus.gif");
		
		final String [] tmsChoice = {"BUS", "SUBWAY"};
		final String [] busStart = {
				"�ְ�����Ʈ", "�������Ʈ��", "���繫�Ҿ�", "���ɺ���", "����Ű���", "�������б�", "���ǿ���", "�뼱������"	
		};
		
		final String [] busDestination = {
				"�ְ�����Ʈ", "�������Ʈ��", "���繫�Ҿ�", "���ɺ���", "����Ű���", "�������б�", "���ǿ���", "�뼱������"
		};
		
		final String [] subwayStart = {
				"��濪", "�뷮����", "��꿪", "������", "���￪", "��û", "����", "����3��", "����5��", "���빮", "�뼱������"
		};
		
		final String [] subwayDestination = {
			"��濪", "�뷮����", "��꿪", "������", "���￪", "��û", "����", "����3��", "����5��", "���빮", "�뼱������"
		};
		
		String errMsg = "������� �������� �����ϴ�. �ٽ� Ȯ�����ּ���";
		String startMsg = "";
		
		//Bus
		
		while (true) {
			
			tmsIndex = JOptionPane.showOptionDialog(null, "TMS", "BUS or SUBWAY", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, tmsChoice, null);
			
			if (tmsIndex == -1) break;
			if (tmsIndex == 0) {
				
				busDestIndex = JOptionPane.showOptionDialog(null, "�������� �������ּ���", "TMS", JOptionPane.DEFAULT_OPTION, 
						JOptionPane.PLAIN_MESSAGE, img, busDestination, null);
				if (busDestIndex == -1) break;
				switch (busDestIndex) {
				
				case 0 : 
					busStartIndex = startR.nextInt(6);
					startMsg = "���� ����� ������� " + busStart[busStartIndex] + "�Դϴ�";
					
					JOptionPane.showMessageDialog(null, startMsg);
					if (busStartIndex == busDestIndex) {
						JOptionPane.showMessageDialog(null, errMsg);
						break;
					} else {
						b.pay(busDestIndex, busStartIndex);
						
					}break;
					
				case 1 :
					busStartIndex = startR.nextInt(6);
					startMsg = "���� ����� ������� " + busStart[busStartIndex] + "�Դϴ�";
					
					JOptionPane.showMessageDialog(null, startMsg);
					if (busStartIndex == busDestIndex) {
						JOptionPane.showMessageDialog(null, errMsg);
						break;
					} else {
						b.pay(busDestIndex, busStartIndex);
						
					}break;
					
				case 2 : 
					
					
				case 3 : 
					
					
				case 4 : 
					
					break;
					
				case 5 : 
					
					
					
				case 6 : 
					
				case 7 : 
					
					break;
					
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

