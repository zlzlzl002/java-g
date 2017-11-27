package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass05 {
	public static void main(String[] args) {
		// new Remocon() ctrl space ������ �ڵ��ϼ���
		Remocon r1 = new Remocon() { // ������ ������
			@Override
			public void up() {
				System.out.println("��䰡 �ö�Ϳ�");
			}
			@Override
			public void down() {
				System.out.println("��䰡 �����Ϳ�");
			}
		};
		useRemocon(r1);
		
		// useRemocon(new Remocon ctrl space ������ �ڵ� �ϼ�
		useRemocon(new Remocon() { // ������ ���� ������ ������
			@Override
			public void up() {
				System.out.println("���� �ø�");
			}
			@Override
			public void down() {
				System.out.println("���𰡸� ����");
			}
		});
	}
	// �̹� Ʋ�� ������� ���¿���         
	// ����: ����up down ���������� ���Ҽ� �ִ�.
	public static void useRemocon(Remocon r) {// Remocon data type ���� �Ҽ��ִ�.
		r.up();
		r.down();
	}
}
