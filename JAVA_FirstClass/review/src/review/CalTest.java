package review;

import javax.swing.JOptionPane;

public class CalTest {
	public static void main(String[] args) {
		MethodTask c = new MethodTask();
		String mResult = "";
		
		mResult = JOptionPane.showInputDialog("�ѱ۷κ�ȯ��ų �����Է�");
		c.modiKor(mResult);
	}
}

