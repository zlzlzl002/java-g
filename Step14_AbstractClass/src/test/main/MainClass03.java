package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ� ������");
		// �߻� Ŭ����(Weapon) Type �������� �����
		Weapon w1=null;
		// �߻� Ŭ���� Type �� �������� �ʿ� �ϴٸ�?
		w1 = new MyWeapon();  // Type obj Weapon MyWeapon �̴�
		MainClass03.doSomething(w1);
	}
	
	// �߻� Ŭ���� Type �� �������� �����ؾ� ȣ���Ҽ� �ִ� �޼ҵ�
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
