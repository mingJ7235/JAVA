package p2;

public class AnimalMain {
	public static void main(String[] args) {
		//강아지 클래스 객체화
		Dog dog = new Dog();
		//고양이 클래스 객체화
		Cat cat = new Cat();
		//강아지 클래스 다형성
		Animal doggy = new Dog();
		//고양이 클래스 다형성
		Animal kitty = new Cat();
		Dog doggy2 = (Dog) doggy;
		//동물클래스 객체화s
//		Animal animal = new Animal ();
		
		//출력 고양이는 야옹야옹 !! 하고 웁니다. 고양이는 숨을 쉽니다. 강아지는 멍멍하고 짖습니다. 강아지는 숨을 쉽니다.
		System.out.print(cat + "는 ");
		cat.sound();
		System.out.println(" 하고 웁니다.");
		System.out.print(cat + "는 ");
		cat.breathe();
		System.out.print(dog + "는 ");
		dog.sound();
		System.out.println("하고 짖습니다.");
		System.out.print(dog + "는 ");
		dog.breathe();
		doggy.sound();
		kitty.sound();
		//오버라이드된 메소드는, 다형성에 의해서 
	}
}