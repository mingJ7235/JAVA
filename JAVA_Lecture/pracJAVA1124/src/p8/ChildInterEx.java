package p8;
//���� Ŭ����
public class ChildInterEx implements ChildInterfae1{
	@Override
	public void method03() {
		
	}
	@Override
	public void method1() {
		
	}
	
	@Override
	public void method2() {
		System.out.println("�޼ҵ� 2 ������");
	}
	
	void ss () {
		ChildInterfae1 ci1 = new ChildInterfae1() {
			@Override
			public void method1() {
				System.out.println("ci1-1");
			}
			@Override
			public void method03() {
				System.out.println("ci1-2");
			}
		};
		ci1.method1();
		ci1.method2();//default �޼ҵ�� �������̵� �����ʾƵ� �ٷ� ��밡���ϴ�. 
		ci1.method03();
	}
}