package p5_tostring;

import java.util.Date;

public class CardToString {
	public static void main(String[] args) {
		Card card = new Card();
		System.out.println(card.toString());
		Date date = new Date();
		System.out.println(date.toString());
		String name = "�̼���";
		String name1 = new String("�̼���");
		System.out.println(name.toString());
		System.out.println(name1.toString());
	}
}
