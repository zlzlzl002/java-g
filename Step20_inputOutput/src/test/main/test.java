package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class test {
	/*
	 *  키보드로 부터 한개의 글자 코드를 입력 받아서 콘솔에 출력해보기
	 * 	InputStream 한글 처리 안됨
	 */
	// 키보드로 부터 입력받을수 있는
	// 객체의 참조값 얻어와서 변수에 담기
	public static void main(String[] args) {
		InputStream is=System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("입력한 문자열:");
		try {
			String str=br.readLine();
			System.out.println("str:"+str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
