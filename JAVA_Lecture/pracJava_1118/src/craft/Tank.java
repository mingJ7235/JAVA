package craft;

public class Tank extends Unit {
	int x = 150;
	int y = 150;
	
	@Override
	void move(int x, int y) {
		this.x = x -50;
		this.y = y+ 50;
		System.out.println("��ũ�� ��ġ : " + this.x + ", " + this.y);
	}
	
	@Override
	void stop() {
		System.out.print("��ũ ");super.stop();
	}
	
	
	
	void changeMode () {
		System.out.println("��ũ ���ݸ�带 ��ȯ�Ѵ�");
	}
}
