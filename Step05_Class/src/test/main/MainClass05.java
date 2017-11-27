package test.main;

import test.mypac.Car;
import test.mypac.YourUtil;

public class MainClass05 {
	public static void main(String[] args) {
		Car brand = new Car();
		System.out.println(brand.name);
		Car brand2 = new Car();
		brand2.name="BMW";
		System.out.println(brand2.name);
		brand.drive();
		
		YourUtil.fileDown();
		
	
		
	}
}
