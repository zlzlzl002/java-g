package test.mypac;
/*
 *  				[ ��ü ���� ]
 */
public class Car {
	// �Ϲ� ����ʵ�  
	// car �ʵ� �����ϱ�  ���������� public > ��Ű���� �ٸ��� ����
	public String name="�ҳ�Ÿ"; //  name  ���ڿ� String
	
	// car �޼ҵ� �����ϱ�   static ������ ��ü�� ���赵 ������ �Ѵ� 
	public void drive() { // void �����  return ����
		
		Car a=this; // ���� �������� Car type
		
		System.out.println("�޷���~");
	
	}
	
	// �Ϲ� �ɹ� �޼ҵ� �����ϱ�  
	public void showInfo() {
		System.out.println("���� �̸�:"+this.name);
		// this�� ���� �Ѱ���  name �豸�� ��Ÿ��
		// System.out.println("���� �̸�:"+name);
		
	}
	
	// ���� ��ü�� �Ǿ����� �������� this. �̴�~  �ڽ���������*this*
	// j $this �̺�Ʈ�� �Ͼ �ٷα׿��
}
