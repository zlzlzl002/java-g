package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println(Remocon.VERSION);
		// Remocon �������̽� type �� ���� �������� �����
		Remocon r1=null;
		// Remocon type �� �������� �ʿ� �ϴٸ�?
		r1 = new MyRemocon(); // interface �� �θ�class ��Ȱ�� �Ѵ�.
		useRemocon(r1);
	}
	
	// �̹� Ʋ�� ������� ���¿���         
	// ����: ����up down ���������� ���Ҽ� �ִ�.
	public static void useRemocon(Remocon r) {// Remocon data type ���� �Ҽ��ִ�.
		r.up();
		r.down();
	}
}
