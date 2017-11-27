package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass05 {

	public static void main(String[] args) {
		
		// local inner Class �޼ҵ�in class
		class GuraWeapon extends Weapon {
			@Override
			public void attack() {
				System.out.println("�豸�� �����ؿ�");
			}
		}
		// �߻� Ŭ����(Weapon) Type �������� �����
		Weapon w1 = new GuraWeapon(); // inner Class �� �̿��� GuraWeapon
		doSomething(w1);
	}
	// �߻� Ŭ���� Type �� �������� �����ؾ� ȣ���Ҽ� �ִ� �޼ҵ�
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
