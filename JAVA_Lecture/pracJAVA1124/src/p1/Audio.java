package p1;

public class Audio implements RemoteControl, Searchable{

	@Override
	public void search(String url) {
		System.out.println(url + " ä���� �̻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}if (volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		System.out.println("���� ������ " + volume +"�Դϴ�.");
	}
	
	public void chatting (String msg) {
		System.out.println(msg);
	}
	
}
