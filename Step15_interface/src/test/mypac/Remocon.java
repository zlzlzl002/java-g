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
public interface Remocon {
	// �ɹ� �ʵ�   interface ��. ����
	public static final int VERSION=1; // final �ʵ�� ��δ빮��
	public String COMPANY="LG"; // static final ���� ���� 
	
	// �޼ҵ� �����ϱ�
	public abstract void up(); 
	public void down(); // abstract ��������  �߻�
}
