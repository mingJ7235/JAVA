package p1;

public class CaptionTV extends TV{
	String text;
	void caption() {
		System.out.println(text);
	}
	@Override
	void channelUp() {
		System.out.println("CaptionTV ä�� ��");
		channel += 5;
	}
	@Override
	void channelDown() {
		System.out.println("Caption TV ä�� �ٿ�");
		channel -= 5;
	}
	void captionTVMethod () {
		System.out.println("CaptionTV�� �ڽ��� �޼ҵ� �κ�");
	}
}
