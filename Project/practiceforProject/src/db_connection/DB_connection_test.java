package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DB_connection_test {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String userid="system";
	String passwd= "1234";
	
	
	public DB_connection_test() {
		try {
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
	
	
	//������ư ��� (primary key�� ��ġ�� ���Ѵ�)
	public void update (String name, String age, String weight, String height, String sex) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con= DriverManager.getConnection(url, userid, passwd);
			//name�� primary key�̹Ƿ� �װ����� �����Ͽ� where���� �� ���̴�.
			String sql = "UPDATE member SET age=?,weight=?,height=?,sex=? WHERE name =?"; 
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, Integer.parseInt(age));
			pstmt.setInt(2, Integer.parseInt(weight));
			pstmt.setInt(3, Integer.parseInt(height));
			pstmt.setString(4, sex);
			pstmt.setString(5, name);
			
			int n = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//�˻���ư ��� (MemberDTO�� �����Ѵ� -> row�� �˻��ϰ��ϴ°���)
	//1. ȭ�鿡 �ִ� �̸��� select DB�� ������
	//2. DB�� �ִ� ���� �����ٰ� ȭ�鿡 �����ֱ�
	//3. tfName tfAge TextField�ȿ� �����ֱ�
	
//	public MemberDTO search(String name) throws RecordNotFoundException {
//		
//		if(!isExist(name)) throw new RecordNotFoundException(name + "�� ��ϵ� ȸ���� �ƴմϴ�.");
//		
//		MemberDTO dto = new MemberDTO();
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null; //����� ���� (select���� ���Ƿ�!!)
//		
//		try {
//			con = DriverManager.getConnection(url, userid, passwd);
//			String sql = "SELECT * FROM member WHERE name=?";
//			pstmt=con.prepareStatement(sql);
//			pstmt.setString(1, name);
//			rs = pstmt.executeQuery(); //select���ΰ��� �̰ɷ��ؾ���
//			
//			//�� �ٷ� ���� �����͸� token���� ���´�.
//			while (rs.next()) {
//				//DB���� �����ͼ� MemberDTO�� ���� �̰��� �ٽ� gui�� ��������
//				dto.setName(rs.getString(1));
//				dto.setAge(rs.getInt(2));
//				dto.setWeight(rs.getInt(3));
//				dto.setHeight(rs.getInt(4));
//				//sex�� char Ÿ���̹Ƿ� 
//				dto.setSex(rs.getString(5).charAt(0));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs!=null) rs.close();
//				if(pstmt!=null) pstmt.close();
//				if(con!=null) con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
//		return dto;
//	}//end search()
	//ȸ�� ���� ���� (select)
//	public ArrayList<MemberDTO> select () {
//		ArrayList list = new ArrayList<MemberDTO>();
//		Connection con = null;
//		PreparedStatement pstmt = null; //���������� insert into member values (? ,? ,? ,?, ?); �� ���� ����ǥ�ΰ�� ���
//		ResultSet rs = null; //��ȸ�� ����� �������� ����
//		
//		//3.Connection �α�
//		try {
//			con = DriverManager.getConnection(url, userid, passwd);
//			//4. sql�� �ۼ�.sql���� �� �� ���� 
//			String query = "SELECT * FROM member";
//			//5. preparedStatement ����. ��û�� sql���� ��� ���� statement����
//			pstmt = con.prepareStatement(query);
//			
//			//6.sql�� ���� ->ResultSet���� ���. ������� ��� sql���� �����ϰ� �����ϴ� Ŭ������.
//				//��, ���� �� �� DB���� sql���� ����ǰ� �� ����� rs�� �����
//			rs = pstmt.executeQuery();
//			
//			while (rs.next() ) {
//				MemberDTO dto = new MemberDTO ();
//													
//				dto.setName(rs.getString(1));
//												//DB�� �÷� �ε����� �ִ°ų� �÷����̺�(���̺� column�� �̸������൵��) ������ column label�� ��
//				dto.setAge(rs.getInt(2));
//				dto.setWeight(rs.getInt(3));
//				dto.setHeight(rs.getInt(4));
//				dto.setSex(rs.getString(5).charAt(0));
//				list.add(dto); //�÷����� ����Ʈ���� �����ͺ��̽��� ���ڵ带 �����ͼ� ��� �־���
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			//7. �ڿ� �ݳ�
//			try {
//				if(rs != null) rs.close();
//				if( pstmt != null) pstmt.close();
//				if( con != null) con.close();
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return list;
//	}//end select
	
	public boolean isExist_phone(String phone) {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "SELECT * FROM kakao_member WHERE phone=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phone);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				result = true;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close ();
				if(pstmt!=null) pstmt.close();
				if(con!= null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}//end isExist()

	public boolean isExist_pw(String pw) {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "SELECT * FROM kakao_member WHERE password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pw);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				result = true;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close ();
				if(pstmt!=null) pstmt.close();
				if(con!= null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;	
	}//end isExist()
	
	
}
