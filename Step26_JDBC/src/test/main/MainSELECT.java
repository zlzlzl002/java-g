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
public class MainSELECT {
	public static void main(String[] args) {
		// Connection ��ü�� ������ ������ DBConnect �����ؼ� getConnȣ��
		Connection conn = new DBConnect().getConn();

		// �ʿ��� ��ü�� ���� ���� �����
		// PreparedStatement�� �ѹ� ����� SQL��������Ǳ� ������ �ݺ��ؼ� ����� ��� ������ ���� ����
		PreparedStatement pstmt = null; // !!
		ResultSet rs = null; // !!
		try {
			// ������ sql �� �غ�
			String sql ="SELECT ename, sal FROM emp WHERE sal >= (SELECT sal FROM emp WHERE ename='ALLEN')";
			// PreparedStatement ��ü�� ������ ������
			// (sql ���� ��� �������� ��ü)
			pstmt = conn.prepareStatement(sql);
			// ResultSet ��ü�� ������ ������
			// (SELECT ���� Query �����Ѵ� ��� ���� ������ �ִ� ��ü)
			rs = pstmt.executeQuery();
			while (rs.next()) { // !! true�ݺ������� false�� ���ö����� ��� �ݺ��Ѵ�.
				// ���� cursor �� ��ġ�� ����
				// row ���� ���ϴ� Į���� �����͸� ���´�.
				int sal = rs.getInt("sal");
				String ename = rs.getString("ename");
				System.out.println(sal + "/" + ename);
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
