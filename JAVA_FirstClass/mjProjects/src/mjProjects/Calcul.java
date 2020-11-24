package mjProjects;
import javax.swing.JOptionPane;

public class Calcul {
		void add (int num1, int num2) {
			JOptionPane.showMessageDialog(null, num1 + num2);
		}
		void minus (int num1, int num2) {
			JOptionPane.showMessageDialog(null, num1 - num2);
		}
		void mult (int num1, int num2) {
			JOptionPane.showMessageDialog(null, num1 * num2);
		}
		void div (int num1, int num2) {
			if (num2 != 0) {
				JOptionPane.showMessageDialog(null, (String.format("%.2f", (double)num1 / num2)));
			}else {
				JOptionPane.showMessageDialog(null, "0���� ���� �� �����ϴ�.");		
			}
		}
		public static void main(String[] args) {
			Calcul c = new Calcul();
			int choice = 0;
			String msg = "���� ���� �Դϴ�.\n";
			String menu = "���� ����� ����ּ���\n"
					+ "1. ����\n"
					+ "2. ����\n"
					+ "3. ����\n"
					+ "4. ������\n"
					+ "5. ������";
				while (true) {
					choice = Integer.parseInt(JOptionPane.showInputDialog(msg + menu));
					if (choice == 5) break;
					if (!(choice >=1 && choice <=4)) continue;
					
					switch (choice) {
					case 1 :
						JOptionPane.showMessageDialog(null, "���� �����Դϴ�.");
						int inputNum1 = Integer.parseInt(JOptionPane.showInputDialog("ù��° ���ڸ� �Է��� �ּ���"));
						int inputNum2 = Integer.parseInt(JOptionPane.showInputDialog("�ι�° ���ڸ� �Է��� �ּ���"));
						c.add(inputNum1, inputNum2);
						break;
						
					case 2 :
						JOptionPane.showMessageDialog(null, "���� �����Դϴ�.");
						int inputNum3 = Integer.parseInt(JOptionPane.showInputDialog("ù��° ���ڸ� �Է��� �ּ���"));
						int inputNum4 = Integer.parseInt(JOptionPane.showInputDialog("�ι�° ���ڸ� �Է��� �ּ���"));
						c.minus(inputNum3, inputNum4);
						break;
						
					case 3 :
						JOptionPane.showMessageDialog(null, "���� �����Դϴ�.");
						int inputNum5 = Integer.parseInt(JOptionPane.showInputDialog("ù��° ���ڸ� �Է��� �ּ���"));
						int inputNum6 = Integer.parseInt(JOptionPane.showInputDialog("�ι�° ���ڸ� �Է��� �ּ���"));
						c.mult(inputNum5, inputNum6);
						break;
					
					case 4 :
						JOptionPane.showMessageDialog(null, "������ �����Դϴ�.");
						int inputNum7 = Integer.parseInt(JOptionPane.showInputDialog("ù��° ���ڸ� �Է��� �ּ���"));
						int inputNum8 = Integer.parseInt(JOptionPane.showInputDialog("�ι�° ���ڸ� �Է��� �ּ���"));
						c.div(inputNum7, inputNum8);
						break;
					}
				}
		}
	}


