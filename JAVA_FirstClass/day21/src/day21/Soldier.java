package day21;

public interface Soldier {
	//���(������ �ʴ� ��), �߻�޼��� �� ������ �����ϴ�.
	final static int arm = 2;
	int legs = 2;
	
	public abstract void eat ();
	void work();
	//�ٵ� ���� �޼��� = �߻�޼���.
	//abstract�� ���� ���� = ����!!
	void play();
	void sleep();
	void salute();
	
}
