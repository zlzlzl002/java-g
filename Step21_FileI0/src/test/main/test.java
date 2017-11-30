package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class test {
	public static void main(String[] args) {
		File file=new File("c:/myFolder/myImage.jpg");
		try {
			FileOutputStream fo= new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
