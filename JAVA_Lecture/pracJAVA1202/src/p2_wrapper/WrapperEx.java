package p2_wrapper;

public class WrapperEx {
	public static void main(String[] args) {
		//boxing
		int i = 100;
		Integer ii = new Integer(100);
		float f = 10.5f;
		Float ff = new Float(10.5);
		char c = 'a';
		Character cc =new Character('a');
		boolean b = true;
		Boolean bb = new Boolean(true);
		
		//boxing�ϸ� �� �ش� Ŭ������ �޼ҵ�鿡 ������ �� ���ִ�.
		//�⺻Ÿ���� ������ �Ұ����ϴ�.
		
		
		//�ڽ̵� ���尴ü���� �ٽ� �⺻Ÿ���� ���� �������� (��ڽ�) '�⺻Ÿ����+value()' �޼ҵ带 ȣ���ؾ��Ѵ�.
		byte bii = ii.byteValue();
		int iii = ii.intValue();
		
		ff.byteValue();
		ff.doubleValue();
		ff.intValue();
		
		
	}
}
