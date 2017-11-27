package test.mypac;
/*
 *  [Interface]
 *  
 *  - 생성자가 없다 (단독 객체 생성불가)
 *  - 구현된 멤버 메소드는 가질수 없다 (추상 메소드만 가질수 있다)
 *  - 맴버필드는 static final(변경불가) 맴버필드만 가질수 있다.
 *  - data type 의 역할을 할수 있다.
 *  - 인터페이스 type 의 참조값이 필요하면 구현(implements) 클래스 를
 *    만들어서 객체를 생성 해야 한다.
 */
public interface Computer {
	// 필드 정의
	public static final int WINDOW=10;
	public String BR="LG";
	
	// 메소드 정의하기 추상
	public abstract void up();
	public void down();
}
