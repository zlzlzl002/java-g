package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		// Runnable type ��ü�� ����
		Runnable r1=new Runnable() { // implements method
			@Override
			public void run() {
				System.out.println("�޷� ~ �޷�~");
			}
		};
		// �����带 ���� ��Ų��.
		new Thread(r1).start();
		new Thread(r1).start();
		
		// �� ������ �����ϰ�    
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("�پ�~ �پ�~");
			}
		}).start();
	}
}
