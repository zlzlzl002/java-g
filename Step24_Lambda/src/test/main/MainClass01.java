package test.main;

public class MainClass01 { // Lambda
	public static void main(String[] args) {
		new Thread(new Runnable() { // inner Class
 			@Override
			public void run() { // run �޼ҵ�
				System.out.println("�����忡�� A �۾� ����");
			}
		}).start();;
		
		// �� ���� �����ϰ� 
		new Thread(()->{
			System.out.println("�����忡�� B �۾� ����");
		}).start();
	}
}
