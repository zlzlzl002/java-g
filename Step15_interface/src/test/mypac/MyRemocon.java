package test.mypac;
/*
 *  인터페이스를 구현 할때는 implements 예약어를 사용한다.
 *  여러개의 인터페이스를 구현 할수도 있다. (다중 구현 가능)
 *  인터페이스에 정의된 모든 추상메소드를 오버라이딩 해야 한다.
 */
public class MyRemocon implements Remocon {

	@Override
	public void up() { // 프로젝트 상황에 맞게 자유
		System.out.println("온도 올려줘");
		
	}

	@Override
	public void down() {
		System.out.println("온도 내려줘");
		
	}
	
}
