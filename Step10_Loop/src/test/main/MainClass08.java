package test.main;

import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
		MemberDto dto1=new MemberDto();
		//�޼ҵ带 �̿��ؼ� ȸ������ �����ϱ�
		dto1.setNum(2);
		dto1.setName("�ذ�");
		dto1.setAddr("��ŵ�");
		
		MemberDto dto2=new MemberDto(1, "�豸��", "�뷮��");
		// static �ɹ� �޼ҵ� ȣ���ϸ鼭 MemberDto  ��ü�� 
		// ������ �����ϱ� 
		MainClass08.showInfo(dto1);
		showInfo(dto2);
	}
	
	// static �ɹ� �޼ҵ�
	public static void showInfo(MemberDto dto) {
		System.out.println("��ȣ:"+dto.getNum());
		System.out.println("�̸�:"+dto.getName());
		System.out.println("�ּ�:"+dto.getAddr());
		System.out.println("----------------");
	}
}

















