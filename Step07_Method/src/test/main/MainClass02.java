package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
		// MyUtil Ŭ������ getNum() �޼ҵ带 ȣ���� ������.
		int a=MyUtil.getNum(); //���ϵǴ� �����͸� ������ ��� 
		
		// MyUtil Ŭ������ getMessage() �޼ҵ带 ȣ���ϰ�
		// ���ϵǴ� ���� msg ��� ���������� ������ ������.
		String msg=MyUtil.getMessage();
		
		// MyUtil Ŭ������ ���ǵ� getName() �޼ҵ带 ȣ���ϰ�
		// ���ϵǴ� ���� name �̶�� ���� ������ ������ ������.
		MyUtil u=new MyUtil();
		String name=u.getName();
	}
}










