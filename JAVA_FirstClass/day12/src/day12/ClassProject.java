package day12;
import javax.swing.JOptionPane;
public class ClassProject {
	String name;
	int age;
	double weight;
	String hairColor;
	String habit;
	
	ClassProject(){}

	public ClassProject(String name, int age, double weight, String hairColor, String habit) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.hairColor = hairColor;
		this.habit = habit;
	}
	void walk(){
		System.out.println(name+ "��(��) �ȴ´�.");
	}
	void workout() {
		System.out.println(name + "��(��) ����Ѵ�.\n"	+ "���� �����԰�" + weight + "kg �̱� �����̴�.");
	}
	
	public static void main(String[] args) {
		int inputAge = 0;
		double inputWeight = 0.0;
		String msg =  "ĳ������ ������ �Է��� �ּ���";
		JOptionPane.showMessageDialog(null, msg);
		
		String inputName = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		
		while(true) {
			inputAge = Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));
			if (inputAge >0) {
				break;
			}else {
				JOptionPane.showMessageDialog(null, "���̴� 0 ���� Ŀ���մϴ�.");
			}
		}
		
		while (true) {
			inputWeight = Double.parseDouble(JOptionPane.showInputDialog("�����Ը� �Է��ϼ��� (�Ҽ��� ���ڸ�����"));
			if (inputWeight >0) break;
			else {
				JOptionPane.showMessageDialog(null, "�����Դ� 0 ���� Ŀ���մϴ�.");
			}
		}
		
		String inputHairColor = JOptionPane.showInputDialog("�Ӹ�ī�� ���� �Է��ϼ���");
		String inputHabit = JOptionPane.showInputDialog("��̸� �Է��ϼ���");
		
		ClassProject MJ = new ClassProject(inputName, inputAge, inputWeight, inputHairColor, inputHabit);
		MJ.walk();
		MJ.workout();
	}
}
