package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ����");
	
		try {
//			 ������(�۾�����, �������) 5�� ���� ���߱�
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// interruptedExeption �� RuntimeException ��
			// ��ӹ��� �ʾұ� ������ �ݵ�� try-catch ������
			// ���� ó���� �ؾ� ���������� �����ȴ�.
			e.printStackTrace();
		}
	
		System.out.println("main �޼ҵ尡 ����");	
	}
}
