package test.main;

public class MainClass09 {
	public static void main(String[] args) {
	// inner Class ���� �������� ���� �Ҷ� final ~~
	final String NAME="�豸��";
		
		// local inner class �� �̿��ؼ� ������ ���� ��Ű��
		new Thread(new Runnable() {
			@Override
			public void run() { // run() ����Ŀ� ȣ��
				// ���������� final ����� ���� �����ϴ�.
				System.out.println("�������� name:"+NAME);
			}
		}).start();
	}
}
