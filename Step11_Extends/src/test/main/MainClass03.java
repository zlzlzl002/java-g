package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		
		//SmartPhone ��ü�� �����ؼ� �������� SmartPhone type 
		//���� �ޱ�
		SmartPhone p1=new SmartPhone();
		// p1 �� ��� �ִ� �������� HandPhone type ������ ���
		HandPhone p2=p1;
		// p1 �� ��� �ִ� �������� Phone type ������ ���
		Phone p3=p1;
		// p1 �� ��� �ִ� �������� Object type ������ ���
		Object p4=p1;
		
		// p1, p2, p3, p4 �� ��� �ִ� �������� ��� ����
		if(p1==p2) {
			System.out.println("���ƿ�!");
		}
			
		// p4 �� ��� �ִ� �������� Phone type ���� casting !
		Phone p5 = (Phone)p4;
		// p4 �� ��� �ִ� �������� HandPhone type ���� casting!
		HandPhone p6=(HandPhone)p4;
		// p4 �� ��� �ִ� �������� SmartPhone type ���� casting!
		SmartPhone p7=(SmartPhone)p4;
		
	}
}












