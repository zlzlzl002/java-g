package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass05 {
	public static void main(String[] args) {
		// new Remocon() ctrl space 누르셈 자동완성됨
		Remocon r1 = new Remocon() { // 변수에 담을때
			@Override
			public void up() {
				System.out.println("요요가 올라와요");
			}
			@Override
			public void down() {
				System.out.println("요요가 내려와여");
			}
		};
		useRemocon(r1);
		
		// useRemocon(new Remocon ctrl space 누르면 자동 완성
		useRemocon(new Remocon() { // 변수에 담을 이유가 없을때
			@Override
			public void up() {
				System.out.println("무언가 올림");
			}
			@Override
			public void down() {
				System.out.println("무언가를 내림");
			}
		});
	}
	// 이미 틀이 만들어진 상태에서         
	// 장점: 내가up down 무엇을할지 정할수 있다.
	public static void useRemocon(Remocon r) {// Remocon data type 열할 할수있다.
		r.up();
		r.down();
	}
}
