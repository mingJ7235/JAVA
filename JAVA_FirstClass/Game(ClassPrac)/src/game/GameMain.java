package game;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GameMain {
/*
 * �ɸ��� Ŭ����
 *	���� ������ Random���� (���Ϳ��� ������ int Ÿ�� �ѹ����� �ο�, �������� ��Ÿ���� �� ����)
 * 
 * 
 */
	
	void view () {
		Warrior warrior = new Warrior();
		
		ImageIcon mainImg = new ImageIcon("src/img/main.gif");
		ImageIcon warriorImg = new ImageIcon ("src/img/warrior.gif");
		
		String [] arMainChoice = {"������ �����Ѵ�.", "���� �����", "������ �����Ѵ�."};
		String [] arCharacterOption = {"����", "������", "����"};
		String [] arBehaviorOption = {"������ �����Ѵ�", "�޽��� ���Ѵ�.", "Ž���� �����Ѵ�.", "�ɸ��͸� �����Ѵ�."};
		String [] arBattleOption = {"�����Ѵ�.", "����Ѵ�.", "��������"};
		
		String charChoiceMsg = "�ɸ��͸� �������ּ���";
		String creditMsg = "���� �� : ����� \n"
				+ "������ �� ���� ģ����� �� ���� ������ ����ô�.";
		String exitMsg = "������ �����մϴ�.";
		
		String battleResult = "";
		
		
		int mainIndex = 0;
		int charIndex = 0;
		int behaviorIndex = 0;
		int battleIndex = 0;
		
		while (true) {
			
			mainIndex = JOptionPane.showOptionDialog(null, "", "Game Test", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, mainImg, arMainChoice, null);
			if (mainIndex == 2 || mainIndex == -1) {
				JOptionPane.showMessageDialog(null, exitMsg);
				break;
			}
			switch (mainIndex) {
			case 0 : 
				//������ �����Ѵ�.
				JOptionPane.showMessageDialog(null, charChoiceMsg);
				
				
				//�ɸ��� ����
				while (true) {
					if (charIndex == -1) break;
					charIndex = JOptionPane.showOptionDialog(null, "", "Game Test", JOptionPane.DEFAULT_OPTION, 
							JOptionPane.PLAIN_MESSAGE, mainImg, arCharacterOption, null);
					switch (charIndex) {
					case 0 : 
						//����
						behaviorIndex = JOptionPane.showOptionDialog(null, "", "Warrior Mode", JOptionPane.DEFAULT_OPTION, 
								JOptionPane.PLAIN_MESSAGE, warriorImg, arBehaviorOption, null);
						
						switch (behaviorIndex) {
						case 0 : 
							//������ �����Ѵ�.
							Monster monIndex = new Monster();
							
//							if (monIndex.choiceMonster() == )
							
							battleIndex = JOptionPane.showOptionDialog(null, "", "Battle", JOptionPane.DEFAULT_OPTION, 
									JOptionPane.PLAIN_MESSAGE, warriorImg, arBattleOption, null);
							
							switch (battleIndex) {
							
							//���� ����
							case 0 : 
								
								
								break;
							
							
							}
							
							
							
//							warrior.attack(warrior.damage, mHp);
							
							
							
							
							
						}
						
						
						break;
						
						
					}
				}
				
				
			case 1 :
				JOptionPane.showMessageDialog(null, creditMsg);
				break; 
			}
			
		}
		
		
	}
		
		
	
	
	
	public static void main(String[] args) {
		new GameMain().view();
	
	
	}

}