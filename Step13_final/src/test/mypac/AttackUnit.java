package test.mypac;

public class AttackUnit {
	// ���ڸ� ���ȭ ��Ű��
	public static final int FIST=0;
	public static final int SWORD=1;
	public static final int GUN=2;
	
	// �ʵ�
	private int weaponState=0;
	
	// setW ctrl space   ������ ���¸� �ٲٴ� �޼ҵ�
		public void setWeaponState(int weaponState) {
			this.weaponState = weaponState;
		}
	
	// �����ϴ� �޼ҵ�
	public void attack() {
		if(weaponState==AttackUnit.FIST) { // ���� class AttackUnit ���� �ص���
			System.out.println("�ָ����� ����");
		}else if(weaponState==SWORD) {
			System.out.println("Į�� ����");
		}else if(weaponState==GUN) {
			System.out.println("������ ����");
		}
	}
}
