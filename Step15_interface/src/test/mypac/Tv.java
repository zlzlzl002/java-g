package test.mypac;
/*
 *  필드는 final 만사용가능 all 대문자
 * 	메소드는 추상(abstract) 만 사용 가능하다
 * 	data type 을 갖는다
 *  new 할수없다 
 *  참조값을 사용하려면 implements 객체를 생성해서 해야된다
 */

public interface Tv {
	// 필드 final 
	public String NAME="LG";
	public static final int NUM=16;
	
	// 추상화 메소드
	public void show();
	public abstract void news();
}
