package p9;

public class A {
	//Ŭ���� �ȿ� ���� �� �ִ� ���
	B b = new B();
	int number;
	static int snumber;
	static final String NAME = "�����";
	int [] score = new int [10];
	public A() { }
	void method () {
//		bnumber = 20;
//		System.out.println(SNAME);
		//�ٱ� Ŭ�������� ���� Ŭ������ ������� ������ �Ұ��ϴ�.
		b.bnumber = 20;
		//�����ϱ����ؼ��� ��ü�� �����Ͽ� �����ؾ��Ѵ�. 
	}
	static void smethod () {
		
	}
	//Ŭ������ �� �� ���� (���� Ŭ����)
	class B {
		int bnumber;
//		static int sbnumber;
		static final String SNAME = "���";
		int [] bscore = new int [10];
		public B() {

		}
		void bmethod () { //�ٱ� Ŭ������ ��� ������� �� ����� �� �ִ�. 
			number = 50;
			snumber = 50;
			System.out.println(NAME);
			score[9] = 20;
			method ();
			smethod();
		}
//		static void sbmethod () {
//			
//		}
		
		//Ŭ���� �ȿ�, Ŭ���� �ȿ�, Ŭ���� ����
		class C {
			
		}
	}
}