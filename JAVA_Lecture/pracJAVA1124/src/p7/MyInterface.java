package p7;

public interface MyInterface {
	void method1(); //2010�� ~ ���� Ŭ���� ����
	default void method2() {
		System.out.println("2020�⵵ ���� ����");
	} //2020�⵵ ���Ŀ� ������ Ŭ���� ����
	//�������̵� ���� �ʾƵ� �Ǵ� �޼��� ��� ����. 
	//������ �����ϵ��� �س��� ����. 
	default void method3 () {
		System.out.println("2030�⵵ ���� ����");
	}//2030�� ���Ŀ� ������ Ŭ���� ����
	
	static void stMethod4 () { //2030�� ���� ���ο� �޼ҵ�
		System.out.println("���� �޼ҵ�");
	}
	//default �޼ҵ�� �������� �ʴ´�. 
	//�ٵ� default�� �����, �ٽ� �����ؾ��� ���� ����ؾ���?
	//���� �������̽��� ���µ�, 2010�� ���� ��� �Ŵ� default�ϱ� �������� ����
	//2020�� ���� �� default �޼ҵ带 ���� �޾ƾ���.
	//�̷� ���� ����Ŭ������ default �޼ҵ带 �߻�޼ҵ�� �����, �� Ŭ������ �߻�Ŭ���� �Ǵ� �������̽� ȭ �Ѵ�. 
	//��, ����Ʈ �޼ҵ带 �߻� �޼ҵ�� �缱���Ѵ�. 
	
	
}