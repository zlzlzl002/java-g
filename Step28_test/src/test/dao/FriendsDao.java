package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.xml.bind.util.ValidationEventCollector;

import test.dto.FriendsDto;
import test.util.DBConnect;

public class FriendsDao {
	// 1. 자신의 참조값을 담을 private static 필드 만들기
	private static FriendsDao dao;

	// 2. 외부에서 객체 생성할수 없도록 생성자의 접근 지정자를
	// private 로 지정
	private FriendsDao() {
	} // new MemberDao(); 할수 없다.
	// new 할수 없다.
	// 3. 자신의 참조값을 리턴해주는 static 맴버 메소드 만들기

	public static FriendsDao getInstance() { // getInstance 메소드
		if (dao == null) {
			dao = new FriendsDao(); // new 는 오직1번만 가능
		}
		return dao;
	}										

	// DB 에 회원정보를 저장하는 메소드
	public boolean insert(FriendsDto dto) {
		Connection conn = null; // Connection 최대크기 20개
		PreparedStatement pstmt = null;
		// 작업이 성공적여부를 담을 변수
		boolean isSuccess = false;
		try {
			conn = new DBConnect().getConn();
			// 실행할 sql 문
			String sql = "INSERT INTO friends(num,name,phone,regdate) "
					+ " values(friends_seq.NEXTVAL,?,?,"
					+ " TO_CHAR(SYSDATE, 'YY\"년\"MM\"월\"DD\"일\"'))";
			
			pstmt = conn.prepareStatement(sql);
			// 물음표 2개 값 NAME ADDR만정의
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
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
			String sql = "Delete FROM friends WHERE num=?";
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
	public boolean update(FriendsDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 작업이 성공적여부를 담을 변수
		boolean isSuccess = false;
		try {
			conn = new DBConnect().getConn();
			// 실행할 sql 문
			String sql = "UPDATE friends SET name=?,phone=?,regdate=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getRegdate());
			pstmt.setInt(4, dto.getNum());
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
	public List<FriendsDto> getList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FriendsDto> li = new ArrayList<>();
		// 작업이 성공적여부를 담을 변수
		try {
			conn = new DBConnect().getConn();
			String sql = "Select * from friends " + "ORDER BY num DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String regdate = rs.getString("regdate");
				System.out.println(num + "/" + name + "/" + phone + "/" + regdate);

				// MemberDto 객체에 회원정보 담기
				FriendsDto dto = new FriendsDto(num, name, phone, regdate);
				// ArrayList 객체에 MemberDto 담기
				li.add(dto);

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
		} // try
		return li;
	}

	// 인자로 전달되는 번호에 해당하는 회원정보를 리턴해주는 메소드
	public FriendsDto getDate(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// MemberDto 객체의 참조값을 담을 변수 만들기
		FriendsDto dto = null;
		try {
			conn = new DBConnect().getConn();
			// num 리턴해주기때문에 Select 할때 num 안써도됨
			String sql = "Select name,phone,regdate from friends WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			// row 한개 이기때문에 if
			if (rs.next()) {// 커서를 한칸 내려서
				// 커서가 위치한 곳에서 회원 정보를 얻어온다.
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String regdate = rs.getString("regdate");

				dto = new FriendsDto(num, name, phone, regdate);

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
		} // try
		return dto;
	}

}
