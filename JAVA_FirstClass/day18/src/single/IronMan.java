package single;

public class IronMan {
	
	
	private IronMan() {}
	//private���� ���Ƽ� new���� ���ϰ��Ѵ�.
	
	public static IronMan getInstance() {
		IronMan im = new IronMan();
		return im;
	}
	//getInstance��� �޼���� IronMan Ÿ���� �����ϴ� �ż���. 
	
	public static void fight () {
		System.out.println("�� �߻�");
	}
	
	public void walk ()	{
		System.out.println("���ư���");
	}
	
}
