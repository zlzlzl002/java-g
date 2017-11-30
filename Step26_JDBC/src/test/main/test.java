package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class test {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto(16, "���¾߱���ȣ�̴��", "���ϵ�");
		//dto.getAddr();
		//dto.getName();
		//dto.getNum();

		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO member(num, name, addr) " + "VALUES(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getNum());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddr());
			pstmt.executeQuery();
			System.out.println("ȸ�� ���� ������");
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
