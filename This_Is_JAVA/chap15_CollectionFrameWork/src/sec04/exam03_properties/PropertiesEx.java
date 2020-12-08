package sec04.exam03_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws Exception{
		Properties properties = new Properties();
		
		//properties ���� ��ξ��
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		
		//�ѱ� ����
		path = URLDecoder.decode(path, "utf-8"); //���� ó�� �ʿ���
		
		properties.load(new FileReader(path)); //FileReader�� ������ path�� ���� ������ ����.
		//load�� ���� map�� �����. ��, ������ �а�, �������� ���� map�� ����°�!
		
		String driver = properties.getProperty("driver"); //properties���ִ� key ���� ������ value�� ���´�.
		
		System.out.println(driver);
		
		
		
	}
}
