package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.xml.bind.util.ValidationEventCollector;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 *  Dao => Date Access Object 의 약자
 *  
 *  - 회원 정보에  대해서 SELECT, INSERT, UPDATE, DELETE 
 *    작업을 수생할 객체를 생성하기위한 클래스 설계하기
 *    
 *  - Application 전역에서 MemberDao 객체는 오직 1개만  
 *    생성될수 있도록 설계한다.
 *    
 *    private class 안에서만		
 */
public class MemberDao {
	// 1. 자신의 참조값을 담을 private static 필드 만들기
	private static MemberDao dao;

	// 2. 외부에서 객체 생성할수 없도록 생성자의 접근 지정자를
	// private 로 지정
	private MemberDao() {
	} // new 할수 없다.
		// 3. 자신의 참조값을 리턴해주는 static 맴버 메소드 만들기

	public static MemberDao getInstance() { // class명.
		if (dao == null) {
			dao = new MemberDao(); // new 는 오직1번만 가능
		}
		return dao;
	}

	// DB 에 회원정보를 저장하는 메소드
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 작업이 성공적여부를 담을 변수
		boolean isSuccess = false;
		try {
			conn = new DBConnect().getConn();
			// 실행할 sql 문
			String sql = "INSERT INTO member(num,name,addr) " 
					+ "VALUES(member_seq.NEXTVAL,?,?)";
			pstmt = conn.prepareStatement(sql);
			// 물음표 2개 값  NAME ADDR만정의
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// sql 문 수행하고 추가된 row 의 갯수 얻어오기
			int flag = pstmt.executeUpdate(); // int 리턴
			if (flag > 0) { // 작업 성공이면 0보다 크면 isSuccess true 바꿔준다.
				isSuccess = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}

		return isSuccess;
	}

	// DB 에 회원정보를 삭제하는 메소드
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 작업이 성공적여부를 담을 변수
		boolean isSuccess = false;
		try {
			conn = new DBConnect().getConn();
			// 실행할 sql 문
			String sql = "Delete FROM member WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			// sql 문 수행하고 추가된 row 의 갯수 얻어오기
			int flag = pstmt.executeUpdate(); // int 리턴
			if (flag > 0) { // 작업 성공이면 0보다 크면 isSuccess true 바꿔준다.
				isSuccess = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}

		return isSuccess;
	}

	// DB 에 회원정보를 수정하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 작업이 성공적여부를 담을 변수
		boolean isSuccess = false;
		try {
			conn = new DBConnect().getConn();
			// 실행할 sql 문
			String sql = "UPDATE member SET name=?,addr=?" + "WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			// sql 문 수행하고 추가된 row 의 갯수 얻어오기
			int flag = pstmt.executeUpdate(); // int 리턴
			if (flag > 0) { // 작업 성공이면 0보다 크면 isSuccess true 바꿔준다.
				isSuccess = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}

		return isSuccess;
	}

	// DB 에 회원 목록을 리턴해주는 메소드
	public List<MemberDto> getList() { 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		List<MemberDto> li = new ArrayList<>();
		// 작업이 성공적여부를 담을 변수
		try {
			conn= new DBConnect().getConn();
			String sql= "Select * from member " 
					+ "ORDER BY num DESC";
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
		return li;
	}
	// 인자로 전달되는 번호에 해당하는 회원정보를 리턴해주는 메소드
	public MemberDto getDate(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		// MemberDto 객체의 참조값을 담을 변수 만들기
		MemberDto dto = null;
		try {
			conn= new DBConnect().getConn();
			// num 리턴해주기때문에 Select 할때 num 안써도됨
			String sql= "Select name,addr from member" + "num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			// row 한개 이기때문에 if           
			if(rs.next()) {// 커서를 한칸 내려서 
				// 커서가 위치한 곳에서 회원 정보를 얻어온다.
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				dto = new MemberDto(num,name,addr);
				//dto.setNum(num);
				//dto.setName(name);
				//dto.setAddr(addr);
				
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
		return dto;
	}

	
}
