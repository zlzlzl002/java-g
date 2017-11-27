import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Random ran=new Random();
		int ranNum=ran.nextInt(3);
		System.out.println(ranNum);
		
		System.out.print("°¡À§(0),¹ÙÀ§(1),º¸(2) ÀÔ·Â:");
		// Á¤¼ö ÀÔ·Â ¹Ş±â
		int inputNum=scan.nextInt();
		
		if(inputNum==0) {
			System.out.println("Âî");
		}else if(inputNum==1) {
			System.out.println("¹¬");
		}else if(inputNum==2) {
			System.out.println("ºü");
		}
		
		if(ranNum==0) {
			System.out.println("Âî");
		}else if(ranNum==1) {
			System.out.println("¹¬");
		}else if(ranNum==2) {
			System.out.println("ºü");
		}
		
		if(ranNum==inputNum) {
			System.out.println("ºñ±è");
		}
			
		System.out.println(inputNum);
	}
}
