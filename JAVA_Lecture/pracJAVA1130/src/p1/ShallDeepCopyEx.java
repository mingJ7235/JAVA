package p1;

public class ShallDeepCopyEx {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1, 1), 2.0);
		Circle c2 = c1.shallowCopy(); //��������
		Circle c3 = c1.deepCopy();//��������
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		//���� ����
		c1.p.x = 9;
		c1.p.y = 10;
		c1.r =30; //�⺻���̱� ������ ���� ���簡 �ǹǷ� ������ ���Ͽ��� �ٲ��� �ʴ´�. (������ �Ȱ��̹Ƿ�)
						//��, ������ ���纻�� �ٸ� ������ ������.
						//������, �������翡�� ��ü���� ���� ������ �����Ƿ� ����ȴ�. 
						//��ü���� ��� �����ϰ� �ʹٸ�, ���� ���縦 �ؾ��Ѵ�. 
		Circle c4 = c1.deepCopy();// �ٽ� ��������
		
		System.out.println("�� ���� �� ");
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		
	}
}
