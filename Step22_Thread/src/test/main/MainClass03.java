package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// ������ start �Ҽ� �ִ��� Ȯ���غ���
		YourThread y= new YourThread();
		
		
		// ���ο� ������ ���� ��Ű��
		new YourThread().start(); // ������
		new YourThread().start();
		new YourThread().start();
		
	}
	
	static class YourThread extends Thread{ // ��ӹ��� Ŭ���� ����
		@Override
		public void run() {
			System.out.println("���ο� ������");
		}
	}
}
