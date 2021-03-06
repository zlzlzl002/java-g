package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
 * Connection 객체 얻어오고
 * preparedSt
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 필요한 객체를 담을 변수 만들기 
		Connection conn = null; // !!JAVA 에서 오라클에 연동하려면 Connection 
		try {
			// 오라클 드라이버 로딩하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 oracle DB url 정보     주소:포트:데이터베이스명                  데이터베이스이름:xe
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// JAVA 에서 오라클에 연동하려면 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 필요한 객체를 담을 변수 만들기
		// PreparedStatement는 한번 사용한 SQL문이저장되기 때문에 반복해서 사용할 경우 성능이 좋기 때문
		PreparedStatement pstmt=null; // !!
		ResultSet rs =null; // !!
		try {	
			// 실행할 sql 문 준비   ORDER BY num asc는 num 으로 순서가 정의 된다.
			String sql="SELECT * FROM member ORDER BY num asc";
			// PreparedStatement 객체의 참조값 얻어오기
			// (sql 문을 대신 수행해줄 객체)
			pstmt=conn.prepareStatement(sql);
			// ResultSet 객체의 참조값 얻어오기
			// !!(SELECT 문을 Query 수행한다 결과 값을 가지고 있는 객체)
			rs=pstmt.executeQuery();
			while(rs.next()) { // !! true반복문실행  false가 나올때까지 계속 반복한다.
				// 현재 cursor 가 위치한 곳의
				// row 에서 원하는 칼럼의 데이터를 얻어온다.
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
