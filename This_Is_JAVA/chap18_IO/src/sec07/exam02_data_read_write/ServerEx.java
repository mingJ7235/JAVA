package sec07.exam02_data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
				
				//�����͸� �ޱ�
				byte [] bytes = null;
				String message = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes); //�����͸� �д°�. ������ �������� ���� ����Ʈ ��.
																			//�����ʹ� bytes�� ����
				
				message = new String(bytes, 0, readByteCount, "UTF-8");
				
				System.out.println("[������ �ޱ� ����]\n���� �޼��� : " + message);
				
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[������ ���� ����]");
				
				is.close();
				os.close();
				socket.close(); //������ ���ڴٴ°���
				
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
