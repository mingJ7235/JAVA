package p4_anonymous;

public class RemoteControlMain {
	public static void main(String[] args) {
//		RemoteControlRun rtr = new RemoteControlRun();
//		rtr.turnOn();
		
		//�͸�Ŭ������ ����ϴ� ���. 
		//������ü�� �����ϰ� �ٷ� �����
		RemoteControl rtr = new RemoteControl() {
			//�͸�Ŭ������ �ʵ带 �������ִ�. ������ static�� ���� ������.
			int a = 10;
			
			@Override
			public void turnOn() {
				System.out.println("�͸� ��ü �ѱ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("�͸�ü ����");
				ss();
			}
			//�͸�Ŭ���� �ڽŹ��� �޼ҵ带 ���� �� �ִ�.
			//������, �� �޼ҵ�� �ܺο��� ����� �Ұ��ϰ�, �͸�Ŭ���� ���ο����� ��밡���ϴ�. 
			public void ss () {
				System.out.println("�͸� ��ü �ڽ��� �޼ҵ�");
			}
		};
		rtr.turnOff();
		//rtr.ss(); ��� �Ұ����ϴ�!!!
		
		Searchable sr = new Searchable() {
			int sss = 100;
			@Override
			public void s2() {
				System.out.println("�͸�ü�� S2�޼ҵ�");
				cc();
				sss += 10;
			}
			
			@Override
			public void s1() {
				System.out.println("�͸�ü�� S1�޼ҵ�");
				cc();
				sss += 10;
				
			}
			void cc () {
				System.out.println("�͸�Ŭ���� ���ο����� ����ϴ� �޼ҵ�");
				sss += 10;
			}
		};
		sr.s1();
		sr.s2();
		
		
	}
}
