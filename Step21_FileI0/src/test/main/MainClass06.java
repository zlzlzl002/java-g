package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 *  중요! 구조
 */
public class MainClass06 {
	public static void main(String[] args) {
		File file=new File("c:/myFolder/myMemo.txt");
		FileReader fr= null;
		BufferedReader br = null;
		try { // try 에서 Exception
			// FileReader 객체생성
			fr =new FileReader(file);
			// BufferedReader 객체 생성
			br = new BufferedReader(fr);
			// 반복문 돌면서 한줄씩 읽어 들인다.
			while(true) {
				String line=br.readLine();
				// 더이상 읽을 문자열이 없으면 null 이 리턴된다.
				if(line==null) {
					break; // 반복문 탈출
				}
				// 읽은 내용 콘솔에 출력해보기
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}finally { 
			// 마무리 작업 Exception br.close 
			try {
				// null 이 아닌 경우에 메소드를 호출하는 구조
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}
}
