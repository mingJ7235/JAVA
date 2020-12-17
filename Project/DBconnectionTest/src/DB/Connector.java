package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Connector {
//	public static void main(String[] args) {
//		createTable();
//		createCustomer("Danny","01064707235","Male","24","Random");
//		ArrayList <String> list = getCustomers();
//		for (String item : list) {
//			System.out.println(item);
//		}
//		createCustomer("David","01012342412","Female","24","Important Customer");
//	}
//	
//	public static ArrayList<String> getCustomers ( ) {
//		//�����͸� list�� return���Ѽ� �ҷ���
//		try {
//			Connection con  = getConnection();
//			PreparedStatement statement = con.prepareStatement("Select name, phone, gender FROM customer");
//			ResultSet results = statement.executeQuery();
//			ArrayList<String> list = new ArrayList <String> ();
//			while (results.next()) { //�����Ͱ� ���������� whlie ���������� list�� ����
//				list.add("Name : " + results.getString("name") + 
//						"Phone :" + results.getString("phone") + 
//						"Gender : " + results.getString("gender"));
//				
//			}
//			System.out.println("The data has been fetched");
//			return list;
//		}catch (Exception e) {
//			return null;
//		}
//	}
	
	public static String [][] getCustomers ( ) {
		//�����͸� list�� return���Ѽ� �ҷ���
		try {
			Connection con  = getConnection();
			PreparedStatement statement = con.prepareStatement("Select name, phone, gender FROM customer");
			ResultSet results = statement.executeQuery();
			ArrayList<String []> list = new ArrayList <String[]> ();
			while (results.next()) { //�����Ͱ� ���������� whlie ���������� list�� ����
				list.add (new String [] {
						results.getString("name"),
						results.getString("phone"),
						results.getString("gender")
						
				});
			}
			System.out.println("The data has been fetched");
			String [][] arr = new String [list.size()][3];
			return list.toArray(arr);
		}catch (Exception e) {
			return null;
		}
	}
	
	public static void createCustomer (String name, String phone, String gender,
			String age, String note) {
		try {
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO customer"
					+ "(name, phone, gender, age, note)"
					+ "VALUE "
					+ "('" +name + "','" + phone +"','" + gender+ "','" + age+"','" + note +"')");
			//('name','phone','gender','age','note')
			insert.executeUpdate();
			System.out.println("The data has been saved!");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//����� ��ư�� �ֱ�. 
	}
	
	public static void createTable () {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS "
					+ "customer (id int NOT NULL AUTO_INCREMENT,"
					+ "name varChar(255),"
					+ "phone varChar(255),"
					+ "gender varChar(255),"
					+ "age varChar(255),"
					+ "note varChar(255),"
					+ "PRIMARY KEY (id))");
			//sql���� �� table�� ������ ��� ����ϴ� ����
			createTable.execute();
			System.out.println("Table successfully created");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Table successfully created");
		}
	}
	//DB�� �������ִ� Ŀ���� �޼ҵ� �̰� Ȱ���ؼ� Ŀ��Ʈ��
	public static Connection getConnection () {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/customer?serverTimezone=UTC";
			String user = "root";
			String pw = "4tkfkdwlrl@";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("The connection Successful!");
			return con;
		}catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}
}
