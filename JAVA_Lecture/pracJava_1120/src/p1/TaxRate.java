package p1;
//�����Ͻ� ����
public class TaxRate {
	public void taxRate(Employee e) {
		if (e instanceof Manager) {// �ڼ��� ���� �ɾ��ش�. �θ� �ɾ��ָ� ù��° if ���� �� �ɸ��� �����̴�. 
			Manager m = (Manager) e; 
			System.out.println("Manager ���� ����ϱ� : "  + m.money * m.taxRate + "��");
		}else if (e instanceof Engineer) {
			Engineer e1 = (Engineer) e;
			System.out.println("Engineer ���� ����ϱ� : " + e1.money * e1.taxRate + "��");
		}else if (e instanceof Parttime) {	
			Parttime p = (Parttime) e;
			System.out.println("Parttime ���� ����ϱ� : "  + p.money * p.taxRate + "��");
		}else if (e instanceof Employee) {
			Employee e2 = (Employee) e;
			System.out.println("Employee ���� ����ϱ� : " + e2.money * e2.taxRate + "��");
		}
	}
}
