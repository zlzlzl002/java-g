package test.main;

import java.io.File;

public class MainClass01 {
	public static void main(String[] args) {
		String path="c:/myFolder";
		
		// 경로 정보를 가지고 있는 문자열을 생성자의 인자로
		// 전달하면서 File 객체 생성하기
		File file=new File(path);
		
		if(file.exists()) {// 파일 존재하면
			// 디렉토리인지 파일인지 판별
			if(file.isDirectory()) {
				System.out.println(path+"는 디렉 토리입니다.");
			}else {
				System.out.println(path+"는 파일 입니다.");
			}
		}else { // 파일 존재 하지 않으면
			System.out.println(path+"는 존재 하지 않아요");
			// 디렉토리 만들기
			file.mkdirs();
			System.out.println(path+"디렉 토리를 생성함");
		}
	}
}
