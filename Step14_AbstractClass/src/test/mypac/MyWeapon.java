package test.mypac;

public class MyWeapon extends Weapon {
	
	// Weapon 추상클래스에 정의된 추상 메소드를
	// 반드시 재정의(Override) 해야된다.
	@Override
	public void attack() {
		System.out.println("김구라를 공격해요");
	}
}
