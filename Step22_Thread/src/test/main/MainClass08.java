package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		// 스레드 시작 시키기
		new Thread(new MyRunnable()).start();
		new Thread(new MyRunnable()).start();
		new Thread(new MyRunnable()).start();
		new Thread(new MyRunnable()).start();
		
		// 익명 클래스를 활용하면 그때 그때 다른 작업을 수행 할수있다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("스레드에서 B작업 수행중");
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("스레드에서 C작업 수행중");
			}
		}).start();
	}

	static class MyRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("새로운 Thread 에서 A작업 수행");
		}
	}
}
