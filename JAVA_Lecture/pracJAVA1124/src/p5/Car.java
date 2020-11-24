package p5;
//비지니스 로직 부분의 클래스
public class Car {
	Tire frontLeftTire = new HankookTire(); //필드의 다형성
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new KumhoTire();
	Tire backRightTire = new KumhoTire();
	
	void run () {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
