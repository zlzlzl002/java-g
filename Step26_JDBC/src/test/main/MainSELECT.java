package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

/*
 *  MainClass01 복사
 *  이클립스와 DB 연동하기
 */
public class MainSELECT {
	public static void main(String[] args) {
		// Connection 객체의 참조값 얻어오기 DBConnect 생성해서 getConn호출
		Connection conn = new DBConnect().getConn();

		// 필요한 객체를 담을 변수 만들기
		// PreparedStatement는 한번 사용한 SQL문이저장되기 때문에 반복해서 사용할 경우 성능이 좋기 때문
		PreparedStatement pstmt = null; // !!
		ResultSet rs = null; // !!
		try {
			// 실행할 sql 문 준비
			String sql ="SELECT ename, sal FROM emp WHERE sal >= (SELECT sal FROM emp WHERE ename='ALLEN')";
			// PreparedStatement 객체의 참조값 얻어오기
			// (sql 문을 대신 수행해줄 객체)
			pstmt = conn.prepareStatement(sql);
			// ResultSet 객체의 참조값 얻어오기
			// (SELECT 문을 Query 수행한다 결과 값을 가지고 있는 객체)
			rs = pstmt.executeQuery();
			while (rs.next()) { // !! true반복문실행 false가 나올때까지 계속 반복한다.
				// 현재 cursor 가 위치한 곳의
				// row 에서 원하는 칼럼의 데이터를 얻어온다.
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
