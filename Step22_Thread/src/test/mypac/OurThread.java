package test.mypac;

public class OurThread implements Runnable {

	@Override
	public void run() {
		System.out.println("implements ������ ����");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("implements ������ ����");
	}

}
