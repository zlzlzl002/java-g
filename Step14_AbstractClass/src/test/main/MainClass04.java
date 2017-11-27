package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass04 {
	// inner class static ������  new OurWeapon �Ҽ�����  18����
	public static class OurWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("�����̸� �����ؿ�!");
		}
		
	}
	public static void main(String[] args) {
		//static �޼ҵ�� static �� ��������
		new OurWeapon(); // 8��������
		
		// �߻� Ŭ����(Weapon) Type �������� �����
		Weapon w1 = new OurWeapon(); // inner class�� �̿��� OurWeapon 
		doSomething(w1);
		
	}
	
	// �߻� Ŭ���� Type �� �������� �����ؾ� ȣ���Ҽ� �ִ� �޼ҵ�
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
