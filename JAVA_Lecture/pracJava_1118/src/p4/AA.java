package p4;
//�ڽ� Ŭ����
public class AA extends B {
	
	@Override
	void bMethod1() {
		y = x * 2;
	}
	
	void aaMethod () {
		y+=20;
		//x+=20; //�θ� Ŭ�������� final�� ����� �����̱⶧���� ����Ұ�!
		System.out.println(x + 20);
		//������ �Ұ��ص� ����ϴ� ���� ������.
		
	}
}
