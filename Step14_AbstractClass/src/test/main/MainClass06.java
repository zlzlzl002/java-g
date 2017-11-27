package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass06 {

	public static void main(String[] args) {
		
		// local inner Class 메소드in class
		class GuraWeapon extends Weapon {
			@Override
			public void attack() {
				System.out.println("김구라를 공격해요");
			}
		}
		// 추상 클래스(Weapon) Type 지역변수 만들기
		Weapon w1 = new GuraWeapon(); // inner Class 를 이용한 GuraWeapon
		doSomething(w1);
		
		/*
		 *  익명의 local inner class 를 이용해서 Weapon type 객체를
		 *  생성해서 참조값을 Weapon type 변수에 담기
		 */
		Weapon w2=new Weapon() {// {} => 익명 local inner Class => extends Weapon{}
			@Override  
			public void attack() {
				System.out.println("아무나 공격!");
			}
		};
		doSomething(w2);
	}
	// 추상 클래스 Type 의 참조값을 전달해야 호출할수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
