package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		
		// type : obj Remocon YourRemocon
		useRemocon(new YourRemocon()); 
		

		Remocon r2= new Remocon(){ // {} 익명의 class implements Remocon()

			@Override
			public void up() {
				System.out.println("업ㅂㅂㅂㅂㅂㅂㅂㅂ");	
			}

			@Override
			public void down() {
				System.out.println("다우우우우운");
				
			}
			
		};
		useRemocon(r2);
	}
	// 이미 틀이 만들어진 상태에서         
	// 장점: 내가up down 무엇을할지 정할수 있다.
	public static void useRemocon(Remocon r) {// Remocon data type 열할 할수있다.
		r.up();
		r.down();
	}
}
