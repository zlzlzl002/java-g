package test.main;

import java.lang.reflect.Member;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		// ������ ȸ������
		int num=999;
		String name="������";
		String addr="����";
		
		MemberDto dto = new MemberDto(num,name,addr);
		MemberDao dao = MemberDao.getInstance();
		//  �����ϱ�
		boolean isSuccess=dao.update(dto);
		if(isSuccess) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
	}
}
