package test.main;

import java.lang.reflect.Member;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		// 수정할 회원정보
		int num=999;
		String name="에이콘";
		String addr="종로";
		
		MemberDto dto = new MemberDto(num,name,addr);
		MemberDao dao = MemberDao.getInstance();
		//  저장하기
		boolean isSuccess=dao.update(dto);
		if(isSuccess) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}
}
