package p5_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date now = new Date ();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		System.out.println(now);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf1.format(now);
		System.out.println(strNow2);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEE���� MMM d, ''yy"); 
		String strNow3 = sdf2.format(now);
		System.out.println(strNow3);
		
		//365���߿��� ������ ����°?
		SimpleDateFormat todaycnt = new SimpleDateFormat("365���߿��� ������ D��° �Դϴ�.");
		String strNow4 = todaycnt.format(now);
		System.out.println(strNow4);
	}
}
