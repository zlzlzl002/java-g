package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass04 {
	public static void main(String[] args) {
		// 익명의 local inner class 를 이용해서 객체를 생성하고  
		// 참조값을 Remocon type 변수에 담기 implements Remocon{}<=생각
		Remocon r1=new Remocon() {// {} => 이름이 없는 class
			@Override // new Remocon() 생성자 호출(constructor) 호출후 위치는 참조값
			public void up() {
					System.out.println("머리를 올리는중");
			}

			@Override
			public void down() {
					System.out.println("머리를 내리는중");
			}
				
		};
		useRemocon(r1);
		
		// 위의 내용을 간략하게
		useRemocon( new Remocon() {// {} => 이름이 없는 class
			@Override // new Remocon() 생성자 호출(constructor) 호출후 위치는 참조값
			public void up() {
				System.out.println("다리를 올려요");
			}

			@Override
			public void down() {
				System.out.println("다리를 내려요");
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
