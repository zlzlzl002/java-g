package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
import test.mypac.YourWeapon;

public class MainClass01 {
	public static void main(String[] args) {
		// 추상 클래스는 data type 역할도 한다 사용설명서  
		// Weapon 클래스에서는 prepare attack 정의 했기 때문에
		Weapon w1 = new MyWeapon();
		w1.prepare();
		w1.attack();
		
		System.out.println("--------------");
		
		YourWeapon w2 = new YourWeapon();
		w1.prepare();
		w2.attack();
		
		System.out.println("--------------");
		
		useWeapon(w1);
		useWeapon(w2);
	}
	// 추상 클래스 Type 을 인자로 전달 받는 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
