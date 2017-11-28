package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass05 {
	public static void main(String[] args) {
		File file=new File("c:/myFolder/myMemo.txt");
		try {
			// FileReader 객체생성
			FileReader fr =new FileReader(file);
			// BufferedReader 객체 생성
			BufferedReader br =new BufferedReader(fr);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
