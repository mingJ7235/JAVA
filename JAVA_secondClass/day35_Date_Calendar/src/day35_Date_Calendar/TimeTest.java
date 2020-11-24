package day35_Date_Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TimeTest {
	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss.SSS");
		String dOfWeek [] = {"��", "��", "ȭ", "��", "��", "��", "��"};
		//simpledateformat �����ڿ��� ���ϴ� ����� �Ѱ��ָ�ȴ�
		
		
		//�̱������� Calendar�� ��ü�� �ϳ����̴�. 
		//date�� new�� �ȴ�. ���̾ȵȴ�. �׷��� �����̴�. ������ ���� ȸ�翡�� ���⶧���� �˾ƾ��Ѵ�. 
		//�߻��� date���� calendar�� �ٲ�� �߼���
		
		//Calendar Ŭ������ singleton �������� ����� Ŭ������ ��ü�� ����� ����� �� ����.
		//��ü�� ���� ����� �� ���� Ŭ������ ���ο� �ڽ��� Ŭ������ ���� ��ü�� �����ϰ� �ֱ� ������
		//Ŭ���� ���ο� ������ �ִ� �ڽ��� ��ü�� ������ �޼ҵ��(getInstance()) �ڽ��� ��ü��
		//���ͼ� ����Ѵ�. 
		
		//singleton �������� �����ϴ� Ŭ������ ���α׷����� �� 1���� �ʿ��� ��ü��
		//singleton �������� �����Ѵ�. 
		//Calendar�� DAY_OF_WEEK�� �Ͽ��� (1), ������(2),,....,�����(7) �̴�.
		//Calendar���� �����Ǿ� �ִ� �Լ��� ���� ���� ������ 1�� ��������Ѵ�. 
		// => ������ 1���� �����ϰ�(�Ͽ����� 1), ���� 0���� �����Ѵ� (1���� 0)
		System.out.println(d);
		System.out.println(c);
		System.out.println(sdf.format(c.getTime()));
		System.out.println("�� : "+ c.get(Calendar.YEAR));
		//Calendar Ŭ������ ���� �����ؾ��Ѵ� (�̱���)
		System.out.println("�� :" +(c.get(Calendar.MONDAY)+1));
		// ���� 1�� ��������Ѵ�. (27��° �� ����)
		System.out.println("�� : "+c.get(Calendar.DATE));
		System.out.println("�� : " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("���� : "+ c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(dOfWeek[c.get(Calendar.DAY_OF_WEEK)-1] + "����");
		//-1�� ������Ѵ�. �ε����� 0���� �����ϰ�, day of week �� 1���� �����ϴϱ�.
		System.out.println("�� : " + c.get(Calendar.HOUR));
		System.out.println("�� : " + c.get(Calendar.HOUR_OF_DAY)); //24�ð� ����
		System.out.println("�� : " + c.get(Calendar.MINUTE));
		System.out.println("�� : " + c.get(Calendar.SECOND));
		System.out.println("�и��� : " + c.get(Calendar.MILLISECOND));
		
		//Date Ŭ������ 1900���� �������� ��¥�� ó���Ѵ�.
		//���� ��� ������ 1900���� ���ؼ� ���;��ϰ�, �־��ַ��� 1900�� ���� �־�����Ѵ�.
		//���� �������� 1�� ���ؼ� ���;��ϰ�, �־��ַ��� 1�� ���� �־�� �Ѵ�. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �� �� : ");
		int year = sc.nextInt()-1900;
		//�⵵�� 1900�� ������Ѵ�.
		int month = sc. nextInt()-1;
		//���� �Է¹��� ���� 1�� ������Ѵ�. 
		int day = sc.nextInt();
		
		Date date = new Date(year, month, day);
		//date�� ��������� ������ �׾����ִ�. ������ �̹� ȸ�翡�� ���� �����־ �˰���־���Ѵ�.
		//calendar ����� �̷��� ���� �׾��������. new�� ���ٴ°� ��ü�� ���̾ȵǴ� ����
		System.out.println(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E)");
		System.out.println(sdf2.format(date));
		
		
		
		
	}
	
}
