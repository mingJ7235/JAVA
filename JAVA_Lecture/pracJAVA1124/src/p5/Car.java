package p5;
//�����Ͻ� ���� �κ��� Ŭ����
public class Car {
	Tire frontLeftTire = new HankookTire(); //�ʵ��� ������
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
