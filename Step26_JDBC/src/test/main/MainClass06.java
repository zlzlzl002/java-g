package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  ��ȣ : 20
		 *  �̸�: ������
		 *  �ּ�: ����
		 *  
		 *  ���� ������ MemberDto ��ü�� ���� ���� 
		 *  MemberDto ��ü�� ��� ������ �����ؼ� 
		 *  �ش� ������ DB �� ������ ������.
		 */
		MemberDto dto = new MemberDto();
		dto.setNum(20);
		dto.setName("������");
		dto.setAddr("����");
		
		//Connection ��ü�� ������ ������
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
			System.out.println("ȸ�� ���� ������");
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
