package P;

public class View {
	public static void main(String[] args) {
		Business business = new Business();
		boolean flag = true;
		while(flag) {
			switch (business.mainMenu()) {
			case 1:
				business.input();
				break;
			case 2:
				business.output();
				break;
			case 3:
				business.addRank();
				break;
			case 4:
				System.out.println("�����մϴ�.");
				flag = false;
				break;
			default:
				System.out.println("���Է����ּ���.");
				break;
			}
		}
	}
}
