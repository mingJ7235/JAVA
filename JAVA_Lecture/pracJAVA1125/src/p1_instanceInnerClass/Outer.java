package p1_instanceInnerClass;
//�ν��Ͻ� ���� Ŭ���� ����
public class Outer {
	//�ν��Ͻ� ���
	int ia = 10;
	void iaMethod () {
		//���� Ŭ���� ����� ��� �Ұ�
		
		System.out.println("�̰��� �ܺ�Ŭ����");
	}
	//���� ���
	static int isa = 20;
	static void isaMethod () {}
	
	class Inner {
		//����Ŭ������ ���
		int iia = 30;
		void iiaMethod () {
			System.out.println("�̰��� ����Ŭ����");
		}
		//����Ŭ���������� �ν��Ͻ� ����� ���� �����ϴ�.
//		static int iisa = 40;
//		static void iisaMethod () {} //���� Ŭ��������  static�� �� �� ����. 
		
		//�ܺ� Ŭ���� ��� ��� => �� ���������� ��ø Ŭ������ ��� �ϴ� ����.
		//���� ���� �ܺ� Ŭ������ ������� ����� �� ����. 
		//�� ) �ܺ� ������ȭ�� ���� ��ư Ŭ����
		void iiaMethod2 () {
			ia += 30;
			iaMethod ();
			isaMethod();
		}
		
		
	}
}
