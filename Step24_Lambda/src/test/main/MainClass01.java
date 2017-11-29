package test.main;

public class MainClass01 { // Lambda
	public static void main(String[] args) {
		new Thread(new Runnable() { // inner Class
 			@Override
			public void run() { // run 메소드
				System.out.println("스레드에서 A 작업 수행");
			}
		}).start();;
		
		// 위 내용 간략하게 
		new Thread(()->{
			System.out.println("스레드에서 B 작업 수행");
		}).start();
	}
}
