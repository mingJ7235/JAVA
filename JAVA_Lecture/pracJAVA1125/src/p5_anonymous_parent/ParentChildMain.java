package p5_anonymous_parent;
public class ParentChildMain {
	public static void main(String[] args) {
		//�Ϲ����� ���
//		Child c1 = new Child();
//		Child2 c2 = new Child2();
//		c1.p1();
//		c2.p2();
		int a = 20;
		//�߻�Ŭ������ �θ� �͸� �ڽ� ��ü�� ���� ����
		//�߻� Ŭ������ ��üȭ �ߴ��� �߻�޼ҵ尡 �������̵��ϵ��� �ڵ����γ��´�. 
		Parent p1 = new Parent() {
			int b =20;
			
			@Override
			public void ap1() {
				System.out.println("�͸� �ڽ� ��ü �߻� �޼ҵ�");
				ss();
				b = a+b;
			}
			public void ss () {
				System.out.println("�͸� �ڽĸ� ��밡���� �޼ҵ�");
			}
		};
		p1.p1();
		p1.ap1();
		//�Ϲ� Ŭ������ �θ� �͸� �ڽ� ��ü�� �����
		Parent2 p2 = new Parent2() {
			@Override
			public void p2() {
				// TODO Auto-generated method stub
				super.p2();
			}
			void cc () {
				System.out.println("��?");
			}
		}; //;�� �ָ� �͸�Ŭ������� �ǹ���. �����ڿ� ����Ŭ���� ��. 
		p2.p2();
		
	}
}






