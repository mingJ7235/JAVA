package day22_innerClass;

public class OutClass {
	//�ܺ�Ŭ���� �ʵ�
	int outData;
	
	public OutClass() {
		System.out.println("�ܺ� Ŭ���� ������ ȣ�� ��.");
	}
	public void showOuter() {
		System.out.println("�ܺ� Ŭ������ �޼��� ȣ�� ��.");
	}
	public class InnerClass{
		//public class�� �������ش�. 
		//�굵 OuterClass�� �ʵ� �� �ϳ��� �ν��ϸ� �ȴ�.
		int inData;
		public InnerClass() {
			System.out.println("���� Ŭ���� ������ ȣ�� ��.");
		}
		public void showInner() {
			outData = 20;
			//�ܺ�Ŭ���� ������ ��밡��
			System.out.println("���� Ŭ������ �޼��� ȣ�� ��.");
			System.out.println("outData : " + outData);
			showOuter();
			//�ܺ�Ŭ���� �޼ҵ嵵 ��밡��
			//���ο��� �ܺ��� �ʵ�鿡 ����. ������ ������. 
		}
	}
//	InnerClass inner = new InnerClass();
	
	public static void main(String[] args) {
		//�ܺ�Ŭ�������� ��üȭ�Ѵ�.
		OutClass out = new OutClass();
		//out ��ü�� ����Ͽ� ����Ŭ������ �����ڸ� ȣ���Ѵ�. 
		OutClass.InnerClass in = out.new InnerClass();
		in.showInner();
		
		
		//��³���. !!
//		�ܺ� Ŭ���� ������ ȣ�� ��.
//		���� Ŭ���� ������ ȣ�� ��.
//		���� Ŭ������ �޼��� ȣ�� ��.
//		outData : 20
//		�ܺ� Ŭ������ �޼��� ȣ�� ��.
		
		//workspace �� bin ������ ���� OutClass$InnerClass.class �������ִ�.
		//�̰� ����Ŭ������. 
		
		
		
		
		
		
		
		
		
	}
	
}
