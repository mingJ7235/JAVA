package p3_localInnerClass;
//���� Ŭ����
public class LocalMemberOuter {
	//�ν��Ͻ� ���
	int ia = 10;
	void iaMethod () {
		System.out.println("�̰��� �ܺ�Ŭ����");
	}
	//���� ���
	static int isa = 20;
	static void isaMethod () {}
	
	void innerMethod() {
		int ii = 19; //�ڵ����� ���� Ŭ������ ���Ͽ� final ó���� �׷��� ������, �޼ҵ� �� ����Ŭ���������� ����� ������ ���� �Ұ���
		//�޼ҵ� �ȿ� Ŭ������ �ִ´�.
		class LocalInner {
			//�޼ҵ尡 �����Ҷ��� �� Ŭ������ ��üȭ�� �Ǵ� ����
			//Ŭ���� ����
			int inna = 10;
//			ia += 10;
//			isa += 10;
//			ii =20; ���� �Ұ�
			void innaMethod () {
				System.out.println("�̰��� �����̳�Ŭ�����Դϴ�.");
				ia += 10;
				//����Ŭ������ ����ִ� �޼ҵ忡�� ����� ������ ��븸 �����ϰ� �����̺Ұ��ϴ�.
				ia = ia + ii; 
				System.out.println(ii);
				
			}
//			static innsa = 20;	//static �ʵ�, �޼ҵ�� ���� => �ν��Ͻ� �޼ҵ� �ȿ� �־��
//			static innsaMethod () {}
			public LocalInner() { //������ ����
			}
		}//end localInner class
		//LocalInner Ŭ������ ��üȭ ���Ѽ� �����ϴ� �ڵ� �ۼ� !!
		LocalInner li = new LocalInner();
		li.inna += 20;
		li.innaMethod();
		
	}//end innerMethod
}
