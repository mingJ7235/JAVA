package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsPlainMethod {
//�˻� �޼���
	AmsPlain_Info info = new AmsPlain_Info ();
	ImageIcon img = new ImageIcon("src/img/main.gif");

	void korAirInfo () {
		
		while (true) {
			int plainIndex = 0;
			plainIndex = JOptionPane.showOptionDialog(null, "", "AMS_Insert", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, img, info.arKorAir, null);
			if (plainIndex == -1) break;
			
			switch (plainIndex) {
			// ���� ����⸶�� �ð��� ���� ������ 
			
			
			case 0 : 
				
				break;
			}
		}
	}
	
	
	
	
	
}
