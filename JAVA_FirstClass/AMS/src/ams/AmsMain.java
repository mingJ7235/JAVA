package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain {
	public static void main(String[] args) {
		AmsField af = new AmsField ();
		//����������  new �� ������ ���� �޸𸮿��� �������. ��, static ������ ���α׷��� ����ɶ� �޸𸮿��� ���� �ȴ�. 
		
		ImageIcon img = new ImageIcon("src/img/main.gif");
		String [] arPlane = new String [5];
		String keyword = "";
		//������ : �� ��ġ�� ������ ã�ư� �� �ִ� ���
		//����� : �� ��ġ�� ���� ����Ǵ� ���		
		String [] menu = {"�߰��ϱ�", "�˻��ϱ�", "�����ϱ�", "�����ϱ�", "��Ϻ���"};
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
				arPlane = JOptionPane.showInputDialog(insertMsg).split(", ");
				//JOptionPane�� String Ÿ���̴�. �׷��� �̰��� split�� �༭ �ɰ��� �ڿ������� list Ÿ�� ��, �迭Ÿ���̵ȴ�. �׷��� arPlane�� ���� �� �ִ� ���̴�.
				af.insert(arPlane);
				break;
				
			//�˻��ϱ� ����	
			case 1 :
				index = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, searchMenu, null);
				if (index != -1)	{
					keyword = JOptionPane.showInputDialog("�˻��Ͻ� " + searchMenu[index] + "��(��) �Է��ϼ���");
					JOptionPane.showMessageDialog(null, af.search(keyword, index));
				}
				break;
				
			//�����ϱ� ����
				
			//�����, ������
			//�װ��� ��ȣ�� ������ ��
			//JOptionPane.showOptionDialog() ����ϱ�
			//��ư ����� : ����� ����, ������ ����
			//�װ��� ��ȣ�� �Է� �ް� �ش� �װ����� ������� �������� ����
			//������� �������� �����ϸ� ���� ����

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
