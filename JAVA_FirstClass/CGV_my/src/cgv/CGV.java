package cgv;

import javax.swing.JOptionPane;

public class CGV {
	public static void main(String[] args) {
		String helloMsg = "�ھ������ CGV�Դϴ�.��\n";
		String menuMsg = "�翹���ϱ�\n�豸���ϱ�\n������Ʈ ��ȸ\n�곪����\n";
		String ageMsg = "[û�ҳ� ���� �Ұ� ��ǰ]\n���̸� �Է��ϼ���\n";
		String films = "����̿�ŷ(08:00)\n�轺���̴���(12:00)\n����Ϸ���(23:00)[û�ҳ� ���� �Ұ�]\n��ڷ� ����\n";
		int choice = 0;
		int age = 0;
		int money = 10000000;
		int point = 0;
		int t_price = 10000;
		boolean t_check;
		
		/*
		 * �����ϱ�
		 * 1.����
		 * 2.�ݶ�
		 * 3.����
		 * 4.�ڷ� ����
		 */
		
		while(true) {
			t_check = true;
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg + menuMsg));
			if(choice == 4) break;
			//�߸� �Է����� �� continue
			if(!(choice >= 1 && choice <= 3)) continue;
			
			switch(choice) {
			//�����ϱ� ����
			case 1:
				//������ ����
				if(money - t_price < 0) {
					JOptionPane.showMessageDialog(null, "�ܾ��� �����մϴ�.");
					continue;
				}
				
				choice = Integer.parseInt(JOptionPane.showInputDialog(films));
				if(choice == 1) {
					JOptionPane.showMessageDialog(null, "���̿�ŷ ���� �Ϸ�(08:00)");
					
				}else if(choice == 2) {
					JOptionPane.showMessageDialog(null, "�����̴��� ���� �Ϸ�(12:00)");

				}else if(choice == 3) {
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
					if (age > 19) {
						JOptionPane.showMessageDialog(null, "���Ϸ��� ���� �Ϸ�(23:00)");
					}else {
						t_check = false;
						JOptionPane.showMessageDialog(null, "�ٽ� �õ��� �ּ���");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "���� �޴��� �̵��մϴ�.");
					continue;
				}
				if(t_check) {
					if(point > 0) {
						if(point - t_price >= 0) {
							point -= t_price;
						}else {
							money -= (t_price - point);
							point = 0;
						}
					}else {
						money -= t_price;
						point += (int)(t_price * 0.5);
					}					
					JOptionPane.showMessageDialog(null, "���� �ܾ� : "+money+"��");
				}
				break;
			//�����ϱ� ����
			case 2:
				break;
			//����Ʈ ��ȸ ����
			case 3:
				JOptionPane.showMessageDialog(null, "�ܿ� ����Ʈ : "+point+"��");
				break;
			}
			
		}
	}
}








