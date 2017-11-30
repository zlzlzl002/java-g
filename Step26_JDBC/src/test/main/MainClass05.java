package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

/*
 *  MainClass01 ����
 *  ��Ŭ������ DB �����ϱ�
 */
public class MainClass05 {
	public static void main(String[] args) {
		// Connection ��ü�� ������ ������  DBConnect �����ؼ� getConnȣ��
		Connection conn = new DBConnect().getConn();
		
		// �ʿ��� ��ü�� ���� ���� �����
		// PreparedStatement�� �ѹ� ����� SQL��������Ǳ� ������ �ݺ��ؼ� ����� ��� ������ ���� ����
		PreparedStatement pstmt = null; // !!
		ResultSet rs = null; // !!
		try {
			// ������ sql �� �غ�
			String sql = "SELECT  num, name, addr FROM member";
			// PreparedStatement ��ü�� ������ ������
			// (sql ���� ��� �������� ��ü)
			pstmt = conn.prepareStatement(sql);
			// ResultSet ��ü�� ������ ������
			// (SELECT ���� Query �����Ѵ� ��� ���� ������ �ִ� ��ü)
			rs = pstmt.executeQuery();
			while (rs.next()) { // !! true�ݺ������� false�� ���ö����� ��� �ݺ��Ѵ�.
				// ���� cursor �� ��ġ�� ����
				// row ���� ���ϴ� Į���� �����͸� ���´�.
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num + "/" + name + "/" + addr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		} // tyy
	}
}
