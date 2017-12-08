package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	private static MemberDao dao;

	private MemberDao() {
	}

	public static MemberDao getInstance() { // getInstance 메소드
		if (dao == null) {
			dao = new MemberDao(); // new 는 오직1번만 가능
		}
		return dao;
	}

	public List<MemberDto> getList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDto> li = new ArrayList<>();
		// 작업이 성공적여부를 담을 변수
		try {
			conn = new DBConnect().getConn();
			String sql = "Select empno,ename,dname,loc from emp e, dept d WHERE e.deptno=d.deptno ORDER BY empno ASC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(empno + "/" + ename + "/" + dname + "/" + loc);
				// MemberDto 객체에 회원정보 담기
				MemberDto dto = new MemberDto(empno, ename, dname, loc);
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

}
