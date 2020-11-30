package p2_StringClass;

import java.io.UnsupportedEncodingException;

public class UnsupportedEncodingEx {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ����.";
		//�⺻���ڼ�
		//2���� �迭�� �ٲ۰��� �ý��� ���Ϸ� ����ų� ��Ʈ��ũ�� ���� �� �����
		int i = str.indexOf("��");
		//indexOf() �޼ҵ�� �Ű������� ���ڰ� ���ڿ��� �ִ��� �Ǵ��Ͽ� ������ �ش� ���ڿ��� �ε�����ȣ�� �����Ѵ�.
		//���ڰ� �ߺ��� ���� ���� ���� index�� �����Ѵ�. 
		//�ش��ϴ� ���ڰ� ������ -1�� �����Ѵ�.
		System.out.println(i);
		
		byte [] bytes1 = str.getBytes();//���ڵ� 10���� --> 2���� byte[]
		System.out.println(bytes1.length);
		for (byte b : bytes1) {
			System.out.print(b+ " ");
		}
		String str1 = new String(bytes1);//2���� �迭 --> 10����
		System.out.println("\n" +str1);
		
		//�ѱ� �ϼ������� ���ڵ� ���ڵ�
		
		try {
			byte [] bytes2 = str.getBytes("UTF-8");
			System.out.println(bytes2.length);
			for (byte b : bytes2) {
				System.out.print(b+ " ");
			}
			String str2 = new String(bytes2, "UTF-8");//2���� �迭 --> 10����
			System.out.println("\n" +str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String rstr = str.replace('��', '��');
		//�� -> �� ���� ������. ���ڸ� �����ϴ� ����
		System.out.println(rstr);
	
		String rstra = str.replaceAll("�ȳ�", "�������");
		//String���� �ް�, ������ ex) �ȳ��ϼ��� -> �����ϼ���
		System.out.println(rstra);
		
		String subs = str.substring(3);
		//�ش��ϴ� �ε�������(����) �������� �����
		System.out.println(subs);
		
		String subs2 = str.substring(0, 2);
		//�ι�° �Ű������� ���Ե��� �ʴ´�. �� 0,1 �� �ε��������� ��µ�
		//substring(0,2) �̸�, 0~1�� �ε����� ���� ��µ�
		System.out.println(subs2);
		
		//trim �޼ҵ�� ���ظ��� ������ ��
		
		String strr = "          ��� ����            ";
		System.out.println(strr.length());
		
		int ii = 10;
		double dd =10.24;
		
		
		String sii = String.valueOf(ii); // ��Ʈ�� 10 �� ������ "10"�� �Ȱ���
		String sdd = String.valueOf(dd); //������ 10.24�� ������ 10.24�� �Ȱ���
		
		System.out.println(ii + dd); //���ڴϱ� ����
		System.out.println(sii + sdd); //���ڴϱ� ���� 
		
		//� �ڷ�� ���ڿ��� ���ļ� ó���ϰ������ valueOf �޼ҵ� ����� ��¼��;
		
		Car c = new Car ();
		String sc= String.valueOf(c); //�̰͵� �԰��� ��? api�� �Ű������� Object obj �� �ֱ� ������
		System.out.println(sc);
		
	}
}

class Car {
	
}
