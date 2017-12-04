package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
 * Connection ��ü ������
 * preparedSt
 */
public class MainClass01 {
	public static void main(String[] args) {
		// �ʿ��� ��ü�� ���� ���� ����� 
		Connection conn = null; // !!JAVA ���� ����Ŭ�� �����Ϸ��� Connection 
		try {
			// ����Ŭ ����̹� �ε��ϱ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ������ oracle DB url ����     �ּ�:��Ʈ:�����ͺ��̽���                  �����ͺ��̽��̸�:xe
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// JAVA ���� ����Ŭ�� �����Ϸ��� Connection ��ü�� ������ ������
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB ���� ����!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// �ʿ��� ��ü�� ���� ���� �����
		// PreparedStatement�� �ѹ� ����� SQL��������Ǳ� ������ �ݺ��ؼ� ����� ��� ������ ���� ����
		PreparedStatement pstmt=null; // !!
		ResultSet rs =null; // !!
		try {	
			// ������ sql �� �غ�   ORDER BY num asc�� num ���� ������ ���� �ȴ�.
			String sql="SELECT * FROM member ORDER BY num asc";
			// PreparedStatement ��ü�� ������ ������
			// (sql ���� ��� �������� ��ü)
			pstmt=conn.prepareStatement(sql);
			// ResultSet ��ü�� ������ ������
			// !!(SELECT ���� Query �����Ѵ� ��� ���� ������ �ִ� ��ü)
			rs=pstmt.executeQuery();
			while(rs.next()) { // !! true�ݺ�������  false�� ���ö����� ��� �ݺ��Ѵ�.
				// ���� cursor �� ��ġ�� ����
				// row ���� ���ϴ� Į���� �����͸� ���´�.
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				System.out.println(num+"/"+name+"/"+addr);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		} // tyy
	}
}
