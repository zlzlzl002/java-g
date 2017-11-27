package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
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
		
		// ����� �߻��ϴ� runtimeException: InputMismatchException | ArthmeticException
		 
		try {
			
		}catch(InputMismatchException ime) {
			// InputMismatchException type �� ���ܰ� �߻��ϸ� 
			// ����Ǵ� ��
			//ime.printStackTrace();
			System.out.println("���� �������� �Է� �ϼ���");
		
		}catch(ArithmeticException ie) {
			//ArithmeticException type �� ���ܰ� �߻��ϸ� 
			//�����ϴ� ��
			//ie.printStackTrace();
			System.out.println("����� 0���� �������� �����");
		
		}catch(Exception e) {
			// ���� 2���� �̿��� ���ܰ� �߻��ϸ� ����Ǵ� ��
			System.out.println("Exception �߻�!");
			System.out.println("���� ����:"+e.getMessage());
			e.printStackTrace();
		}finally {
			// ���ܰ� �߻��ϴ� ���ϴ� �ݵ��� ������ ����Ǵ� ��
			System.out.println("������ �۾��� �մϴ�.");
		}
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}








