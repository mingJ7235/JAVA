package review;

public class VariableTest2 {
	public static void main(String[] args) {
		VariableTest vt = new VariableTest();
		System.out.println(vt.data);
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f2();
		vt = new VariableTest();
		//�ٽ� �ʱ�ȭ�ϴ°��� �ٽ� ���� �ٽ� �ʱ�ȭ. ����;
		vt.f();
		//static�� ������ �ʱ�ȭ�� �ȵ�. 
		//���������� static ������ ����. 
		vt.f();
	}
}
