package test.armory;

public class SniperGun extends Gun{
	
	//������ 
	public SniperGun(Bullet bullet) {
		super(bullet);
		
	}
	//fire() �޼ҵ� �������ϱ� 
	@Override
	public void fire() {
		/*
		 * super �� �θ�ü�� �������� ����Ű�� ����� �̴�.
		 * super.fire() �������� ����̵� �θ� �޼ҵ带 
		 * ȣ���ϴ� ǥ�����̴�.
		 */
		super.fire();
		
		System.out.println("���� �ָ� �����ϰ� ��~");
	}

}








