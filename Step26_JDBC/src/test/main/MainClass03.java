package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass03 {
	public static void main(String[] args) {
		// �ʿ��� ��ü�� ���� ���� �����
		Connection conn = null; // !!JAVA ���� ����Ŭ�� �����Ϸ��� Connection
		try {
			// ����Ŭ ����̹� �ε��ϱ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ������ oracle DB url ���� �����ͺ��̽��̸�:xe
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// JAVA ���� ����Ŭ�� �����Ϸ��� Connection ��ü�� ������ ������
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB ���� ����!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 2�� ȸ���� ������ ������ ������.
		int num=2;
		String addr="�뷮��";
		

		// �ʿ��� ��ü�� ���� ���� �����
		// PreparedStatement�� �ѹ� ����� SQL��������Ǳ� ������ �ݺ��ؼ� ����� ��� ������ ���� ����
		PreparedStatement pstmt = null; // !!
		try {
			String sql="UPDATE member SET addr=? WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.setInt(2, num);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		} // tyy
	}
}
