package test.mypac;

public class AnotherThread extends Thread { // Thread ��� �ޱ�
	
	// run() �޼ҵ� ������ 
	@Override
	public void run() {
		//super.run(); // �θ�޼ҵ� ȣ��~~
		
		// ���ο� �۾�����(������)�� ���۵Ǵ� run() �޼ҵ�
		System.out.println("�Ǵٸ� �����尡 ���� �Ǿ����ϴ�.");
		for(int i=0; i<10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�Ǵٸ� �����尡 ���� �˴ϴ�.");
	}
}
