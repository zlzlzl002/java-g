package test.main;

import test.mypac.AnotherThread;
import test.mypac.MyThread;
/*
 *  [ Thread (�۾�����) ����� ]
 *  
 *  (���1)
 *  
 *  1. Thread Ŭ������ ��ӹ��� Ŭ������ �����Ѵ�.
 *  2. run() �޼ҵ带 �������̵��Ѵ�.
 *  3. ���ο� �۾������� �ʿ��� ������ Ŭ������ �̿��ؼ� ��ü�� �����ϰ�
 *     start() ��� �޼ҵ带 ȣ���ϸ� �����尡 ���۵ȴ�. 
 */
public class MainClass01 {
	public static void main(String[] args) {
		// ������ �帧 Thread �̴�.       mainThread
		// ��ƼThread ���ÿ� �۾� ���� �ʴ´�.
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		// ���ο� �۾����� ���� ��Ű�� 
		new AnotherThread().start(); // start �ϸ� (run �޼ҵ�)ȣ��� ���ÿ� �ٷ� return
		//new AnotherThread().run();
		doSomething();
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
	
	public static void doSomething() {
		System.out.println("���� �����尡 5�� �Ͻ� ���� �ǿ�~");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("doSomething() �� ���� �˴ϴ�.");
	}
}
