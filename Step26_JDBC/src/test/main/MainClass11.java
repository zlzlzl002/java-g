package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		// 회원 목록을 불러 오려면?
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> li=dao.getList();
		for(MemberDto tmp:li) {
			int num=tmp.getNum();
			String name=tmp.getName();
			String addr=tmp.getAddr();
			System.out.println("num:"+num+"name:"+name+"addr:"+addr);
		}
		
	}
}
