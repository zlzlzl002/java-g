package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass03 {
	public static void main(String[] args) {
		// local inner class method 
		class OurRemocon implements Remocon{
			@Override
			public void up() {
				System.out.println("ä���� �÷�");
			}

			@Override
			public void down() {
				System.out.println("ä���� ����");
			}
		}
		//OurReMocon ��ü �����ؼ� Remocon �������̽� type ����
		// ������ �ޱ�
		Remocon r1=new OurRemocon();
		useRemocon(r1);
		// �͸� inner Ŭ����

	}
	// �̹� Ʋ�� ������� ���¿���         
	// ����: ����up down ���������� ���Ҽ� �ִ�.
	public static void useRemocon(Remocon r) {// Remocon data type ���� �Ҽ��ִ�.
		r.up();
		r.down();
	}
}
