package p2;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.print("멍멍!");
	}
	public Dog() {
		super.kind = "강아지";
	}
	@Override
	public String toString() {
		return "바둑이";
	}
}
