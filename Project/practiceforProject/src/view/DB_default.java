package view;

import java.sql.DriverManager;
import java.sql.SQLException;

//���� ���� �Ϸ� Ȯ��
public class DB_default {
	
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid="system";
		String passwd ="1234";
		
		try {

		     Class.forName(driver);
		     System.out.println("����̺� ���� ������");//2�ܰ�
		     DriverManager.getConnection(url, userid, passwd);
		     System.out.println("����Ŭ ���� ������");//3�ܰ�

		    } catch (ClassNotFoundException e) {

		     System.out.println("����̺� ���� ������");
		     e.printStackTrace();
		    } catch (SQLException e) {

		     System.out.println("����Ŭ ���� ������");

		     e.printStackTrace();

		    }//3�ܰ�

		   }
	
	
}
