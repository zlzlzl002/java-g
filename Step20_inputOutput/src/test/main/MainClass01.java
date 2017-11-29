package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 * [ inputStream ] 
 * - 1byte 처리 스트림(byte 알갱이의 흐름) 2^8 or String
 * - 문자의 경우는 영문자 대소문자, 숫자, 특수문자 한글자를 읽어들일수 있다.
 * - 한글은 처리 불가
 * 
 * - inputStream    	| byte 알갱이
 * - inputStreamReader	
 * - BufferedReader		| 모든 문자열
 * - FileinputStream | 파일에서 byte 알갱이    이미지일때
 * - FileReader  |  파일 문자열 읽기  텍스트문서일때
 * - console(System.in) file(new File();) socket(socket.get(inputStream)
 */
public class MainClass01 {
	public static void main(String[] args) {
		/*
		 *  키보드로 부터 한개의 글자 코드를 입력 받아서 콘솔에 출력해보기
		 * 	InputStream 한글 처리 안됨
		 */
		// 키보드로 부터 입력받을수 있는
		// 객체의 참조값 얻어와서 변수에 담기
		InputStream is =System.in;
		
		System.out.println("한글자 입력:");
		try {
			// 입력한 키의 코드값을 받아온다.
			int keyCode=is.read(); // IOException 발생
			System.out.println("keyCode:"+keyCode);
			// 코드에 해당되는 문자를 얻어온다.
			char ch = (char)keyCode; //casting
			System.out.println("char Type 으로 변환한값:"+ch);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
