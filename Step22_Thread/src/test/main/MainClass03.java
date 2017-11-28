package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// 여러번 start 할수 있는지 확인해보기
		YourThread y= new YourThread();
		
		
		// 새로운 스레드 시작 시키기
		new YourThread().start(); // 실행방법
		new YourThread().start();
		new YourThread().start();
		
	}
	
	static class YourThread extends Thread{ // 상속받은 클래스 정의
		@Override
		public void run() {
			System.out.println("새로운 스레드");
		}
	}
}
