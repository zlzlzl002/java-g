package test.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 	[ InputStreamReader ] 
 * 	
 * 	- 문자열을 읽어들일때 사용한다.
 * 	- 2 byte 처리 스트림
 * 	- 한글을 포함한 모든 문자 1글자를 처리할수 있다.
 */
public class test {
	public static void main(String[] args) {
		  if (args.length == 0) {                   // args.length 는 옵션 개수
			     System.err.println("Input Filename...");
			     System.exit(1);                         // 읽을 파일명을 주지 않았을 때는 종료
		  }
		  try {
		      ////////////////////////////////////////////////////////////////
		      BufferedReader in = new BufferedReader(new FileReader(args[0]));
		      String s;

		      while ((s = in.readLine()) != null) {
		        System.out.println(s);
		      }
		      in.close();
		      ////////////////////////////////////////////////////////////////
		    } catch (IOException e) {
		        System.err.println(e); // 에러가 있다면 메시지 출력
		        System.exit(1);
		    }


	}

}
