package p2;

import p2.OuterStatic.InnerStatic;

public class OuterStaticMain {
	public static void main(String[] args) {
		//static ���� Ŭ������ �ܺ�Ŭ������ ��üȭ ���� �ʾƵ�, ���� �� �� �ִ�.
		
		//1. �ܺ�Ŭ������ ��üȭ ������� ��üȭ ��ų �� �ִ�. (�ܺ�Ŭ�������� ���ٸ� ��Ű�� ����.) 
//		OuterStatic.InnerStatic oi = new OuterStatic.InnerStatic();
		InnerStatic oi = new InnerStatic(); //import�� �ϸ� �̷��Ե� ������.
		oi.iia = 300;
		oi.iiaMethod();
		oi.iisa = 200;
		oi.iisaMethod();
		
		//new�� �� ������ �ν��Ͻ� ������� heap�� �ø��� ���ؼ���.
		//oi�� ��üȭ ���ϰ� �ٷ�
		//OuterStatic.InnerStatic.iia �̷������� �����ص�������,
		//�̷��� �ϸ� static ����Ŭ������ �ִ� �ν��Ͻ� ������� heap�� �ö��� �ʱ� ������,
		//new�� �Ͽ� ��üȭ�� �����ִ� ���̴�. 
		
	}
}
