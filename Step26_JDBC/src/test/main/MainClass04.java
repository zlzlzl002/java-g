package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass04 {
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
		
		// 10�� ȸ���� ������ ������ ������.
		int num=3;
		

		// �ʿ��� ��ü�� ���� ���� �����
		// PreparedStatement�� �ѹ� ����� SQL��������Ǳ� ������ �ݺ��ؼ� ����� ��� ������ ���� ����
		PreparedStatement pstmt = null; // !!
		try { // FROM �Ƚᵵ ������?
			String sql="DELETE  member WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("ȸ�� ������ �����߽��ϴ�.");
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
