package test.main;

import test.mypac.MyUtil;

public class MainClass01 {
	public static void main(String[] args) {
		// MyUtil Ŭ������ ������ showVersion() �޼ҵ带 
		// ȣ���� ������.
		MyUtil.showVersion();

		// MyUtil Ŭ������ ������ sendMessage() �޼ҵ带 
		// ȣ���� ������.
		MyUtil u=new MyUtil();
		u.sendMessage();
		
		MyUtil u2=new MyUtil();
		u2.sendMessage();
		
		new MyUtil().sendMessage();
		
	}
}

















