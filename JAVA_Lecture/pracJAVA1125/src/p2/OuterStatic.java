package p2;
//static ���� Ŭ���� ����
public class OuterStatic {
	int ia = 10;
	void iaMethod () {
		//static ����Ŭ������ static �ʵ�� Ŭ���������� �����ϸ� ������ �ȴ�. 
		InnerStatic.iisa =40;
		InnerStatic.iisaMethod();
		System.out.println("�̰��� �ܺ�Ŭ����");
	}
	//���� ���
	static int isa = 20;
	static void isaMethod () {}
	
	//static ����Ŭ����
	static class InnerStatic {
		//����Ŭ������ �ν��Ͻ� ���
		int iia = 30;
		void iiaMethod () {
			iia = iia -10;
			//�ܺ�Ŭ������ static (����) ����� ��밡���ϴ�. ��? ����Ŭ������ static�̹Ƿ� ���� �޸𸮿� �ö󰡹Ƿ�.
//			ia +=20;
			isa +=20;
		}
		//���� ���
		static int iisa = 40;
		static void iisaMethod () {
			//���� ����Ŭ���� �ȿ� �־, �ν��Ͻ� ����� iia �� ������ �� �� ����. 
//			iia = iia-10;
		}
		
		
	}
}
