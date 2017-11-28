package test.main;

import test.mypac.AnotherThread;
import test.mypac.MyThread;
/*
 *  [ Thread (작업단위) 만들기 ]
 *  
 *  (방법1)
 *  
 *  1. Thread 클래스를 상속받은 클래스를 정의한다.
 *  2. run() 메소드를 오버라이딩한다.
 *  3. 새로운 작업단위가 필요한 시점에 클래스를 이용해서 객체를 생성하고
 *     start() 라는 메소드를 호출하면 스레드가 시작된다. 
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 실행의 흐름 Thread 이다.       mainThread
		// 멀티Thread 동시에 작업 하진 않는다.
		System.out.println("main 메소드가 시작 되었습니다.");
		// 새로운 작업단위 시작 시키기 
		new AnotherThread().start(); // start 하면 (run 메소드)호출과 동시에 바로 return
		//new AnotherThread().run();
		doSomething();
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
	
	public static void doSomething() {
		System.out.println("메인 스레드가 5초 일시 정지 되요~");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("doSomething() 가 리턴 됩니다.");
	}
}
