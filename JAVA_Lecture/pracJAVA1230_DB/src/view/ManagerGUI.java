package view;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.StringTokenizer;

//ȭ�� gui
public class ManagerGUI {
	//ȭ�鿡 ���õ� ������Ʈ���� ���� ������ ����
	Frame frame;
	Panel[] panel;
	Label lblTitle, lblName, lblHeight, lblWeight, lblSex, lblAge, lblStatus;
	TextField tfName, tfHeight, tfWeight, tfAge;
	Button btnSave, btnDelete, btnUpdate, btnReset, btnSearch;
	List list;
	Checkbox chMale, chFemale;
	CheckboxGroup chGroup;
	
	public ManagerGUI () {
		frame = new Frame("ȸ������");
		panel = new Panel[13];
		for(int i=0; i<panel.length;i++) {
//			�г��� 13�� �����ϴ� ���� -> �ݺ������� 
			panel[i] = new Panel();
		}
		
		//������Ʈ ����
		lblTitle = new Label("ȸ������", Label.CENTER);
		Font font = new Font("dialog", Font.BOLD, 20);
		lblTitle.setFont(font);
		lblTitle.setForeground(new Color(123,54,32));
		
		lblName = new Label("�̸�");
		lblAge = new Label("����");
		lblHeight = new Label("Ű");
		lblWeight = new Label("ü��");
		lblSex = new Label("����");
		lblStatus = new Label("ü��");
		lblStatus.setBackground(Color.LIGHT_GRAY);
		
		tfName = new TextField("");
		tfHeight = new TextField("");
		tfWeight = new TextField("");
		tfAge = new TextField("");
		
		btnSave = new Button("����");
		btnSearch = new Button("�˻�");
		btnDelete = new Button("����");
		btnUpdate = new Button("����");
		btnReset = new Button("�����");
		
		//üũ�ڽ� ��������� �׷��� (Checkbox������ 2��° �Ű������� �׷���̴�.) 
		chGroup = new CheckboxGroup(); 
		chMale = new Checkbox("Male", chGroup, true);
		chFemale = new Checkbox("Female", chGroup, false);
		
		//����Ʈ -> 7���� �ְ� �ϳ��� �������ְԲ�
		list = new List(7, false);
		
		//�ݱ� ��ư Ȱ��ȭ
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); //�����϶�� ����
			}
		});
		
		//����Ʈ �κ��� �ϳ��� ��������
		list.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = list.getSelectedItem(); //����Ʈ���� ���õ� ���� ���� ��ΰ� string���� ��ȯ��
				StringTokenizer st = new StringTokenizer(str); //�����̹Ƿ� �װ� ��ūȭ ��������Ѵ�
				tfName.setText(st.nextToken());
				tfAge.setText(st.nextToken());
				tfWeight.setText(st.nextToken());
				tfHeight.setText(st.nextToken());
				String sex = st.nextToken();
				if(sex.equals("��")) {
					chMale.setState(true);
				}else {
					chFemale.setState(true);
				}
			}
		});
		
	}
	
	private void launchFrame() {
		panel[1].setLayout(new GridLayout(2, 1));
		panel[1].add(lblName);
		panel[1].add(lblHeight);
		panel[2].setLayout(new GridLayout(2, 1));
		panel[2].add(tfName);
		panel[2].add(tfHeight);
		
		panel[3].setLayout(new BorderLayout());
		panel[3].add(panel[1], "West");
		panel[3].add(panel[2], "Center");
		panel[3].add(new Label(""), "East");
		panel[4].setLayout(new GridLayout(2,1));
		panel[4].add(lblAge);
		panel[4].add(lblWeight);
		panel[5].setLayout(new GridLayout(2,1));
		panel[5].add(tfAge);
		panel[5].add(tfWeight);
		panel[6].setLayout(new BorderLayout());
		panel[6].add(panel[4], "West");
		panel[6].add(panel[5], "Center");
		panel[6].add(new Label(""), "East");
		panel[7].setLayout(new GridLayout(1,2));
		panel[7].add(panel[3]);
		panel[7].add(panel[6]);
		panel[8].add(lblSex);
		panel[8].add(chMale);
		panel[8].add(chFemale);
		panel[9].setLayout(new BorderLayout());
		panel[9].add(lblTitle, "North");
		panel[9].add(panel[7], "Center");
		panel[9].add(panel[8], "South");
		panel[10].setLayout(new GridLayout(1,5));
		panel[10].setBackground(Color.black);
		panel[10].setForeground(Color.white);
		panel[10].add(new Label("�� ��   "));
		panel[10].add(new Label("�� ��   "));
		panel[10].add(new Label("ü ��  "));
		panel[10].add(new Label(" Ű    "));
		panel[10].add(new Label("�� ��   "));
		panel[11].setLayout(new BorderLayout());
		panel[11].add(panel[10], "North");
		panel[11].add(list, "Center");
		panel[0].add(btnSave);
		panel[0].add(new Label(" "));
		panel[0].add(btnSearch);
		panel[0].add(new Label(" "));
		panel[0].add(btnDelete);
		panel[0].add(new Label(" "));
		panel[0].add(btnUpdate);
		panel[0].add(new Label(" "));
		panel[0].add(btnReset);
		panel[12].setLayout(new BorderLayout());
		panel[12].add(panel[9], "North");
		panel[12].add(panel[11], "Center");
		panel[12].add(panel[0], "South");
		
		frame.add(panel[12], "Center");
		frame.add(lblStatus, "South");
		frame.pack();
		frame.setResizable(false);
		//â�� � ȭ���� ũ�⿡ ��������� ��� ���� �ϱ�
		frame.setLocation( ((frame.getToolkit().getScreenSize()).width -frame.getWidth()) /2, 
				((frame.getToolkit().getScreenSize()).height -frame.getHeight()) /2 );
		
		frame.setVisible(true);
		
		displayAll(); //ȸ�� ���� ���� �޼ҵ�
		
	}//end launchFrame ()
	
	public void displayAll() {
		
	}

	public static void main(String[] args) {
		ManagerGUI mem = new ManagerGUI();
		mem.launchFrame();
	}

}
