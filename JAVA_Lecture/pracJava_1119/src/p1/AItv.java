package p1;

public class AItv extends TV{
	String AI;
	@Override
	void channelUp() {
		System.out.println("AI TV ä�� ��");
		channel += 10;
	}
	
	@Override
	void channelDown() {
		System.out.println("AI TV ä�� �ٿ�");
		channel -= 10;
	}
	
}
