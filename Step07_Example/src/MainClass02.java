import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		// System.in Ű����κ��� �Է¹��� ��ü
		// Scanner ��ü �����ؼ�
		Scanner scan=new Scanner(System.in);
		
		System.out.print("�Է�:");
		// ���ڿ� �Է� �ޱ�
		String msg=scan.nextLine(); // ������ ���⼭ �����   
		
		System.out.println("msg:"+msg);
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}
