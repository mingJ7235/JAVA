package day25Prac;

public class ObjectTest2 {
	
	int data1 = 10;
	int data2 = 20;
	int data3 = 30;
	
	public ObjectTest2(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		String result =""+ (data1 + data2 + data3);
		return result;
	}
	
	public static void main(String[] args) {
		ObjectTest2 o = new ObjectTest2(90, 80);
		System.out.println(o);
//		System.out.println(o.toString());
		//��ü���� ����� �� �׻� �ڿ� toString ()�� �����ȴ�. 
		char [] arWord = {'��', '��'};
		System.out.println(arWord);
		System.out.println(arWord.toString());
		int [] arNum = {1,2,3};
		System.out.println(arNum);
		System.out.println(arNum.toString());
		//�迭���� ����ϸ� ������ �����ּҰ� ���´�. 
		//�ֳ��ϸ� �迭�� heap �޸𸮿� ����Ǳ� �����̴�. 
		//�׷��� ��� arWord�� ����ߴµ� '�ȳ�' �� �����°�? 
		//���� String�̶�� Ÿ���� ����. ���� char�� ���� ���� Ÿ���̴�. 
		//�׷��� ���谳���ڵ��� char Ÿ���� �迭�� ����ϸ� �ٷ� ���ڿ��� ����ϵ��� �Ѱ��̴�. 
		//�ּҰ��� ������ .toString�� ����Ѵ�. char �迭�� �����ϰ� ������. ��? ���� ����Ҷ��� �� ���� ��������ϱ�!
		//�׷��Ƿ� arWord�� toString�� �ٿ���� �ּҸ� ���� �� �ִ�. 
		
		String data = "1.2.3.4.5.6.";
		System.out.println(data.substring(3));
		//�ڸ��� String �ȿ��ִ� �޼���
		
		
	}
}
