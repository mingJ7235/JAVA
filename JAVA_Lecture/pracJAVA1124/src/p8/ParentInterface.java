package p8;

public interface ParentInterface {
	public void method1 ();
	public default void method2 () { //2020�� �߰� �ڵ�
		System.out.println("2020 new Code");
	}
}
