package test.mypac;
/*
 *  �������̽��� ���� �Ҷ��� implements ���� ����Ѵ�.
 *  �������� �������̽��� ���� �Ҽ��� �ִ�. (���� ���� ����)
 *  �������̽��� ���ǵ� ��� �߻�޼ҵ带 �������̵� �ؾ� �Ѵ�.
 */
public class MyRemocon implements Remocon {

	@Override
	public void up() { // ������Ʈ ��Ȳ�� �°� ����
		System.out.println("�µ� �÷���");
		
	}

	@Override
	public void down() {
		System.out.println("�µ� ������");
		
	}
	
}
