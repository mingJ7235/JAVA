package craft;

public class Marine extends Unit {
	int x = 0;
	int y = 30;
	@Override
	void move(int x, int y) {
		this.x=x+10;
		this.y=y-10;
		System.out.println("������ ��ġ : " + this.x + ", " + this.y);
	}
	
	@Override
	void stop() {
		System.out.print("���� ");super.stop();
	}
	
	void stimPack () {
		System.out.println("�������� ����Ѵ�.");
	}
}
