package p3_ApiEx;

public class MemberMain {
	public static void main(String[] args) {
		Member obj1 =new Member("blue");
		Member obj2 =new Member("blue");
		Member obj3 =new Member("red");
		
		if (obj1.equals(obj2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		if (obj1.equals(obj3)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
	}
}
