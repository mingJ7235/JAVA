package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FireFrame extends JFrame implements ActionListener{

	ListPanel listPanel = new ListPanel();
	JButton fireButton = new JButton("���");
	JButton deleteButton = new JButton("����");
	JTextField fireTextField = new JTextField();
	JLabel fireLabel = new JLabel("����ų ���縦 �Է��ϼ���",JLabel.LEFT);
	
	public FireFrame() {
		
		setTitle("������� ���α׷�");
		setResizable(false);
		setSize(800,800);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = getSize();
		
		int x = (screenSize.width - frameSize.width)/2;
		int y = (screenSize.height - frameSize.height)/2;
		
		setLocation(x, y);
		JPanel labelPanel = new JPanel();
		
		listPanel.setLayout(null);
		fireButton.setBounds(300, 710, 70, 40);
		fireButton.addActionListener(this);
		deleteButton.setBounds(380, 710, 70, 40);
		deleteButton.addActionListener(this);
		fireTextField.setBounds(50, 710, 220, 40);
		labelPanel.add(fireLabel);
		labelPanel.setBounds(20, 670, 300, 30);
		fireLabel.setFont(new Font("���ü", Font.BOLD, 20));
		listPanel.add(fireButton);
		listPanel.add(deleteButton);
		listPanel.add(fireTextField);
		listPanel.add(labelPanel);
		
		
		add(listPanel);
		listPanel.leaveButton.addActionListener(this);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == listPanel.leaveButton) {
			setVisible(false);
		}
		if(e.getSource() == fireButton) {
			try {
				if(fireTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(this, "�ѱ��� �̻� �Է��ϼž��մϴ�",
															"���޼���",JOptionPane.WARNING_MESSAGE);
				}else {
					String[] arfire = fireTextField.getText().split(",");
					for (int i = 0; i < arfire.length; i++) {
						fire(arfire[i]);
					}
					JOptionPane.showMessageDialog(this,"�Է��Ͻ� ���� ��� ó���Ǿ����ϴ�","���ó��",
															JOptionPane.INFORMATION_MESSAGE);
				}
			} catch (IOException e1) {}
			setVisible(false);
			new FireFrame();
		}
		if(e.getSource() == deleteButton) {
			try {
				delete();
			} catch (IOException e1) {}
			JOptionPane.showMessageDialog(this,"����ο��� ����ó�� �Ǿ����ϴ�",
													"����ó��", JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);
			new FireFrame();
		}
	}
	
	private void delete() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("TMP.txt"));
		String line = "";
		String anotherLine = "";
		
		while((line = br.readLine()) != null) {
			if(!line.contains("���")) {
				anotherLine += (line + "\n");
			}
		}
		
		FileWriter fw = new FileWriter("TMP.txt");
		fw.write(anotherLine);
		fw.close();
		br.close();
		
	}// delete
	
	private void fire(String keyword) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("TMP.txt"));
		String line = "";
		String anotherLine = "";
		
			while((line = br.readLine()) != null) {
				if(line.contains(keyword)) {
					String[] arline = line.split(",");
					for (int j = 0; j < arline.length; j++) {
						if(j == 7) {
							anotherLine += "���"+",";
						}else if(j == arline.length -1) {
							anotherLine += arline[j]+"\n";
						}else {
							anotherLine += arline[j]+",";
						}
					}
				}else{
					anotherLine += line + "\n";
				}
			}
		
		FileWriter fw = new FileWriter("TMP.txt");
		fw.write(anotherLine);
		fw.close();
		br.close();
		
	}// fire
	
}
