package test.main;
/*
 *  inner Class ����
 *  �ٸ����� �ϱ� �����ϴ�.
 */
public class MainClass04 {
	public static void main(String[] args) {
		// �͸��� local inner Ŭ������ �̿��ؼ� ������ ���۽�Ű��
		// �ٸ� ������ �ϱ� �����ϴ�.
		new Thread() { // inner class    extends Thread �ѻ���
			@Override
			public void run() {
				System.out.println("���ο� ������ ���۵�");
			}
		}.start();
		
		// �ٸ����� �ϱ�
		new Thread() { // inner class    extends Thread �ѻ���
			@Override
			public void run() { // run �޼ҵ带 �ٸ��� �����Ҽ� �ִ�.
				System.out.println("�������");
			}
		}.start();
		
		// �ٸ����� �ϱ�
		new Thread() { // inner class    extends Thread �ѻ���
			@Override
			public void run() {
				System.out.println("�뷡�� �ҷ���");
			}
		}.start();
	}
}
