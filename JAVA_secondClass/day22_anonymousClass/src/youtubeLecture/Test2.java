package youtubeLecture;

public class Test2 {
	public void print () {
		System.out.println("����");
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2() {
			@Override
			public void print() {
				super.print();
			}
		};
	}
}
