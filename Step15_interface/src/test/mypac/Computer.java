package test.mypac;
/*
 *  [Interface]
 *  
 *  - �����ڰ� ���� (�ܵ� ��ü �����Ұ�)
 *  - ������ ��� �޼ҵ�� ������ ���� (�߻� �޼ҵ常 ������ �ִ�)
 *  - �ɹ��ʵ�� static final(����Ұ�) �ɹ��ʵ常 ������ �ִ�.
 *  - data type �� ������ �Ҽ� �ִ�.
 *  - �������̽� type �� �������� �ʿ��ϸ� ����(implements) Ŭ���� ��
 *    ���� ��ü�� ���� �ؾ� �Ѵ�.
 */
public interface Computer {
	// �ʵ� ����
	public static final int WINDOW=10;
	public String BR="LG";
	
	// �޼ҵ� �����ϱ� �߻�
	public abstract void up();
	public void down();
}
