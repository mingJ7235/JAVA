package p7;

public class ButtonEx {
	
	int a = 20;
	static int sa = 30;
	//����� �������̽��� �����, �޼ҵ忡 �־ ���. 
	//Ŭ���� �ȿ� �������̽��� �ִ°���. 
	void aMethod () {
		new OnClickListener() {
			
			@Override
			public void on() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void off() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	static void saMethod () {}
	
	interface OnClickListener {
		default void dMethod () {
//			a += 10; //�ν��Ͻ� ���� ���Ұ�
			sa += 20;
//			aMethod (); //�ν��Ͻ� �޼ҵ��� �Ұ�
			saMethod();
		}
		void off ();
		void on ();
	}
}
