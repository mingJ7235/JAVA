package day16;

public class VariableTest2 {
	public static void main(String[] args) {
		VariableTest vt = new VariableTest();
		//�߻����� Ŭ������ VariableTest�� vt�� ��üȭ�ؼ� ������ �� �ְ� ����� ����. 
		//��üȭ.Ŭ������ ��ü�� �ٲ��ش�. ��üȭ �߻����� ������ ����ȭ��Ų��.
		
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		
		vt.f2();
		vt = new VariableTest();
		//new�� ������ ���� �ʱ�ȭ �Ǿ��� ������. �������� data�� �ٽ� 0 �̵ȴ�. 
		//������, static�� ������ new�� ������ �ʱ�ȭ�� ���� �ʴ´�. 
		vt.f();
		
	}
}
