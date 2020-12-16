package sec06.exam01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args)  {
		try {
			InetAddress local = InetAddress.getLocalHost(); 
			System.out.println(local);
			System.out.println("�� ��ǻ�� IP�ּ� : " + local.getHostAddress());//���� ip���
			
			//���������� ip���
			InetAddress [] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP�ּ� : " + remote.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
