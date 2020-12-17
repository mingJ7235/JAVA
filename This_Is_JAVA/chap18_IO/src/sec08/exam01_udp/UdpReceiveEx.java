package sec08.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveEx {
	public static void main(String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket (5001); //���ù��� ��Ʈ��ȣ�� �༭ ���ε� ��������Ѵ�.
		
		Thread thread = new Thread () {
			public void run() {
				System.out.println("[���� ����]");
				try {
					while (true) {
						DatagramPacket packet = new DatagramPacket(
								new byte [100], 100);
						ds.receive(packet);
						
						String data = new String (packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("[���� ���� : " + packet.getSocketAddress() + "]" + data);
					}
				}catch (Exception e) {
					System.out.println("[���� ����]");
				}
			}
		};
		
		thread.start();
		
		Thread.sleep(10000); //10�� ���Ŀ� Ŭ�����Ű�� ����
		ds.close();
	}
}
