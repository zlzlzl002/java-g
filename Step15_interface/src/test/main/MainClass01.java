package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println(Remocon.VERSION);
		// Remocon 인터페이스 type 을 담을 지역변수 만들기
		Remocon r1=null;
		// Remocon type 의 참조값이 필요 하다면?
		r1 = new MyRemocon(); // interface 도 부모class 역활을 한다.
		useRemocon(r1);
	}
	
	// 이미 틀이 만들어진 상태에서         
	// 장점: 내가up down 무엇을할지 정할수 있다.
	public static void useRemocon(Remocon r) {// Remocon data type 열할 할수있다.
		r.up();
		r.down();
	}
}
