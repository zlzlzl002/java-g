package test.mypac;
/*
 *  �������̽��� ���� �Ҷ��� implements ���� ����Ѵ�.
 *  �������� �������̽��� ���� �Ҽ��� �ִ�. (���� ���� ����)
 *  �������̽��� ���ǵ� ��� �߻�޼ҵ带 �������̵� �ؾ� �Ѵ�.
 */
public class MyComputer implements Computer {

	@Override
	public void up() {
		System.out.println("��ǻ�� ������");
		
	}

	@Override
	public void down() {
		System.out.println("��ǻ�� ����!");
		
	}
	
}
