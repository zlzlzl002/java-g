package test.mypac;
// extends thread
public class doThread extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("다른 쓰레드 시작");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("다른 쓰레드 종료");
	}
}
