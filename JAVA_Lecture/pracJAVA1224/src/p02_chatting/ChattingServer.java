package p02_chatting;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingServer extends Thread implements ActionListener{
	//�ʵ� ����
	Frame frame; //������â ���������� Ŭ����
	TextArea tf; //���� �Է��ϴ� ���� ���� Ŭ����
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
		
	}
	
	private void service() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	} 
	
	public static void main(String[] args) {
		
	}

}
