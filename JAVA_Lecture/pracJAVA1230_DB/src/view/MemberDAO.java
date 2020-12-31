package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//������ ���̽� �����ϴ� Ŭ����
public class MemberDAO {
	//1. ����Ŭ �����ͺ��̽� ������ ���� 4���� ������ ���ڿ��� ����
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String userid="system";
	String passwd= "1234";
	
	public MemberDAO() {
		try {
			//2.����̹� �ε� OracleDriver Ŭ������ �ڹٿ��� �̿��ϱ����� JVM�� �÷���
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end ������
	
	//ȸ�� ���� ���� insert() - ������ ���̽� ������ ���ο� �ڷ� �ֱ�
	public void insert(String name, String age, String weight, String height, String sex) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			//query�� �ۼ�
			String sql = "INSERT INTO member VALUES(?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			//? �ȿ� ���� ������ �ֱ�
			pstmt.setString(1, name); //1�� ����ǥ�� name(insert()�� �Ű�����)�� �־��ּ� �̶�� �ǹ���
			pstmt.setInt(2, Integer.parseInt(age)); //�����ͺ��̽��� �������� intŸ������ �־���ϹǷ� ! 
			pstmt.setInt(3, Integer.parseInt(weight));
			pstmt.setInt(4, Integer.parseInt(height));
			pstmt.setString(5, sex);
			
			int n = pstmt.executeUpdate(); //n���� �����ϴ�. ��� ����
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if( pstmt!=null  )
				try {
					pstmt.close ();
					if (con!= null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
	}

	
	//������ư ���
	public void delete(String name) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "DELETE FROM member WHERE name=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name); //ù��° ����ǥ�� name�� �־�� ��� �ǹ���
			
			int n = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(pstmt!=null) pstmt.close();
					if(con!=null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	
	//ȸ�� ���� ���� (select)
	public ArrayList<MemberDTO> select () {
		ArrayList list = new ArrayList<MemberDTO>();
		Connection con = null;
		PreparedStatement pstmt = null; //���������� insert into member values (? ,? ,? ,?, ?); �� ���� ����ǥ�ΰ�� ���
		ResultSet rs = null; //��ȸ�� ����� �������� ����
		
		//3.Connection �α�
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			//4. sql�� �ۼ�.sql���� �� �� ���� 
			String query = "SELECT * FROM member";
			//5. preparedStatement ����. ��û�� sql���� ��� ���� statement����
			pstmt = con.prepareStatement(query);
			
			//6.sql�� ���� ->ResultSet���� ���. ������� ��� sql���� �����ϰ� �����ϴ� Ŭ������.
				//��, ���� �� �� DB���� sql���� ����ǰ� �� ����� rs�� �����
			rs = pstmt.executeQuery();
			
			while (rs.next() ) {
				MemberDTO dto = new MemberDTO ();
													
				dto.setName(rs.getString(1));
												//DB�� �÷� �ε����� �ִ°ų� �÷����̺�(���̺� column�� �̸������൵��) ������ column label�� ��
				dto.setAge(rs.getInt(2));
				dto.setWeight(rs.getInt(3));
				dto.setHeight(rs.getInt(4));
				dto.setSex(rs.getString(5).charAt(0));
				list.add(dto); //�÷����� ����Ʈ���� �����ͺ��̽��� ���ڵ带 �����ͼ� ��� �־���
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//7. �ڿ� �ݳ�
			try {
				if(rs != null) rs.close();
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}//end select
	
	
	
	
	
}
