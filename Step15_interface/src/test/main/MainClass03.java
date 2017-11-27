package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass03 {
	public static void main(String[] args) {
		// local inner class method 
		class OurRemocon implements Remocon{
			@Override
			public void up() {
				System.out.println("채널을 올려");
			}

			@Override
			public void down() {
				System.out.println("채널을 내려");
			}
		}
		//OurReMocon 객체 생성해서 Remocon 인터페이스 type 으로
		// 참조값 받기
		Remocon r1=new OurRemocon();
		useRemocon(r1);
		// 익명 inner 클래스

	}
	// 이미 틀이 만들어진 상태에서         
	// 장점: 내가up down 무엇을할지 정할수 있다.
	public static void useRemocon(Remocon r) {// Remocon data type 열할 할수있다.
		r.up();
		r.down();
	}
}
