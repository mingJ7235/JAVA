package craft;

public class Dropship extends Unit {
	int x = 1100;
	int y = 2500;
	
	@Override
	void move(int x, int y) {
		this.x = x -100;
		this.y = y- 500;
		System.out.println("������� ��ġ : " + this.x + ", " + this.y);
	}
	
	@Override
	void stop() {
		System.out.print("����� ");super.stop();
	}
	void load (int a, int b) {
		System.out.println("����� ������ġ" + "(" +a + "," 
				+ b + ")" +"���� ������ �¿��.");
	}
	void unload (int a, int b) {
		System.out.println("����� ��ũ��ġ" + "(" +a + "," 
				+ b + ")" +"���� ��ũ�� ������.");
	}
}
