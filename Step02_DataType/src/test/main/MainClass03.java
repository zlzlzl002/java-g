package test.main;
/*
 * [ Java �⺻ ������ type ]
 * 
 * 2. ���� (boolean)
 * 
 *  - ������ �ִ� ���� ���� : true, false �ΰ��� ���� ������ �ִ�
 *  - ����� ��� : true, false �� ���� ���ְų� �񱳿��� Ȥ�� 
 *    �������� ����� ���� �ִ�.  
 */
public class MainClass03 {
	public static void main(String[] args) {
		//���� ���� ����� ���ÿ� �� �����ϱ�
		boolean isRun=true;
		
		if(isRun) {
			System.out.println("�޷���!");
		}
		
		//�񱳿����� ����� ����� boolean type �����͸� ������ ���
		boolean isGreater = 10>1;
		
		if(isGreater) {
			System.out.println("10 �� 1 ���� Ŀ��");
		}
		
		//�������� ����� ����� boolean type �����͸� ������ ���
		boolean result = true || false;
		
		System.out.println("���� �޼ҵ尡 ���� �˴ϴ�.");
	}
}












