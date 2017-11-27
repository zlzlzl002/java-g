import java.util.Random;

public class MainClass01 {
	public static void main(String[] args) {
		// java util 페키지에 있는 Random 클래스 import 해서
		// 객체 생성후 참고값을 ran 이라는 지역변수에 담는다.
		Random	ran=new Random();
		
		// int 범위 내에서 랜덤한 정수 얻어내기
		//int ranNum=ran.nextInt();
		
		// 0~9 범위 내에서 랜덤한 정수
		//int ranNum=ran.nextInt(10);
		
		// 1~45 범위 내에서의 랜덤한 정수
		int ranNum=ran.nextInt(45)+1;
		
		// 출력해 보기
		System.out.println(ranNum);
		
	}
}
      //  로또번호 
		