package p1;

public class SmartTelevsion implements RemoteControl, Searchable{
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("����Ʈ TV �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("����Ʈ TV ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}if (volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		System.out.println("���� TV ������" + volume);
	}

}
