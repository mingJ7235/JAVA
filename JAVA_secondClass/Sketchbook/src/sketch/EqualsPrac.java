package sketch;

class Animals implements Cloneable{
	String name;
	public Animals(String name) {
		this.name = name;
	}
	public Object clone () throws CloneNotSupportedException {
		return super.clone();
	}
}


public class EqualsPrac {
	public static void main(String[] args) {
		Animals a1 = new Animals("ȣ����");
		try {
			Animals a2 = (Animals) a1.clone();
			System.out.println(a1.name);
			System.out.println(a2.name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Ŭ���� Object�� �ִ� �޼ҵ��. ������ �� clone�� protected �� ��Ű���� �ٸ��� ȣ�� �Ұ�.
		//ObjectŬ������ java.lang�̶�� ��Ű���� �ִ�. �׷��� ȣ���� �ٷξȵȴ�. 
		
	}
	
	
	
	
}
