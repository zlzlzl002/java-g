package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass02 {
	public static void main(String[] args) throws IOException {
		String path="c:/myFolder/myMemo.txt"; // myMemo.txt �ؽ�Ʈ ���� �����
		
		// ��� ������ ������ �ִ� ���ڿ��� �������� ���ڷ�
		// �����ϸ鼭 File ��ü �����ϱ�
		File file=new File(path);
		
		
		if(file.exists()) {// ���� �����ϸ�
			// ���丮���� �������� �Ǻ�
			if(file.isDirectory()) {
				System.out.println(path+"�� �� �丮�Դϴ�.");
			}else {
				System.out.println(path+"�� ���� �Դϴ�.");
			}
		}else { // ���� ���� ���� ������
			System.out.println(path+"�� ���� ���� �ʾƿ�");
			// ���ο�  text.file 
			file.createNewFile();
			System.out.println(path+"�� �丮�� ������");
			
		}
	}
}
