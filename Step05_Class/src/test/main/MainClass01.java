package test.main;

import test.mypac.Car;  // car class
import test.mypac.Gura; // gura class

/*
 *  [ *클래스의 역할]
 *  
 *  1. static 맴버를 가지고 있는 역할
 *  2. (heap)영역에 객체지향언어의 설계도 역할        
 *  (객체는  저장소(field)=참조 콜하는법:key.field  
 *  기능(method)=호출 		    콜하는법:key.method 갖고있다.)
 *  3. Data Type 역할    class명이 만들어진 객체  type이다
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// Car Type 객체의 참조값을 담을 지역변수 만들기 
		Car car1=null;
		// car Heap 영역 객체를 생성하고 참조값을 변수에 대입하기
		car1=new Car(); // car type key 값만 담을수 있다.
		
		// Gura Type 객체의 참조값을 담을 지역변수 만들기 
		Gura gura1=null; // class명이 곧data type
		// gura 객체를 생성하고 참조값을 변수에 대입하기
		gura1=new Gura();  // new class명()는 key  id값 참조
		
		String  b = gura1.name;
		int c = gura1.num;
		gura1.rlsmd();
		// car1. method 목록이 나온다
		
		// 객체의 필드 참조
		//String a = car1.name;  // 지역변수 a  소나타 
		System.out.println(car1.name);
		// 객체의 메소드 호출
		car1.drive();
	}
}
