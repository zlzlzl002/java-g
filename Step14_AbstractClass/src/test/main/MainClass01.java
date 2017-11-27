package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
import test.mypac.YourWeapon;

public class MainClass01 {
	public static void main(String[] args) {
		// �߻� Ŭ������ data type ���ҵ� �Ѵ� ��뼳��  
		// Weapon Ŭ���������� prepare attack ���� �߱� ������
		Weapon w1 = new MyWeapon();
		w1.prepare();
		w1.attack();
		
		System.out.println("--------------");
		
		YourWeapon w2 = new YourWeapon();
		w1.prepare();
		w2.attack();
		
		System.out.println("--------------");
		
		useWeapon(w1);
		useWeapon(w2);
	}
	// �߻� Ŭ���� Type �� ���ڷ� ���� �޴� �޼ҵ�
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
