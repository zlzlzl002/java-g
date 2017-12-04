package test.main;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 *  member 테이블에 있는 모든 내용을 
		 *  List<MemberDto> 형태로 담아보세요
		 */
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		// MemberDto 객체를 담을 ArrayList 객체 생성
		List<MemberDto> li = new ArrayList<>();
		try {
			String sql= "Select * from member ";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num + "/" + name + "/" + addr);
				// MemberDto 객체에 회원정보 담기
				MemberDto dto = new MemberDto(num,name,addr);
				// ArrayList 객체에 MemberDto 담기
				li.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}// try
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
