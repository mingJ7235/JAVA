package day22_anonymousClass;

public class Starbucks {
	private String [] menu = {"�Ƹ޸�ī��", "����Ƽ", "īǪġ��"};
	private int[] arPrice = {5000, 8000, 9000};
	private int income;
	String choice = "īǪġ��";

	public String[] getMenu() {
		return menu;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}

	public int[] getArPrice() {
		return arPrice;
	}

	public void setArPrice(int[] arPrice) {
		this.arPrice = arPrice;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public void registCafe (Cafe c, String choice) {
		c.setMenu(menu);
		System.out.println("ī�� ��� �Ϸ�");
		System.out.println("----Menu----");
		for (int i = 0; i < c.getMenu().length; i++) {
			System.out.println(i+1+c.getMenu()[i]);
		}
		c.sell(choice);
	}
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		gangnam.registCafe(new Cafe() {

			@Override
			public void setMenu(String[] menu) {
				gangnam.menu = menu;
			}

			@Override
			public String[] getMenu() {
				return gangnam.menu;
			}

			@Override
			public void sell(String choice) {
				for (int i = 0; i < gangnam.menu.length; i++) {
					if(gangnam.menu[i].equals(choice)) {
						gangnam.income += gangnam.arPrice[i];
					}else {
						
					}
				}
			}
			
		}, "����");
		
		System.out.println("īǪġ�� �ֹ� �Ϸ�");
		System.out.println("���� ���� : " + gangnam.getIncome());
			// new Cafe�� �ؼ� �ּҰ��� �Ѱ��ִ°��̴�. 
			// Cafe Ÿ���� new�� �����༭ �Ѱ��ִ� ���̴�. 
			//new Cafe�� ���̴�. ��� �̸��� ����. �͸�Ŭ����
			//�Ź� �������ؾ��ϴ� �͵��̱� ������ �͸�Ŭ����. 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			@Override
//			public void setMenu(String[] menu) {
//				gangnam.menu =menu;
//			}
//			@Override
//			public void sell(String choice) {
//				for (int i = 0; i < gangnam.getMenu().length; i++) {
//					if(gangnam.getMenu()[i].equals(choice)) {
//						gangnam.income += gangnam.arPrice[i];
//					}
//				}
//			}
//			@Override
//			public String[] getMenu() {
//				return gangnam.menu;
//			}
//		}, "īǪġ��");
	}
	
	
	
	
	
	
	
	
	
	
	
}
