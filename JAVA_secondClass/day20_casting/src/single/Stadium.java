package single;

public class Stadium {
	public static void main(String[] args) {
//		IronMan i = new IronMan();
		//�Ұ��ϴ�. �����Ҽ�������. IronMan Ŭ�������� private���� ���Ƴ���. ��ü�� �ϳ��⶧���̴�. 
		IronMan.fight();
		
//		IronMan.walk(); �̰� �����̾ȵȴ�. �ֳ��ϸ� walk���� static�� ������ �ʾұ� �����̴�.
		//�׷��� �̰Ϳ� �����ϱ����ؼ��� ��ü�� �����ؾ��ϰ�,
		IronMan i = IronMan.getInstance();
		//��ü�� ����� ������ �̷��� �����ؾ��Ѵ�.
		//IronManŬ�������� ������ new�� ȣ���ؼ� �������� ���̴�. 
		
	}
}
