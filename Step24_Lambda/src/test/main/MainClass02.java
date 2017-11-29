package test.main;

import test.mypac.PrintMsg;

public class MainClass02 {
	public static void main(String[] args) {

		usePrint(new PrintMsg() {

			@Override
			public void print(String msg) {
				System.out.println("���:" + msg);

			}
		});
		
		// ���ٽ�      �޼ҵ尡 1�� �϶��� ����
		usePrint((msg)->{
			System.out.println("���2:"+msg);
		});
	}

	public static void usePrint(PrintMsg p) {
		p.print("hello");
	}
	
}
