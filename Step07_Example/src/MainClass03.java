import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Random ran=new Random();
		int ranNum=ran.nextInt(3);
		System.out.println(ranNum);
		
		System.out.print("����(0),����(1),��(2) �Է�:");
		// ���� �Է� �ޱ�
		int inputNum=scan.nextInt();
		
		if(inputNum==0) {
			System.out.println("��");
		}else if(inputNum==1) {
			System.out.println("��");
		}else if(inputNum==2) {
			System.out.println("��");
		}
		
		if(ranNum==0) {
			System.out.println("��");
		}else if(ranNum==1) {
			System.out.println("��");
		}else if(ranNum==2) {
			System.out.println("��");
		}
		
		if(ranNum==inputNum) {
			System.out.println("���");
		}
			
		System.out.println(inputNum);
	}
}
