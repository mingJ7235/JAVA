package day20_abstractClass;

public interface Soldier {
	final static int arm = 2;
	int legs = 2;
	
	public abstract void eat ();
	void work ();
	void play ();
	void sleep ();
	void salute ();
}
//������ �����ϸ� ������ final static�� �����Ǿ��ִ�. �ܺο��� ���� ���� �Ұ�.
//��븸 �����ϴ�. 
//�������̽����� �޼ҵ带 �����ϸ� ������ public abstract�� �����Ǿ��ִ�. 
