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
		 *  member ���̺� �ִ� ��� ������ 
		 *  List<MemberDto> ���·� ��ƺ�����
		 */
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		// MemberDto ��ü�� ���� ArrayList ��ü ����
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
				// MemberDto ��ü�� ȸ������ ���
				MemberDto dto = new MemberDto(num,name,addr);
				// ArrayList ��ü�� MemberDto ���
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
		
		System.out.println("���� �޼ҵ尡 ���� �˴ϴ�.");
	}
}
