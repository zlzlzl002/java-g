package test.main;

import test.dao.MemberDao;

public class MainClass10 {
	public static void main(String[] args) {
		// 999번 회원을 삭제 하려면?
		int num=999;
		
		MemberDao dao = MemberDao.getInstance();
		boolean isSucess=dao.delete(num);
		
		if(isSucess) {
			System.out.println("999번 방 삭제");
		}else {
			System.out.println("실패함");
		}
	}
}
