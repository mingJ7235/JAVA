package p1_instanceInnerClass;

public class OuterMain {
	public static void main(String[] args) {
		//����Ŭ������ main���� ����ϱ� ���ؼ���
		//1. �ܺ�Ŭ������ ��üȭ
		Outer outer = new Outer();
		outer.ia += 20;
		outer.iaMethod();
		outer.isa += 40;
		outer.isaMethod();
		
		//����Ŭ������ ������� �ܺ� Ŭ������ ���������� ���� ����
		// outer.iia =100;
		
		//2. ����Ŭ������ ��üȭ�ؾ��Ѵ�.
		Outer.Inner oi = outer.new Inner();
		
		oi.iia = 40;
		oi.iiaMethod();
		//���ٰ���
		
	}
}
