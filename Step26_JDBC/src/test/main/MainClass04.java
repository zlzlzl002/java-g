package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass04 {
	public static void main(String[] args) {
		// 필요한 객체를 담을 변수 만들기
		Connection conn = null; // !!JAVA 에서 오라클에 연동하려면 Connection
		try {
			// 오라클 드라이버 로딩하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 oracle DB url 정보 데이터베이스이름:xe
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// JAVA 에서 오라클에 연동하려면 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 10번 회원의 정보를 삭제해 보세요.
		int num=3;
		

		// 필요한 객체를 담을 변수 만들기
		// PreparedStatement는 한번 사용한 SQL문이저장되기 때문에 반복해서 사용할 경우 성능이 좋기 때문
		PreparedStatement pstmt = null; // !!
		try { // FROM 안써도 동작함?
			String sql="DELETE  member WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정했습니다.");
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
