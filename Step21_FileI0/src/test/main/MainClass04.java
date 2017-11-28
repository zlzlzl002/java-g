package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		String path="c:/myFolder/myMemo.txt";
		File file =new File(path);
		//FileWriter fw = new FileWriter(path); 문자열
		try { // text file 입력하려면 FileWriter
			FileWriter fw = new FileWriter(file);
			System.out.println("문자열 읽어오기");
			fw.write("gg\r\n");
			fw.write("두울\r\n");
			fw.write("저쩌구\r\n");
			fw.write("어쩌구\r\n");
			fw.flush();
			fw.close();
			System.out.println("myMemo.txt 에 문자열 쓰기!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
