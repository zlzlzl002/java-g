package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		
		useReomocon(()->{
			System.out.println("Tv를 켜요");
		});
		
		useReomocon(()->{
			System.out.println("라디오를 켜요");
		});
		
		useReomocon(()->{
			System.out.println("불을  켜요");
		});
	}
	
	// Remcon type 의 참조값을 전달 받는 메소드
	public static void useReomocon(Remocon r) { // r 인자로 전달받는 interFace type 메소드가1개만 있을때
		r.turnOn();
	}
}
