package day10_new;

public class Variable2 {
	public static void main(String[] args) {
		Variable1 v1 = new Variable1();
		Variable1 v2 = new Variable1();

		v1.data_s = 400;
		System.out.println(v1.data_s);
		System.out.println(v2.data_s);
		Variable1.data_s =600;
		System.out.println(Variable1.data_s);
		System.out.println(v1.data_s);
		System.out.println(v2.data_s);

		//v1���� �����ؼ� data_s�� ��ȭ ���״µ�
		//v2���� �����ص� ���Ͽ��ִ�. 
		//�̸��� static������ ��ü�������
		//���� �����ϰ� �����Ѵٴ� ���̴�.
		
		
		//�׷��Ƿ� v1���� �������� �ʰ�
		//�̷��� Ŭ���������� ���� static������ �����Ѵ�
		//�׷��� static������ Ŭ������������Ѵ�. 

		++Variable1.data_s;
		++Variable1.data_s;
		++Variable1.data_s;
		++Variable1.data_s;
		System.out.println(Variable1.data_s);
		
		v1.increase();
		v1.increase();
		v1.increase();
		v1.increase();
		System.out.println(v1.data);
		v1 = new Variable1();
		//new�� ������ ���������� �ʱ�ȭ�� �ȴ�. 
		v1.increase();
		v1.increase();
		v1.increase();
		v1.increase();
		System.out.println(v1.data);
		
	}
}