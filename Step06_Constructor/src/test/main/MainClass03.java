package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵Ǿ����ϴ�.");
		
		Computer com1=new Computer();
		
		Computer com2=new Computer("2017.11.16");
		
		// Cpu type �� ���� �޴� �����ڸ� �̿��ؼ� 
		// Computer ��ü�� �����ϰ� �������� com3 ��� 
		// ������ ��� ������.
		Computer com3=new Computer(new Cpu());
		
		// String type �� Cpu type �� ��� ���� �޴� �����ڸ�
		// �̿��ؼ� Computer ��ü�� �����ϰ� �������� com4 ��� 
		// ������ ��� ������. 
		Computer com4=new Computer("2017", new Cpu());
		
	}
}













