package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain_Test {
	public static void main(String[] args) {
		AmsField af = new AmsField ();
		AmsPlain_Info info = new AmsPlain_Info();
		AmsPlainMethod apm = new AmsPlainMethod();
		
		ImageIcon img = new ImageIcon("src/img/main.gif");
		
		String [] arPlane = new String [5];
		String keyword = "";
		String [] menu = {"�߰��ϱ�", "�˻��ϱ�", "�����ϱ�", "�����ϱ�", "��Ϻ���"};
		String [] insertPlainMenu = {"�����װ�", "�ƽþƳ��װ�", "�����װ�", "�̽�Ÿ�װ�"};
		String [] searchMenu = {"�װ���", "�װ��� ��ȣ ", "�ִ� �°���", "�����", "������"};
		String [] updateMenu = {"����� ����", "������ ����"};
		
		int choice = 0;
		int index = 0;
		
		String insertMsg = "[�߰��Ͻ� ������ �״�� �Է��ϼ��� (, ����)] \n"
				+ "�װ���, �װ����ȣ, �ִ�°���, �����, ������";
		String deleteMsg = "�����Ͻ� �װ��� ��ȣ�� �Է��ϼ���.\n";
		String updateMsg = "�����Ͻ� �װ��� ��ȣ�� �Է��ϼ���\n";
		
		while (true) {
			choice = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, menu, null);
		
			if (choice == -1) break;
			
			switch (choice) {
			
			//�߰��ϱ� ����
			case 0 : 
				int companyIndex = 0;
				
				companyIndex = JOptionPane.showOptionDialog(null, "", "AMS_Insert", JOptionPane.DEFAULT_OPTION, 
						JOptionPane.PLAIN_MESSAGE, img, insertPlainMenu, null);
				while (true) {
					if (companyIndex == -1) break;
					
					switch (companyIndex) {
					case 0 : 
						apm.korAirInfo();
						break;
					case 1 : 
						
						break;
					case 2 : 
						
						break;
					case 3 : 
						
						break;
						
					}
					
				}
					
					break;
					
					
					
				
			//�˻��ϱ� ����	
			case 1 :
				index = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, searchMenu, null);
				if (index != -1)	{
					keyword = JOptionPane.showInputDialog("�˻��Ͻ� " + searchMenu[index] + "��(��) �Է��ϼ���");
					JOptionPane.showMessageDialog(null, af.search(keyword, index));
				}
				break;
				

			case 2 : 
				String planeNum = JOptionPane.showInputDialog(updateMsg);
				String temp = af.search(planeNum, 1);
				
				if(choice == -1) break;
				if(temp.equals("�˻� ��� ����")) {
						JOptionPane.showMessageDialog(null, "���� ����");
					}else {
						index = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, updateMenu, null);
						String newValue = JOptionPane.showInputDialog("���ο�"+ updateMenu[index] + "�� �Է��ϼ���");
						af.update(index, newValue);
					}
				break;
				
			//�����ϱ� ����
			case 3 :
				keyword = JOptionPane.showInputDialog(deleteMsg);
				if(af.delete(keyword)) {
					JOptionPane.showMessageDialog (null, "���� �Ϸ�");
				}else {
					JOptionPane.showMessageDialog (null, "���� ����");
				}
				break;
				
			//��Ϻ��� ����
			case 4 :
				JOptionPane.showMessageDialog(null, af.show());
				//af.show() ��ü�� return Ÿ���� String �̹Ƿ� JOptionPane�� �ٷ� �ִ´�.
				break;
			}
			
		}
		
		
	
	
}
}
