package p1;

public class MainTV {
	public static void main(String[] args) {
		//CaptionTV �ν��Ͻ�ȭ �ϱ�
//		CaptionTV captionTV = new CaptionTV();
//		captionTV.channelUp();
//		System.out.println(captionTV.channel);
//		captionTV.channelDown();
//		System.out.println(captionTV.channel);
//		
//		//AI TV �ν��Ͻ�ȭ�ϱ�
//		AItv aitv = new AItv();
//		aitv.channelUp();
//		System.out.println(aitv.channel);
//		aitv.channelDown();
//		System.out.println(aitv.channel);
//		
//		//TV Ŭ����
//		TV tv = new TV();
//		tv.channelUp();
//		System.out.println(tv.channel);
		
		//�ڽ��� �ν��Ͻ�ȭ �Ѱ��� �ڽ��� Ŭ������ �޾Ҵٸ�,
		TV tv1 = new CaptionTV(); //upcasting �ڵ�����ȯ
		TV tv2 = new AItv();
		//�������� Ȱ���ϸ�, �ڽ��� �ν��Ͻ�ȭ�� �θ��� Ŭ������ ��´�.
		//�̰��� �������̴�. 
		//�ڼ��� new�� �ö󰡴µ�, �θ��� ���������� ��.
		//�ڽ��� heap�� �ö󰡱� ���� �θ���� �ø���. !!
		//�׷��Ƿ� heap�� �θ��� ������ ���� �����Ƿ�,
		//�θ�Ÿ�� Ŭ������ ������ ���� �� �ִ�. 
		
//		CaptionTV tv3 = new TV();
//		AItv tv4 = new TV();
		//�ݴ��� ���� �������� �ʴ�. 
		//new �Ͽ� �θ�Ŭ������ heap �� �ö󰡸�, �ڽ��� ���� �ö���
		//�����Ƿ�, �ڽ� Ŭ���� Ÿ���� ������ ���� �� ����.
		//heap �޸𸮿��� TV() �θ�Ŭ������ �ִµ�, 
		//���������� �ڽ� Ŭ������ �����Ѿ��ϹǷ� �Ұ��� ! 
		
		//�θ� �ʵ� ����ϱ�
		tv1.power = true;
		tv2.channel = 7;
		tv2.channelUp();
		tv2.channelDown();
		
		//�θ��� �޼ҵ尡 �ƴ϶� �ڽ��� �޼ҵ尡 ����ǰ� ���� ��
		/*
		 * 1. �������̵� �� ���� �ڽ��� �޼ҵ尡 ����ȴ�. 
		 */
		tv1.channelUp();
		tv1.channelDown();
		
		/*
		 * 2. �ڽ��� ������ �޼ҵ带 �����ϱ�
		 */
//		tv1.text = "ȫ�浿"; 
		//���� �ڽ� Ŭ������ �ʵ忡 ���� �Ұ�
//		tv1.captionTVMethod (); 
		//���� �ڽ� Ŭ������ �޼ҵ忡 ���� �Ұ�
		CaptionTV ct = (CaptionTV) tv1;
		//�ڽ� Ŭ���� Ÿ���� ������ �θ�Ÿ���� ���������� �ִ´�. 
		//�׷���, Ÿ���� ���� �����Ƿ�, ����ȯ�� �����ش�. 
		ct.text = "ȫ�浿";
		ct.captionTVMethod();
		
		//���� �κп� �־, ������� �κп��־�� �������� ��Ӱ� ���̰� ����.
		//�����Ͻ� �����κп��� �������� ������ ���´�. 
		TV tv3 = new CaptionTV();
//		TV tv3 = new TV(); // �����󿡼��� ������ ������, ��Ÿ���Ҷ� �޸𸮿� �ö󰥶� ������ ��
		CaptionTV ct2 = (CaptionTV) tv3;
		ct2.text = "�̼���";
		ct2.captionTVMethod();
		// 71~74 ���� : ������ ����. ��? 71��° �ٿ��� heap���� TV()�� ���⶧���̴�.
		//�׷��Ƿ� 71�� ��� 70�� ó�� new Caption()�� ������Ѵ�.
		
		
		CaptionTV ct3 = new CaptionTV();
		ct3.text = "ȫ�浿";
		ct3.captionTVMethod();
		
		//����Ͽ� ������ �Ͱ� 70~74�� ��������� �ٸ� ���� ����. 
		//������, �������� ����ϴ� ������ ���� �ִ�. 
		//�ʵ��� ������, �Ű������� �������� ���Ѱ��̴�.
		
		
	}
}