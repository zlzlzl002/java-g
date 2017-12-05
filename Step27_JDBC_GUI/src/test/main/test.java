package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class test {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto = dao.getDate(6);
		if(dto!=null) {
			int num=dto.getNum();
			String name=dto.getName();
			String addr=dto.getAddr();
			System.out.println(num+"/"+name+"/"+addr);
		}else{
			System.out.println("정보가 없음");
		}
	}
}
