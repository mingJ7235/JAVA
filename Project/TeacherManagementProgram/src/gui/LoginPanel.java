package gui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class LoginPanel extends JPanel implements KeyListener{
	
	Image background = Toolkit.getDefaultToolkit().getImage("./src/img/�α���.png");
	JLabel idLabel , pwLabel;
	TextField idText;
	JPasswordField pwText;
	JButton loginButton = new JButton("Login");;
	String id = "ppak";
	String pw = "1234";
	String inputpw = "" ;
	
	public LoginPanel() {
		
		setLayout(null);
		idLabel = new JLabel("���̵�",JLabel.RIGHT);
		idLabel.setFont(new Font("���", Font.BOLD, 15));
		idLabel.setBounds(100, 10, 100, 100);
		add(idLabel);
		
		idText = new TextField();
		idText.setBounds(210, 50, 120, 20);
		add(idText);
		
		pwLabel = new JLabel("��й�ȣ",JLabel.RIGHT);
		pwLabel.setFont(new Font("���", Font.BOLD, 15));
		pwLabel.setBounds(310, 10, 100, 100);
		add(pwLabel);
		
		pwText = new JPasswordField();
		pwText.setBounds(420, 50, 120, 20);
		add(pwText);
		
		loginButton.setBounds(560, 50, 100, 20);
		add(loginButton);
		
		
		pwText.addKeyListener(this);
		
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			loginButton.doClick();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	
	
}
