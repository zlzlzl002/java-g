import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		// System.in 키보드로부터 입력받은 객체
		// Scanner 객체 생성해서
		Scanner scan=new Scanner(System.in);
		
		System.out.print("입력:");
		// 문자열 입력 받기
		String msg=scan.nextLine(); // 실행은 여기서 멈춘다   
		
		System.out.println("msg:"+msg);
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
