package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;
/*
 *  MainClass 08 09 10  ����
 */
public class MainClass08 {

	public static void main(String[] args) {
		// �Ʒ��� ������ DB�� �����Ϸ���
		int num = 999;
		String name = "������";
		String addr = "����";
		// ������ ȸ�������� MemberDto ��ü�� ���
		MemberDto dto = new MemberDto(num,name,addr);
		// MemberDao ��ü�� ������ ������
		MemberDao dao = MemberDao.getInstance();
		// �����ϱ�
		boolean isSuccess=dao.insert(dto);
		if(isSuccess) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
		// list
		dao.getList();
		// ����
		dao.delete(5);
		// ������Ʈ
		//MemberDto dto6 = new MemberDto(15, "������", "������");
		//dao.update(dto6);
		//MemberDto dto15 = new MemberDto(15,"?","?");
	

	}
}
