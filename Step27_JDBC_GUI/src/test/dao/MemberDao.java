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
 *  Dao => Date Access Object �� ����
 *  
 *  - ȸ�� ������  ���ؼ� SELECT, INSERT, UPDATE, DELETE 
 *    �۾��� ������ ��ü�� �����ϱ����� Ŭ���� �����ϱ�
 *    
 *  - Application �������� MemberDao ��ü�� ���� 1����  
 *    �����ɼ� �ֵ��� �����Ѵ�.
 *    
 *    private class �ȿ�����		
 */
public class MemberDao {
	// 1. �ڽ��� �������� ���� private static �ʵ� �����
	private static MemberDao dao;

	// 2. �ܺο��� ��ü �����Ҽ� ������ �������� ���� �����ڸ�
	// private �� ����
	private MemberDao() {
	} // new �Ҽ� ����.
		// 3. �ڽ��� �������� �������ִ� static �ɹ� �޼ҵ� �����

	public static MemberDao getInstance() { // class��.
		if (dao == null) {
			dao = new MemberDao(); // new �� ����1���� ����
		}
		return dao;
	}

	// DB �� ȸ�������� �����ϴ� �޼ҵ�
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// �۾��� ���������θ� ���� ����
		boolean isSuccess = false;
		try {
			conn = new DBConnect().getConn();
			// ������ sql ��
			String sql = "INSERT INTO member(num,name,addr) " 
					+ "VALUES(member_seq.NEXTVAL,?,?)";
			pstmt = conn.prepareStatement(sql);
			// ����ǥ 2�� ��  NAME ADDR������
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// sql �� �����ϰ� �߰��� row �� ���� ������
			int flag = pstmt.executeUpdate(); // int ����
			if (flag > 0) { // �۾� �����̸� 0���� ũ�� isSuccess true �ٲ��ش�.
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

	// DB �� ȸ�������� �����ϴ� �޼ҵ�
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// �۾��� ���������θ� ���� ����
		boolean isSuccess = false;
		try {
			conn = new DBConnect().getConn();
			// ������ sql ��
			String sql = "Delete FROM member WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			// sql �� �����ϰ� �߰��� row �� ���� ������
			int flag = pstmt.executeUpdate(); // int ����
			if (flag > 0) { // �۾� �����̸� 0���� ũ�� isSuccess true �ٲ��ش�.
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

	// DB �� ȸ�������� �����ϴ� �޼ҵ�
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// �۾��� ���������θ� ���� ����
		boolean isSuccess = false;
		try {
			conn = new DBConnect().getConn();
			// ������ sql ��
			String sql = "UPDATE member SET name=?,addr=?" + "WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			// sql �� �����ϰ� �߰��� row �� ���� ������
			int flag = pstmt.executeUpdate(); // int ����
			if (flag > 0) { // �۾� �����̸� 0���� ũ�� isSuccess true �ٲ��ش�.
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

	// DB �� ȸ�� ����� �������ִ� �޼ҵ�
	public List<MemberDto> getList() { 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		List<MemberDto> li = new ArrayList<>();
		// �۾��� ���������θ� ���� ����
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
		return li;
	}
	// ���ڷ� ���޵Ǵ� ��ȣ�� �ش��ϴ� ȸ�������� �������ִ� �޼ҵ�
	public MemberDto getDate(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		// MemberDto ��ü�� �������� ���� ���� �����
		MemberDto dto = null;
		try {
			conn= new DBConnect().getConn();
			// num �������ֱ⶧���� Select �Ҷ� num �Ƚᵵ��
			String sql= "Select name,addr from member" + "num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			// row �Ѱ� �̱⶧���� if           
			if(rs.next()) {// Ŀ���� ��ĭ ������ 
				// Ŀ���� ��ġ�� ������ ȸ�� ������ ���´�.
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
