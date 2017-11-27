package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass04 {
	public static void main(String[] args) {
		// �͸��� local inner class �� �̿��ؼ� ��ü�� �����ϰ�  
		// �������� Remocon type ������ ��� implements Remocon{}<=����
		Remocon r1=new Remocon() {// {} => �̸��� ���� class
			@Override // new Remocon() ������ ȣ��(constructor) ȣ���� ��ġ�� ������
			public void up() {
					System.out.println("�Ӹ��� �ø�����");
			}

			@Override
			public void down() {
					System.out.println("�Ӹ��� ��������");
			}
				
		};
		useRemocon(r1);
		
		// ���� ������ �����ϰ�
		useRemocon( new Remocon() {// {} => �̸��� ���� class
			@Override // new Remocon() ������ ȣ��(constructor) ȣ���� ��ġ�� ������
			public void up() {
				System.out.println("�ٸ��� �÷���");
			}

			@Override
			public void down() {
				System.out.println("�ٸ��� ������");
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
