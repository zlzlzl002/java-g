package test.main;

import test.mypac.Calculator;

public class MainClass04 {
	public static void main(String[] args) {

		Calculator add1 = new Calculator() {
			@Override
			public int calc(int num1, int num2) {

				return num1 + num2;
			}
		};

		// 위내용 간략하게
		Calculator add2 = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		// 위내용 간략하게  interface 추상 메소드가 1개일때만 가능하다 람다식
		Calculator add3 = (num1, num2) -> num1 + num2; // 수행할 java 코드가 한줄이면 이렇게 쓸수있다.

		int result1 = add1.calc(10, 20);
		int result2 = add2.calc(10, 20);
		int result3 = add3.calc(10, 20);
		

		System.out.println("result:" + result1);
		System.out.println("result:" + result2);
		System.out.println("result:" + result3);
	}

}
