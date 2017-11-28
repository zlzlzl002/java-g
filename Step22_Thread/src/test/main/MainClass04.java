package test.main;
/*
 *  inner Class 장점
 *  다른동작 하기 수월하다.
 */
public class MainClass04 {
	public static void main(String[] args) {
		// 익명의 local inner 클래스를 이용해서 스레드 시작시키기
		// 다른 동작을 하기 수월하다.
		new Thread() { // inner class    extends Thread 한상태
			@Override
			public void run() {
				System.out.println("새로운 스레드 시작됨");
			}
		}.start();
		
		// 다른동작 하기
		new Thread() { // inner class    extends Thread 한상태
			@Override
			public void run() { // run 메소드를 다르게 구현할수 있다.
				System.out.println("춤을춰요");
			}
		}.start();
		
		// 다른동작 하기
		new Thread() { // inner class    extends Thread 한상태
			@Override
			public void run() {
				System.out.println("노래를 불러요");
			}
		}.start();
	}
}
