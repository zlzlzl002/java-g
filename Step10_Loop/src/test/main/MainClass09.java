package test.main;

import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
		
		//ȸ�������� ������ �迭 ��ü ����
		MemberDto[] members=new MemberDto[3];
		
		//MemberDto ��ü�� ������ ȸ������ �����ϱ� 
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("�豸��");
		dto1.setAddr("�뷮��");
		
		MemberDto dto2=new MemberDto(2, "�ذ�", "��ŵ�");
		
		members[0]=dto1;
		members[1]=dto2;
		members[2]=new MemberDto(3, "������", "�󵵵�");;
		
//		for(int i=0; i<members.length; i++) {
//			MemberDto tmp=members[i];
//			showInfo(tmp);
//		}
		
		for(MemberDto tmp:members) {
			showInfo(tmp);
		}
		
//		showInfo(members[0]);
//		showInfo(members[1]);
//		showInfo(members[2]);
	}
	
	// static �ɹ� �޼ҵ�
	public static void showInfo(MemberDto dto) {
		System.out.println("��ȣ:"+dto.getNum());
		System.out.println("�̸�:"+dto.getName());
		System.out.println("�ּ�:"+dto.getAddr());
		System.out.println("----------------");
	}
}

















