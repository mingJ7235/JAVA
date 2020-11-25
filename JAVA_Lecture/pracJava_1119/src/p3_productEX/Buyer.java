package p3_productEX;
//�����Ͻ� ����
public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product [] item = new Product[10]; //������ ��ǰ ���� �迭
	int i = 0;
	
	void buy (Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� ������");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "��/�� �����߽��ϴ�.");
		System.out.println("���� ���� �ݾ� : " + money + "�� ��");
	}
	
	void summary () {
		int sum = 0;
		String itemList = "";
		
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) break;
			sum += item[i].price;
			bonusPoint += item[i].bonusPoint;
			if (item[i+1] == null) {
				itemList += item[i] + " ";
			} else {
				itemList += item[i] + ", ";
			}
		}
		System.out.println("\n�����Ͻ� ��ǰ��" + itemList + "�Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ���" + sum + "�����Դϴ�.");
		System.out.println("���� �ܾ� : "  + money + "�� ���Դϴ�.");
		System.out.println("����Ʈ : " + bonusPoint + "�� �Դϴ�.");
	}
	
}
