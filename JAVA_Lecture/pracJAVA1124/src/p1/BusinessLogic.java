package p1;

public class BusinessLogic {
	void start ( ) {
		RemoteControl rc = null; //�������̽��� ���������� ����ϱ� ���Ͽ� ����
		RemoteControl rcadio = null;
		
		rc = new SmartTelevsion();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		
		//search() ȣ���ϱ�
		//down casting �ϱ�
		SmartTelevsion sm = (SmartTelevsion) rc;
		sm.search("KBS");
		
		rcadio = new Audio();
		rcadio.turnOn();
		rcadio.setVolume(5);
		rcadio.setMute(true);
		rcadio.turnOff();
		
		Audio audio = (Audio) rcadio;
		audio.search("FM11.3");
		audio.chatting("����ؿ� ������");
	}
}