package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		
		SmartPhone p1=new SmartPhone();
		//usePhone() �޼ҵ� ȣ��
		usePhone(p1);
		//useHandPhone() �޼ҵ� ȣ��
		useHandPhone(p1);
		//useSmartPhone() �޼ҵ� ȣ��
		useSmartPhone(p1);
	}
	
	public static void usePhone(Phone p) {
		p.call();
	}
	public static void useHandPhone(HandPhone p) {
		p.mobileCall();
	}
	public static void useSmartPhone(SmartPhone p) {
		p.doInternet();
	}
}








