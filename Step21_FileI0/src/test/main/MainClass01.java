package test.main;

import java.io.File;

public class MainClass01 {
	public static void main(String[] args) {
		String path="c:/myFolder";
		
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
			// ���丮 �����
			file.mkdirs();
			System.out.println(path+"�� �丮�� ������");
		}
	}
}
