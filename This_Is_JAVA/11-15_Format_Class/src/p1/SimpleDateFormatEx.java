package p1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
	/*Date Ŭ������ toString () �޼ҵ�� �������ε� ��¥�� �����Ѵ�.
	 * ���� Ư�� ���ڿ� �������� ��� �ʹٸ� ajva.text.SimpleDateFormatŬ������ �̿��ϸ� �ȴ�. 
	 * SimpleDateFormat Ŭ������ ��¥�� ���ϴ� �������� ǥ���ϱ� ���� ������ ����Ѵ�.
	 * 
	 * 
	 */
	public static void main(String[] args) {
//		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy�� MM�� dd��");
//		String strDate = sdf.format(new Date());
//		System.out.println(new Date());
//		System.out.println(strDate);
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("������ E����");
		System.out.println(sdf.format(now));
	}
	
	
	
	
}
