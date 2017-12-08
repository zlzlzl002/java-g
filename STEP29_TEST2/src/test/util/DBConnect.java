package test.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 *  Oracle DB �����ؼ� Connection ��ü�� �������ִ�
 *  �޼ҵ带 �����ϴ� Ŭ���� �����ϱ�
 */
public class DBConnect {
	// �ɹ��ʵ�
	private Connection conn;

	// �����ڿ��� Connection ��ü�� ���ͼ� �ɹ��ʵ忡 ����ǵ����Ѵ�.
	public DBConnect() {
		try {
			// ����Ŭ ����̹� �ε��ϱ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ������ oracle DB url ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// Connection ��ü�� ������ ������
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB ���� ����!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �ɹ��ʵ忡 ����� Connection ��ü�� �������� �������ִ� �޼ҵ�
	public Connection getConn() {
		return conn;
	}
}
