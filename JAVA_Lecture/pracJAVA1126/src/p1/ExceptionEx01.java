package p1;

public class ExceptionEx01 {
	public static void main(String[] args) {
		int a = 10;
		try {
			int [] arr = new int [5];
			arr [5] = 30; //���ܰ� �߻��ϸ� �Ʒ��κ��� ������� �ʴ´�. �׷��� try catch�� ��� ���̴�. 
			int c = a / 0;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ũ�Ⱑ �Ѿ������ �Ծ� �Ѥ�");
		}catch (ArithmeticException e) {
			System.out.println("�и� 0�̸� �ȴ�");
		}/*catch (Exception e) { //exception�� ��� ���ܸ� �� ��´�. ������ �̰͸� ����ϸ� ���� ������ �б⸦ ���� �� ����.
			System.out.println("��� ���ܸ� ó��");
		}*/
		finally { //������ �� ���� �ڵ���� catch�� �Ȱɸ����� ������ �����Ѵ�. ��, catch�� ���� ������� �ݵ�� �����ϰ� ���ش�.
			System.out.println("DB�ݱ�");
			System.out.println("����� �ڿ�����");
			
		}
		
		
		//����ó���� �ݵ�� ���־�� �Ǵ� Ŭ������ �޼ҵ尡 �ִ�. ex> FILE, DB����, Thread ����� ���ܿ� �Բ�����Ѵ�.
		//����ó���� ������ ��ġ�°��� �����̾ƴ϶�, ���α׷��� ������ �� ����ǵ��� ���ִ� ���̴�. 
		
		//���ܴ� ���� ���������� ������ ���� ���ܷ� �Ѿ�� �ʴ´�.
		//���� ���� ���ܰ� ���� ó���� �Ǹ鼭 ���� ���ܴ� �������� �ʴ´�. 
	}
}
