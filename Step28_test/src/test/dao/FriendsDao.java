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
	// 1. �ڽ��� �������� ���� private static �ʵ� �����
	private static FriendsDao dao;

	// 2. �ܺο��� ��ü �����Ҽ� ������ �������� ���� �����ڸ�
	// private �� ����
	private FriendsDao() {
	} // new MemberDao(); �Ҽ� ����.
	// new �Ҽ� ����.
	// 3. �ڽ��� �������� �������ִ� static �ɹ� �޼ҵ� �����

	public static FriendsDao getInstance() { // getInstance �޼ҵ�
		if (dao == null) {
			dao = new FriendsDao(); // new �� ����1���� ����
		}
		return dao;
	}										

	// DB �� ȸ�������� �����ϴ� �޼ҵ�
	public boolean insert(FriendsDto dto) {
		Connection conn = null; // Connection �ִ�ũ�� 20��
		PreparedStatement pstmt = null;
		// �۾��� ���������θ� ���� ����
		boolean isSuccess = false;
		try {
			conn = new DBConnect().getConn();
			// ������ sql ��
			String sql = "INSERT INTO friends(num,name,phone,regdate) "
					+ " values(friends_seq.NEXTVAL,?,?,"
					+ " TO_CHAR(SYSDATE, 'YY\"��\"MM\"��\"DD\"��\"'))";
			
			pstmt = conn.prepareStatement(sql);
			// ����ǥ 2�� �� NAME ADDR������
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
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
			String sql = "Delete FROM friends WHERE num=?";
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
	public boolean update(FriendsDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// �۾��� ���������θ� ���� ����
		boolean isSuccess = false;
		try {
			conn = new DBConnect().getConn();
			// ������ sql ��
			String sql = "UPDATE friends SET name=?,phone=?,regdate=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getRegdate());
			pstmt.setInt(4, dto.getNum());
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
	public List<FriendsDto> getList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FriendsDto> li = new ArrayList<>();
		// �۾��� ���������θ� ���� ����
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

				// MemberDto ��ü�� ȸ������ ���
				FriendsDto dto = new FriendsDto(num, name, phone, regdate);
				// ArrayList ��ü�� MemberDto ���
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

	// ���ڷ� ���޵Ǵ� ��ȣ�� �ش��ϴ� ȸ�������� �������ִ� �޼ҵ�
	public FriendsDto getDate(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// MemberDto ��ü�� �������� ���� ���� �����
		FriendsDto dto = null;
		try {
			conn = new DBConnect().getConn();
			// num �������ֱ⶧���� Select �Ҷ� num �Ƚᵵ��
			String sql = "Select name,phone,regdate from friends WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			// row �Ѱ� �̱⶧���� if
			if (rs.next()) {// Ŀ���� ��ĭ ������
				// Ŀ���� ��ġ�� ������ ȸ�� ������ ���´�.
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
