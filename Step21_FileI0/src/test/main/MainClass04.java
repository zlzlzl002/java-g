package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		String path="c:/myFolder/myMemo.txt";
		File file =new File(path);
		//FileWriter fw = new FileWriter(path); ���ڿ�
		try { // text file �Է��Ϸ��� FileWriter
			FileWriter fw = new FileWriter(file);
			System.out.println("���ڿ� �о����");
			fw.write("gg\r\n");
			fw.write("�ο�\r\n");
			fw.write("��¼��\r\n");
			fw.write("��¼��\r\n");
			fw.flush();
			fw.close();
			System.out.println("myMemo.txt �� ���ڿ� ����!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
