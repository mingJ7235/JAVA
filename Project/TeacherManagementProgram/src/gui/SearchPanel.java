package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class SearchPanel extends JPanel implements ActionListener, KeyListener {

	private Image background = Toolkit.getDefaultToolkit().getImage("./src/img/�����Է�.png");
	private JLabel name, tell, department, fire, notes, gender, career, bonus, studentNumber, searchGuide;
	private JTextField nameText, tellText, careerText, studentNumberText;
	private JTextField departmentText, fireText, genderText, bonusText, searchText;
	private JTextArea notesTextArea;
	private JButton searchButton ;
	public  JButton	leaveButton = new JButton("������");
	private JButton updateButton;
	private String TMPcontents;
	
	public SearchPanel() {

		setLayout(null);
		
		Box left = Box.createVerticalBox();
		JPanel leftPanel = new JPanel();
		leftPanel.setBorder(new TitledBorder(new EtchedBorder(),"��������"));
		leftPanel.add(left);
		leftPanel.setOpaque(false);
		
		Box right = Box.createVerticalBox();
		JPanel rightPanel = new JPanel();
		rightPanel.setBorder(new TitledBorder(new EtchedBorder(),"�������"));
		rightPanel.add(right);
		rightPanel.setOpaque(false);
		
		Box center = Box.createHorizontalBox();
		center.add(leftPanel);
		center.add(rightPanel);
		center.setBounds(20, 20, 750, 440);
		
		add(center);
		
		name = new JLabel("�̸�", JLabel.RIGHT);
		tell = new JLabel("��ȭ��ȣ", JLabel.RIGHT);
		department = new JLabel("�μ�", JLabel.RIGHT);
		career = new JLabel("���", JLabel.RIGHT);
		studentNumber = new JLabel("�л���", JLabel.RIGHT);
		gender = new JLabel("����", JLabel.RIGHT);
		bonus = new JLabel("���ʽ�", JLabel.RIGHT);
		fire = new JLabel("���", JLabel.RIGHT);
		notes = new JLabel("�������", JLabel.RIGHT);
		searchGuide = new JLabel("�˻��Ͻ� �̸��� �Է��ϼ���",JLabel.RIGHT);
		
		nameText = new JTextField();
		tellText = new JTextField();
		departmentText = new JTextField();
		careerText = new JTextField();
		studentNumberText = new JTextField();
		genderText = new JTextField();
		bonusText = new JTextField();
		fireText = new JTextField();
		searchText = new JTextField();
		
		searchButton = new JButton("�˻�");
		updateButton = new JButton("����");
		
		notesTextArea = new JTextArea();
		
		name.setBounds(30, 50, 70, 70);
		add(name);
		nameText.setBounds(120, 70, 70, 30);
		nameText.setEditable(false);
		add(nameText);
		
		tell.setBounds(30, 110, 70, 70);
		add(tell);
		tellText.setBounds(120, 130, 130, 30);
		tellText.setEditable(false);
		add(tellText);
		
		department.setBounds(30, 170, 70, 70);
		add(department);
		departmentText.setBounds(120, 190, 70, 30);
		departmentText.setEditable(false);
		add(departmentText);
		
		career.setBounds(30, 230, 70, 70);
		add(career);
		careerText.setBounds(120, 250, 50, 30);
		careerText.setEditable(false);
		add(careerText);
		
		studentNumber.setBounds(30, 290, 70, 70);
		add(studentNumber);
		studentNumberText.setBounds(120, 310, 50, 30);
		studentNumberText.setEditable(false);
		add(studentNumberText);
		
		gender.setBounds(30, 350, 70, 70);
		add(gender);
		genderText.setBounds(120, 370, 70, 30);
		genderText.setEditable(false);
		add(genderText);
		
		bonus.setBounds(400, 50, 70, 70);
		add(bonus);
		bonusText.setBounds(490, 70, 70, 30);
		bonusText.setEditable(false);
		add(bonusText);
		
		fire.setBounds(400, 110, 70, 70);
		add(fire);
		fireText.setBounds(490, 130, 70, 30);
		fireText.setEditable(false);
		add(fireText);
		
		notes.setBounds(400, 170, 70, 70);
		add(notes);
		notesTextArea.setBounds(485, 195, 250, 220);
		notesTextArea.setEditable(false);
		add(notesTextArea);
		
		JPanel searchPanel = new JPanel();
		searchPanel.setBounds(30, 695, 300, 30);
		searchPanel.setBackground(Color.white);
		searchGuide.setFont(new Font("�Ÿ���",Font.BOLD,20));
		searchPanel.add(searchGuide);
		add(searchPanel);
		
		searchText.setBounds(340, 700, 100, 30);
		add(searchText);
		searchText.addKeyListener(this);
		
		searchButton.setBounds(450, 700, 70, 30);
		add(searchButton);
		searchButton.addActionListener(this);
		
		leaveButton.setBounds(690, 690, 90, 50);
		add(leaveButton);
		
		updateButton.setBounds(590, 690, 90, 50);
		add(updateButton);
		updateButton.addActionListener(this);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == searchButton) {
			try {
				search();
			} catch (IOException e1) {}
		}
		if(e.getSource() == updateButton) {
			tellText.setEditable(true);
			departmentText.setEditable(true);
			careerText.setEditable(true);
			studentNumberText.setEditable(true);
			bonusText.setEditable(true);
			fireText.setEditable(true);
			notesTextArea.setEditable(true);
			updateButton.setText("Ȯ��");
		}
		if(e.getActionCommand().equals("Ȯ��")) {
			tellText.setEditable(false);
			departmentText.setEditable(false);
			careerText.setEditable(false);
			studentNumberText.setEditable(false);
			bonusText.setEditable(false);
			fireText.setEditable(false);
			notesTextArea.setEditable(false);
			try {
				update();
			} catch (IOException e1) {}
			JOptionPane.showMessageDialog(this, "�����Ǿ����ϴ�","�����޼���",JOptionPane.INFORMATION_MESSAGE);
			updateButton.setText("����");
		}
		
	}
	
	private void search() throws IOException{
		// �ٲ� ���� ���̶������� alt + shift + r -> �Ѳ����� ������ �ٲ� �� ����
		TMPcontents = new String(Files.readAllBytes(Paths.get("TMP.txt")));
		String[] arTMPcontents = new String[100];
		arTMPcontents = TMPcontents.split("\n");
		String keyword = searchText.getText();
		String[] result = new String[9];

		if(keyword.equals("")) {}
		else {
			for (int i = 0; i < arTMPcontents.length; i++) {
				if(arTMPcontents[i].contains(keyword)) {
					result = arTMPcontents[i].split(",");
				}
			}

			try {
				if(!result[0].equals("")) {
					nameText.setText(result[0]);
				}
				tellText.setText(result[1]);
				departmentText.setText(result[2]);
				careerText.setText(result[3]);
				studentNumberText.setText(result[4]);
				genderText.setText(result[5]);
				bonusText.setText(result[6]);
				fireText.setText(result[7]);
				String[] arnotes = new String[20];
				arnotes = result[8].split("/");
				String notes = "";
				for (int i = 0; i < arnotes.length; i++) {
					notes += arnotes[i] +"\n";
				}
				notesTextArea.setText(notes);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "�˻���� : ����","�˻����",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}// search
	
	private void update() throws IOException{
		TMPcontents = new String(Files.readAllBytes(Paths.get("TMP.txt")));
		String result = "";
		String[] arContents = new String[100];
		arContents = TMPcontents.split("\n");
		//System.out.println(arContents.length); split���� �ϸ� 100���� ���̰����̾ƴ϶� �������� ������ ���� ���̰� ���Ѵ�
		int cnt = 0;
		for (cnt = 0; cnt < arContents.length; cnt++) {
			if(arContents[cnt].contains(nameText.getText())) {
				break;
			}
		}
		String[] arUpdate = arContents[cnt].split(","); 
		arUpdate[1] = tellText.getText();
		arUpdate[2] = departmentText.getText();
		arUpdate[3] = careerText.getText();
		arUpdate[4] = studentNumberText.getText();
		arUpdate[6] = bonusText.getText();
		arUpdate[7] = fireText.getText();
		String[] arnotesTextArea = new String[20];
		arnotesTextArea = notesTextArea.getText().split("\n");
		String notes = "";
		for (int i = 0; i < arnotesTextArea.length; i++) {
			if(i == arnotesTextArea.length - 1) {
				notes += arnotesTextArea[i];
			}else {
				notes += arnotesTextArea[i]+"/";
			}
		}
		arUpdate[8] = notes;
		arUpdate[9] = Integer.toString(Integer.parseInt(careerText.getText())*3 
				+ Integer.parseInt(studentNumberText.getText())*7);
		String update = "";
		for (int i = 0; i < arUpdate.length; i++) {
			if(i == arUpdate.length-1) {
				update += arUpdate[i];
			}else {
				update += arUpdate[i]+",";
			}
		}
		for (int i = 0; i < cnt; i++) {
			result += arContents[i]+"\n";
		}
		result += update + "\n";
		for (int i = cnt+1; i < arContents.length; i++) {
			result += arContents[i]+"\n";
		}
		FileWriter filewriter = new FileWriter("TMP.txt");
		filewriter.write(result);
		filewriter.close();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			searchButton.doClick();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}
	
}// class
