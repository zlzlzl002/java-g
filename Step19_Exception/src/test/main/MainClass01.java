package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		try {

			System.out.print("���� �Է�(����):");
			int num1=scan.nextInt();
			System.out.print("������ �Է�(����):");
			int num2=scan.nextInt();
			
			//num2 �� num1 ���� ���� �� 
			int mog=num2/num1;
			//num2 �� num1 ���� ���� ������
			int na=num2%num1;
		
			System.out.println(num2+"��"+num1+"���� ������:"+mog);
			System.out.println(num2+"��"+num1+"���� ���� ������:"+na);
		}catch(Exception e) {
			System.out.println("Exception �߻�!");
			System.out.println("���� ����:"+e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}








