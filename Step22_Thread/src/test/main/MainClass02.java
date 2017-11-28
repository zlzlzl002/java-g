package test.main;

import test.mypac.MyThread;
/*
 *  [ Thread �۾����� ����� ]
 *  
 *  (���2)
 *  
 *  - Runnable �������̽��� ������ Ŭ������ �����Ѵ�.
 *  - run() �޼ҵ带 �������̵� �Ѵ�.
 *  - �����尡 �ʿ��� ������ ���ݸ��� Ŭ������ Runnable Type ��ü�� �����Ѵ�.
 *  - Thread ��ü�� �����ϸ鼭 �������� ���ڷ� Runnable Type id �� �����Ѵ�.
 *  - ������ Thread ��ü�� start() �޼ҵ带 ȣ���ؼ� ���ο� �����带 ���� ��Ų��. 
 */
public class MainClass02 {
	public static void main(String[] args) {
		Runnable runnable= new MyThread(); // �͸��� innerClass �� �����Ҽ����ִ�
		new Thread(runnable).start();
		
		System.out.println("���� �����尡 ���� �˴ϴ�.");
	}
}
