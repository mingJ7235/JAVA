package single;

public class IronMan {
	
	private IronMan () {}
	
	public static IronMan getInstance () {
		IronMan im = new IronMan();
		return im;
	}
	
	public static void fight () {
		System.out.println("�� �߻�");
	}
	public void walk () {
		System.out.println("���ư���");
	}
}
