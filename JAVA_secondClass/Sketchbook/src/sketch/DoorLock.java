package sketch;

import javax.swing.JOptionPane;

public class DoorLock {
	public static void main(String[] args) {
		//�����
		Room1 r = Room1.getRoom1();
		
		final String pw = "7235*";
		String [] arMsgs= { "�� ��й�ȣ �Է��ϼ���", "������", "��й�ȣ �ٽ� �Է��ϼ�"};
		String [] roomChoice = {"1. �ȹ�", "2. ����", "3. ȭ���"};
		String result = null;	
		int choice = 0;
		while(true) {
			result = JOptionPane.showInputDialog(arMsgs[0]);
			if (result.equals("7235*")) {
				JOptionPane.showMessageDialog(null, arMsgs[1]);
				//�� ����
				choice = JOptionPane.showOptionDialog(null, "�ູ�� �츮��", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
						null, roomChoice, null);
				if (choice == -1) break;
				switch (choice)	{
				case 0 : 
					System.out.println("�ȹ� ����");
					r.sleep(123);
					
					break;
				}
				break;
			} else {
				JOptionPane.showMessageDialog(null, arMsgs[2]);
				continue;
			}
		}
			
	}
}
