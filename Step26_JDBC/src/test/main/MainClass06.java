package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  번호 : 20
		 *  이름: 누구게
		 *  주소: 어디게
		 *  
		 *  위의 정보를 MemberDto 객체에 담은 다음 
		 *  MemberDto 객체가 담긴 변수를 참조해서 
		 *  해당 정보를 DB 에 저장해 보세요.
		 */
		MemberDto dto = new MemberDto();
		dto.setNum(20);
		dto.setName("누구게");
		dto.setAddr("어디게");
		
		//Connection 객체의 참조값 얻어오기
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt =null;
		try {
			String sql="INSERT INTO member(num, name, addr) "
					+ "VALUES(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getNum());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddr());
			pstmt.executeQuery();
			System.out.println("회원 정보 저장중");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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
