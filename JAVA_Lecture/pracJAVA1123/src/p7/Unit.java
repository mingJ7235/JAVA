package p7;
//인터페이스끼리는 extends로 상속을 받는다. 
//인터페이스끼리 상속이 된다. 
//부모 인터페이스 2개를 상속 받고싶다. ObjectInter, Moveable 둘다 받고싶음. => 불가함.
//이중상속 불가. 단일상속밖에 되지 않는다. 
public interface Unit extends ObjectInter, Moveable{

	//상수
	static final int unitMAX = 100;
	
	//추상메소드
	public abstract void unitMax ();
	
	
}
