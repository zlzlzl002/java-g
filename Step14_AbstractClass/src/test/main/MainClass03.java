package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드 시작중");
		// 추상 클래스(Weapon) Type 지역변수 만들기
		Weapon w1=null;
		// 추상 클래스 Type 의 참조값이 필요 하다면?
		w1 = new MyWeapon();  // Type obj Weapon MyWeapon 이다
		MainClass03.doSomething(w1);
	}
	
	// 추상 클래스 Type 의 참조값을 전달해야 호출할수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
