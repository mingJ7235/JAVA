package p6;

public class Outer {
	int o1 = 10;
	void o1Method () {}
	class Inner {
		int i1 = 20;
		int o1 = 30; //�ܺ�Ŭ������ ���� Ŭ������ ��·�� �ٸ� Ŭ�����̹Ƿ�,  �����̸��� ���� ������ ����
		void i1Method () {
			//���⼭ this�� innerŬ������ �ּҴ�. 
			System.out.println(this.o1); //30
			System.out.println(o1); //30
			System.out.println(new Outer().o1); //10
			System.out.println(Outer.this.o1); //10
		}
	}
}
