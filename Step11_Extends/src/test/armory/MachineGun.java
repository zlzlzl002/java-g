package test.armory;

public class MachineGun extends Gun{
	//�ڽ� �����ڿ��� �θ� �����ڿ� �ʿ��� ���� ���� �޾Ƽ� 
	public MachineGun(Bullet bullet) {
		//�θ� �����ڿ� �Ѱ� �ش�.
		//�θ� �����ڸ� ȣ���ϴ� �ڵ�� ���� ù�ٿ� �;��Ѵ�.
		super(bullet);
	}
	
	//�޼ҵ�
	public void autoFire() {
		if(this.bullet==null) {
			System.out.println("�Ѿ� ��ü�� ��� �߻�Ұ�!");
		}
		System.out.println("��~ ��~ ��~");
	}
}







