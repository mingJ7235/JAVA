package p9;

public class A {
	//클래스 안에 넣을 수 있는 멤버
	B b = new B();
	int number;
	static int snumber;
	static final String NAME = "김민재";
	int [] score = new int [10];
	public A() { }
	void method () {
//		bnumber = 20;
//		System.out.println(SNAME);
		//바깥 클래스에서 내부 클래스의 멤버들은 접근이 불가하다.
		b.bnumber = 20;
		//접근하기위해서는 객체를 생성하여 접근해야한다. 
	}
	static void smethod () {
		
	}
	//클래스도 쓸 수 있음 (내부 클래스)
	class B {
		int bnumber;
//		static int sbnumber;
		static final String SNAME = "룰라";
		int [] bscore = new int [10];
		public B() {

		}
		void bmethod () { //바깥 클래스의 모든 멤버들을 다 사용할 수 있다. 
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
		
		//클래스 안에, 클래스 안에, 클래스 가능
		class C {
			
		}
	}
}
