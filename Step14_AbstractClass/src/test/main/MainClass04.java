package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass04 {
	// inner class static 없으면  new OurWeapon 할수없음  18번줄
	public static class OurWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("지상이를 공격해요!");
		}
		
	}
	public static void main(String[] args) {
		//static 메소드는 static 만 참조가능
		new OurWeapon(); // 8번줄참조
		
		// 추상 클래스(Weapon) Type 지역변수 만들기
		Weapon w1 = new OurWeapon(); // inner class를 이용한 OurWeapon 
		doSomething(w1);
		
	}
	
	// 추상 클래스 Type 의 참조값을 전달해야 호출할수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
