package test.mypac;
/*
 *  Runnable �������̽��� ������ Ŭ������ �̿��ؼ�
 *  �����带 ���� ��ų���� �ִ�.
 */
public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("MyThread ���۵�...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread �����...");
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}
