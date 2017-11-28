package test.main;

import java.awt.List;
import java.io.File;

public class MainClass03 {
	public static void main(String[] args) {
		String path="c:/ncs09";
		File file = new File(path);
		// list() 메소드를 이용해서 디렉토리 와 파일 목록을
		// String[] 으로 얻어온다.
		String[] names=file.list();
		for(String tmp:names) {
			System.out.println(tmp);
		}
		System.out.println("-------------");
		// 디렉토리 혹은 파일을 access 할수 있는 File 객체가 담겨 있는
		// File[] 객체 얻어오기.
		File[] files=file.listFiles();
		for(File tmp:files) {
			String name=tmp.getName();
			if(tmp.isDirectory()) {
				System.out.println("[D]"+name);
			}else {
				System.out.println(name);
			}
		}
		
	}
}
