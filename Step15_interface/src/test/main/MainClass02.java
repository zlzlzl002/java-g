package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		
		// type : obj Remocon YourRemocon
		useRemocon(new YourRemocon()); 
		

		Remocon r2= new Remocon(){ // {} �͸��� class implements Remocon()

			@Override
			public void up() {
				System.out.println("������������������");	
			}

			@Override
			public void down() {
				System.out.println("�ٿ�����");
				
			}
			
		};
		useRemocon(r2);
	}
	// �̹� Ʋ�� ������� ���¿���         
	// ����: ����up down ���������� ���Ҽ� �ִ�.
	public static void useRemocon(Remocon r) {// Remocon data type ���� �Ҽ��ִ�.
		r.up();
		r.down();
	}
}
