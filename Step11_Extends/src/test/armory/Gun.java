package test.armory;
/*
 *  [ ���� ������ ]
 *  
 *  class ���� ������
 *  
 *  1. public  : ��ü ����
 *  2. default : ���� ��Ű�� �������� ���� ����
 *  
 *  ������, �ʵ�, �޼ҵ� �� ���� ������
 *  
 *  1. public : ��ü ����
 *  2. protected : ���� ��Ű�� Ȥ�� ��Ӱ����� �ڽĿ��� ���� ����
 *  3. default : ���� ��Ű�� �������� ���� ����
 *  4. private : ���ǵ� Ŭ���� �ȿ����� ���� ����
 *  
 */
public class Gun {
	//�ɹ��ʵ�
	protected Bullet bullet;
	
	//������
	public Gun(Bullet bullet) {
		this.bullet=bullet;
	}
	//�޼ҵ�
	public void fire() {
		if(bullet==null) {
			System.out.println("�Ѿ� ��ü�� ��� ���Ұ�");
			return; //�޼ҵ� ���� 
		}
		System.out.println("��~");
	}
}



