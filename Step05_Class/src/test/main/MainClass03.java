package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;

public class MainClass03 {
	public static void main(String[] args) {
		// 1. MyUtil Ŭ������ sendMessage() �޼ҵ带 ȣ���� ������.
		MyUtil.sendMessage(); //java ���� �޼ҵ�� �����Ҽ� ����.
		// 2. MyUtil Ŭ������  version �̶�� �ʵ忡 �����
		// 	���ڿ��� �ֿܼ� ����� ������.
		System.out.println(MyUtil.version);
		// 3. car type ��ü�� �����ؼ� drive() �޼ҵ带 ȣ���� ������.
		Car c1 = new Car(); 
		c1.drive();
	    // 4. ������ ���� car type ��ü�� name �ʵ忡 ����� 
		//	���ڿ��� �ܼ�â�� ����� ������.	
		System.out.println(c1.name);
	}
}
