package test.mypac;
/*
 *  �ʵ�� final ����밡�� all �빮��
 * 	�޼ҵ�� �߻�(abstract) �� ��� �����ϴ�
 * 	data type �� ���´�
 *  new �Ҽ����� 
 *  �������� ����Ϸ��� implements ��ü�� �����ؼ� �ؾߵȴ�
 */

public interface Tv {
	// �ʵ� final 
	public String NAME="LG";
	public static final int NUM=16;
	
	// �߻�ȭ �޼ҵ�
	public void show();
	public abstract void news();
}
