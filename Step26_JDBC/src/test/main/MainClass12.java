package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		// 1�� ȸ�� �Ѹ��� ������ �ҷ� ������?
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto=dao.getDate(2);

		if(dto!=null) {
			int num=dto.getNum();
			String name=dto.getName();
			String addr=dto.getAddr();
			System.out.println(num+"/"+name+"/"+addr);
		}else{
			System.out.println("������ ����");
		}
	}
}
