package Q13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateprintEx {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		System.out.println(sdf.format(now));
	}
}
