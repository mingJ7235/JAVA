package mjProjects;

import javax.swing.JOptionPane;

public class ClassCharMaking {
		String name;
		int age;
		double power;
		String weapon;
		String shield;
		String monster;
	
		ClassCharMaking(){}

		public ClassCharMaking(String name, int age, double power, String weapon, String shield, String monster) {
			this.name = name;
			this.age = age;
			this.power = power;
			this.weapon = weapon;
			this.shield = shield;
			this.monster = monster;
		}
		void hit () {
			JOptionPane.showMessageDialog(null, name + " ��(��) " + monster + " (��)�� " + weapon + " ��(��) ����Ͽ� " 
														+ power +" �� ���ݷ����� �����ߴ�.");
			JOptionPane.showMessageDialog(null, "ȿ���� �����ߴ�!");
		}
		void def () {
			JOptionPane.showMessageDialog(null, name + " ��(��) " + monster + " �� ������ " + shield +" �� ����Ͽ� ���Ƴ´�.");
		}
		void run () {
			JOptionPane.showMessageDialog(null, name + " ��(��) " + monster + " �� ���� ��������.");
		}
		void info () {
			JOptionPane.showMessageDialog(null, "1. �̸� : " + name + "\n"
					+ "2. ���� : " + age + "\n"
					+ "3. ���� : " + weapon + "\n"
					+ "4. ���ݷ� : " + power + "\n"
					+ "5. �� : " + shield + "\n");
		}

		//main method
		public static void main(String[] args) {
			int inputAge = 0;
			int choice = 0;
			String msg =  "�ڷγ��� �̱���! \n"
					+ "�ڷγ��� ����ĥ ĳ������ ������ �Է��� �ּ���";
			String inputName ="";
			String battleMsg = "���� ������.\n �ൿ�� ����ּ���\n"
					+ "1. �����ϱ�\n"
					+ "2. ����ϱ�\n"
					+ "3. ��������\n"
					+ "4. �� ���� ����\n"
					+ "5. ������ ������. \n";
			// ĳ���� ����
			JOptionPane.showMessageDialog(null, msg);
			inputName = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
			
			while(true) {
				inputAge = Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));
				if (inputAge >0) {
					break;
				}else {
					JOptionPane.showMessageDialog(null, "���̴� 0 ���� Ŀ���մϴ�.");
				}
			}
			String inputWeapon = JOptionPane.showInputDialog("���⸦ �Է����ּ���");
			String inputShield = JOptionPane.showInputDialog("���� �Է����ּ���");
			
			ClassCharMaking c = new ClassCharMaking(inputName, inputAge, 1, inputWeapon, inputShield, " �ڷγ����̷���");
			
			// ���� ���� ��Ʈ
			String gameMsg =("���� " + inputName + "�� ������ ���۵˴ϴ�.");
			JOptionPane.showMessageDialog(null, gameMsg);
			while (true) {
				choice = Integer.parseInt(JOptionPane.showInputDialog(battleMsg));			
				if (choice == 5) {
					JOptionPane.showMessageDialog(null, "������ �����մϴ�.");
					break;
				}
				if (!(choice > 0 && choice < 5)) {
					JOptionPane.showMessageDialog(null, "1���� 4������ ���� �Է����ּ���.");
					continue;
				}
				switch (choice) {
				case 1 :
					c.hit();
					break;
				case 2 :
					c.def();
					break;
				case 3 :
					c.run();
					break;
				case 4 :
					c.info();
				}
			}
		}
}

