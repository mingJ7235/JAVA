package p1;
//�θ�Ŭ������ TV ��뿡 �ʿ��� ������ �κ� ���
public class TV {
	boolean power; //���� 
	int channel;
	void power () {power = !power;}
	void channelUp () {
		++channel;
		System.out.println("channel = "+channel);
	}
	void channelDown() {
		--channel;
		System.out.println("channel = "+channel);
	}
	
}
