package p1;
//���̵� �������� ������ ������ ����� ���� ���� Ŭ����
public class NotExistIDException extends Exception{
	//�⺻������
	public NotExistIDException () {}
	//����� ������ �����
	public NotExistIDException (String msg) {
		super (msg);
		//�θ��� �����ڷ� ���� ��.
	}
	
}
