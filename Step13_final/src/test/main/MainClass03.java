package test.main;

import test.mypac.AttackUnit;

public class MainClass03 {
	public static void main(String[] args) {
		// import �� AttackUnit ��ü ����
		AttackUnit unit1= new AttackUnit();
		// ������ ���� ����
		unit1.setWeaponState(AttackUnit.FIST);
		// ����
		unit1.attack();
	}
}
