package singleton;



public class Single {
	//�����ڸ� private���� �ϸ� ���ٸ��ϰ��Ѵ�.
	private Single() {} //�ۿ��� new������! ��� �ǹ�
	
	//instance ��� ��ü�� ����Ҽ��ֵ��� ���鵵��
	private static Single instance = new Single();

	public static Single getInstance() {		//���� �� �� �ֵ��� ������ش�. 
		return instance;
	}

	//setter�� �����ش�. �ֳ��ϸ� ������ �� ������ ����°� �����̹Ƿ�!
//	public static void setInstance(Single instance) {
//		Single.instance = instance;
//	}

	
	public void sayHello() {
		System.out.println("�ȳ�");
	}
}



