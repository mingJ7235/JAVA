package youtubeLecture;
interface Testable {
	public void print();
}

class InterfaceClass implements Testable{
	@Override
	public void print() {
		System.out.println("Hi!");
	}
}

class ClassA {
	public void print () {
		System.out.println("Good!");
	}
}

public class Test {
	public static void main(String[] args) {
		InterfaceClass Test1 = new InterfaceClass();
		Test1.print(); //�Ϲ����� Ŭ���� ȣ��
		ClassA Test2 = new ClassA();
		Test2.print(); //�Ϲ����� Ŭ���� ȣ��
		
		InterfaceClass Test3 = new InterfaceClass() {
			public void print() {
				System.out.println("Anonymous Test");
			}; 
		};
		
		Test3.print();
		
		ClassA Test4 = new ClassA() {
			@Override
			public void print() {
				super.print();
			}
		};
		
		
	}
}
