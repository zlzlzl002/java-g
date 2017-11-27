package test.mypac;

public class MyUtil {
	// static 멤버 필드 정의하기
	public static String version="v2.0";
	
	public static void sendMessage() {
		System.out.println("메세지를 전송합니다.");
	}
	
	public static void screenCapture() {
		System.out.println("화면을 캡쳐 합니다.");
	}
	
	/*					꼭 알아두기!!!!!!!!!!!!!
	 *	static			    stack	heap
	 *	class			         지역변수	객체(field:저장소/method:기능)
	 *	static field method			new 할때마다 여러개의 객체 생성
	 *	class당 오직1개만  올라감     		참조값을 이용한다. 
	 *	두개의 클래스는 없다.			
	 *	ex) MyUtil.version          ex) 참조값.name
	 *		class. 접근 
	 */
	
	/*
	 *  java data type
	 *  [기본 데이터 type]
	 *  byte short int long float double char boolean
	 *  
	 *  ex) int num=10; 참조값 아닌 value 값 10
	 *  
	 *  [heap 영역의 개체 (참조)type]
	 *  String Car Computer
	 *  
	 *  Car c = new Car(); value값x 참조값이다
	 *  String s="abcd" == String s2= new String();
	 *  s에 value값이아닌 참조값이 들어간다
	 * 
	 */
}
