//this��� ������ ������ �ִ� �ּҰ��� ������ ��ü�� �ּҰ� �Ѿ�ٴ� ���� �����ִ� ����.
//this : ������ ��ü�� ������ �ִ� �ּҰ�. 

//. �տ��� ������ �ּҰ��� �� �� �����Ƿ�, this�� �ּҰ��̴�. 
package day09_new;
class A {
	int data = 100;
	
	int getData ()	{
		System.out.println(this);
		return this.data;
	}
}

public class ClassTest {
	public static void main(String[] args) {
		A obj = new A ();
		A obj2 = new A();
		
		System.out.println(obj);
		System.out.println(obj2);
		
		obj2.data = 400;
		
		System.out.println(obj.getData());
		System.out.println(obj2.getData());
	}

}

//obj ���� �ּҰ� ����ִ�
//obj �� obj2�� �ּҰ� �ٸ���. new�� ���� ���� �����ڸ� ȣ���� ������ �ּҰ� ���� �����. 