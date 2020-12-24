package p02_chatting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javafx.scene.layout.Border;

public class ChattingServer extends Thread implements ActionListener{
	//�ʵ� ����
	Frame frame; //������â ���������� Ŭ����
	TextArea ta; //���� �Է��ϴ� ���� ���� Ŭ����
	TextField tf;
	ServerSocket s;
	Socket s1;
	DataOutputStream dos;
	DataInputStream dis;
	boolean stop;
	
	
	public ChattingServer() {
		launchFrame(); //ȭ�鱸��
		service();//���� ���� ȭ��
	}
	
	private void launchFrame () {
		frame = new Frame("�ϴ��� ä��");
		ta = new TextArea();
		tf = new TextField();
		frame.setBackground(Color.LIGHT_GRAY);
		ta.setEditable(false); //ä�õ� ȭ�鿡�� �����ϴ� ���� ���� (false)
		frame.add(ta, BorderLayout.CENTER);
		frame.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);
		frame.setSize(500, 300);
		frame.setVisible(true);
		tf.requestFocus();
		
	}
	
	private void service() {
		try {
			ta.append("���� �ϱ� ���ؼ� �غ���...\n");
			s = new ServerSocket(5432);
			ta.append("Ŭ���̾�Ʈ ���� �����...\n");
			s1=s.accept();
			
			ta.append("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.." + s1.getInetAddress()+"\n");
			dos = new DataOutputStream(s1.getOutputStream());
			dis = new DataInputStream(s1.getInputStream());
			this.start(); //������ ȣ��
			dos.writeUTF("ä�� ������ �����Ͻ� ���� ȯ���մϴ�.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		try {
			while (!stop) {
				ta.append(dis.readUTF() + "\n");
			}
			dis.close(); s1.close();
		}catch (EOFException e) {
			System.out.println("Ŭ���̾�Ʈ�� ���� ������ ����");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		String msg= tf.getText();
		ta.append(msg+"\n");
		if(msg.equals("exit")) {
			ta.append("bye");
			stop =true;
				dos.close();
			s1.close();
			System.exit(0);
		}else {
			dos.writeUTF("���� : " + msg);
			tf.setText("");
		}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	} 
	
	public static void main(String[] args) {
		new ChattingServer();
	}

}
