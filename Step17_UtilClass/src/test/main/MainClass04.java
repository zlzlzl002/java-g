package test.main;

import java.util.ArrayList;

import test.dto.MemberDto;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  3 ���� ȸ�������� ���� MemberDto ��ü�� ���
		 *  ArrayList ��ü�� MemberDto ��ü�� �������� 
		 *  ���� ���� ������.
		 */
		
		MemberDto dto1=new MemberDto(1, "�豸��", "�뷮��");
		MemberDto dto2=new MemberDto(2, "�ذ�", "��ŵ�");
		MemberDto dto3=new MemberDto(3, "������", "�󵵵�");
		
		ArrayList<MemberDto> members=new ArrayList<MemberDto>();
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
	}
}










