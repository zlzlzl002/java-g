package test.mypac;
// extends thread
public class doThread extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("�ٸ� ������ ����");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�ٸ� ������ ����");
	}
}
