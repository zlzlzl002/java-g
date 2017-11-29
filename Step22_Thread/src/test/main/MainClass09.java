package test.main;

public class MainClass09 {
	public static void main(String[] args) {
	// inner Class 에서 지역변수 참조 할때 final ~~
	final String NAME="김구라";
		
		// local inner class 를 이용해서 스레드 시작 시키기
		new Thread(new Runnable() {
			@Override
			public void run() { // run() 잠시후에 호출
				// 지역변수는 final 상수만 참조 가능하다.
				System.out.println("지역변수 name:"+NAME);
			}
		}).start();
	}
}
