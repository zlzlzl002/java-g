package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		
		useReomocon(()->{
			System.out.println("Tv�� �ѿ�");
		});
		
		useReomocon(()->{
			System.out.println("������ �ѿ�");
		});
		
		useReomocon(()->{
			System.out.println("����  �ѿ�");
		});
	}
	
	// Remcon type �� �������� ���� �޴� �޼ҵ�
	public static void useReomocon(Remocon r) { // r ���ڷ� ���޹޴� interFace type �޼ҵ尡1���� ������
		r.turnOn();
	}
}
