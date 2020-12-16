package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		//����
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while (true) {
				//������ �׻� Ŭ���̾�Ʈ ��û�� ��ٷ����ϹǷ� ���ѷ���
				System.out.println("[���� ��ٸ�]");
				Socket socket =serverSocket.accept(); //Ŭ���̾�Ʈ�� ���� �����û�� �����ϴ� accept() �޼ҵ�.
											//�����û�� ������ ������ ���ŷ�Ǿ�����
											//Socket Ÿ���� ����
				
				InetSocketAddress  isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ������]" + isa.getHostName()); //Ŭ���̾�Ʈ ip�ּҸ� ���� �� ����
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
