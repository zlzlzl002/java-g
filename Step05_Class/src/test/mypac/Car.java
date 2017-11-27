package test.mypac;
/*
 *  				[ 객체 설계 ]
 */
public class Car {
	// 일반 멤버필드  
	// car 필드 정의하기  접근지정자 public > 패키지가 다를때 꼭붙
	public String name="소나타"; //  name  문자열 String
	
	// car 메소드 정의하기   static 없으면 객체의 설계도 역할을 한다 
	public void drive() { // void 어떤값도  return 안해
		
		Car a=this; // 나의 참조값은 Car type
		
		System.out.println("달려요~");
	
	}
	
	// 일반 맴버 메소드 정의하기  
	public void showInfo() {
		System.out.println("차의 이름:"+this.name);
		// this를 생략 한거임  name 김구라를 나타냄
		// System.out.println("차의 이름:"+name);
		
	}
	
	// 내가 객체가 되었을때 참조값은 this. 이다~  자신의참조값*this*
	// j $this 이벤트가 일어난 바로그요소
}
