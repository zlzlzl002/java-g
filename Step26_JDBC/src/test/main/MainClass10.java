package test.main;

import test.dao.MemberDao;

public class MainClass10 {
	public static void main(String[] args) {
		// 999�� ȸ���� ���� �Ϸ���?
		int num=999;
		
		MemberDao dao = MemberDao.getInstance();
		boolean isSucess=dao.delete(num);
		
		if(isSucess) {
			System.out.println("999�� �� ����");
		}else {
			System.out.println("������");
		}
	}
}
