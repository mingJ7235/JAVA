package tms_ownProject;

import javax.swing.JOptionPane;

public class Bus extends Public {
	TMS_Main t = new TMS_Main ();
	@Override
	void pay(int destIndex, int startIndex) {
		
		int payMoney = 500 * Math.abs(destIndex - startIndex);
		String payMsg = "������ " + payMoney +" �� �Դϴ�.\n"
				+ "(������ �� ������ ���� 500���� �߰��˴ϴ�.)";
		
		
		JOptionPane.showMessageDialog(null, payMsg);
	}

	@Override
	void showDestMsg(int destIndex) {
		JOptionPane.showMessageDialog(null, "���� " + destIndex + " �� �����ϼ̽��ϴ�.");
				
			}
		
	void bus () {
		
	}
	
	
	
}	


