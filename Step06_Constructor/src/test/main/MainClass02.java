package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		
		// Computer ��ü�� �����ؼ� �������� com1 �̶�� ����������
		// ��� ������.
		Computer com1=new Computer();
		// com1 ��ü�� productionDate �� "2017��11��15��" �� 
		// ���Կ����ڸ� �̿��ؼ� ������ ������.
		com1.productionDate="2017��11��15��";
		// com1 ��ü�� doGame() �޼ҵ带 ȣ���� ������.
		com1.doGame();
		// com1 ��ü�� cpu �� Cpu type ��ü�� ��������
		// ���Կ����ڸ� �̿��ؼ� ������ ������.
		com1.cpu=new Cpu();
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}










