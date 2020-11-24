package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain {
	public static void main(String[] args) {
		
		//�̹��� �ִ� ���
		AmsField af = new AmsField();
		//���������� new�� ������ ���� �޸𸮿��� �����ȴ�
		//static ������ ���α׷��� ����� �� �޸𸮿��� �����ȴ�.
		ImageIcon img = new ImageIcon("src/img/main.gif");
		
		String [] menu = {"�߰��ϱ�", "�˻��ϱ�", "�����ϱ�", "�����ϱ�", "��Ϻ���"};
		String [] searchMenu = {"�װ���", "�װ����ȣ", "�ִ�°���", "�����", "������"};
		String [] updateMenu = {"����� ����", "������ ����"};
		String [] arPlane = new String [5];
		
		int choice = 0;
		int index = 0;
		String keyword = "";
		String planeNum ="";
		String insertMsg = "[�߰��Ͻ� ������ �״�� �Է��ϼ���] (, ����)\n"
				+ "�װ���, �װ����ȣ, �ִ�°���, �����, ������";
		String updateMsg = "�����Ͻ� �װ��� ��ȣ�� �Է��ϼ���. \n";
		String deleteMsg = "�����Ͻ� �װ��� ��ȣ�� �Է��ϼ���. \n";
		
		while (true) {
			choice = JOptionPane.showOptionDialog(null, "", "AMS", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, menu, null);
			
			if (choice == -1) break;
			
			switch (choice) {
			
			//�߰��ϱ�
			case 0 : 
				arPlane = JOptionPane.showInputDialog(insertMsg).split(", ");
				af.insert(arPlane);
				break;
			
			//�˻��ϱ�
			case 1 : 
				index = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, searchMenu, null);
				if (index != -1) {
					keyword = JOptionPane.showInputDialog("�˻��Ͻ�" + searchMenu[index] + "��(��) �Է��ϼ���");
					JOptionPane.showMessageDialog(null, af.search(keyword, index));
				}
				break;
			
			//�����ϱ�	
			case 2 : 
				planeNum = JOptionPane.showInputDialog(updateMsg);
				String temp = af.search(planeNum, 1);
				
				if(temp.equals("�˻� ��� ����")) {
					JOptionPane.showMessageDialog(null, "��������");
				}else {
					while (true) {
						index = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, updateMenu, null);
						if (index == -1 ) {
							JOptionPane.showMessageDialog(null, "����մϴ�.");
							break;
						} else {
							String newValue = JOptionPane.showInputDialog("���ο�" + updateMenu[index] + "�� �Է��ϼ���");
												
							af.update(index, newValue);
							break;
						}
						
					}
				}
				break;
				 
			//�����ϱ�	
			case 3 : 
				keyword = JOptionPane.showInputDialog(deleteMsg);
				if (af.delete(keyword)) {
					JOptionPane.showMessageDialog(null, "�����Ϸ�");
				}else {
					JOptionPane.showMessageDialog(null, "��������");
				}
				break;
			
			//��Ϻ���	
			case 4 : 
				JOptionPane.showMessageDialog(null, af.show());
				break;
			}
		}
	}
}
