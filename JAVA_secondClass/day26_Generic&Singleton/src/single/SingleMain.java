package single;
/*
 * ��Ű�� �� .(����������)�� ����ϸ� ������ �ϳ� �� ���������.
 * a.b.c.d
 * a.���� �ȿ� b�����ȿ� c�����ȿ� d
 * 
 */
public class SingleMain {
	public static void main(String[] args) {
//		day26.Single s = new day26.Single();
		singleton.Single s = singleton.Single.getInstance();
		//�̷��� ���°��̴�. ���� heap�� �Ҵ������ʰ� new �س��� �ϳ��� ��ü�� ����ϴ� ��. 
		s.sayHello();
		
		
	}
}
