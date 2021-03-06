package p5_interface;
//인터페이스
public interface RemoteControl {
	//상수를 가질수 있다. (static final)이 생략이 되어도 자동으로 상수가된다.
	//모든 필드가 상수가된다. 
	static final double PI = 3.14;
	double EARTHAREA = 42435.22;
	//인터페이스는 모든 필드가 어차피 상수이므로, 생략해도 static final이 붙는다. 
	final double EARTHHEIGHT = 400; // static이 생략됨
	static double MAX = 9999.9999;
	
	//=====================================//
	//인터페이스의 모든 메소드는 추상메소드다. (public abstract가 생략)
	//implements 받은 클래스에서 모두 구현해줘야한다. 
	public abstract void turnOn ();
	void turnOff (); //public abstract 생략
	public void sound ();//abstract 생략
	abstract void soundOff(); //public 생략
	
	//메서드에 { } 블록이있다는 것은, 구현한다, 구현했다 라고 말한다.
	//추상메소드는 구현하면 안된다. 
	
	//default 메소드를 1.8 버젼에서 허용함
	default void setMute () {/*동작 코드 작성 */} //인스턴스 메소드
	default void setMM () { } 
	//일반 메소드처럼 사용가능. default 접근제한자만 사용가능. 
	
	//1.8 버전 이상에서 정적 메소드 허용
	static void aa () { } //클래스  메소드 허용. 
	
	//인터페이스의 생성자는 존재하지 않는다. 	
	//초기화 블록 - 안된다.
	//정적 초기화 블록 - 안된다.
	
	

	
	
	
	
}
	