package test.main;

import java.awt.List;
import java.io.File;

public class MainClass03 {
	public static void main(String[] args) {
		String path="c:/ncs09";
		File file = new File(path);
		// list() �޼ҵ带 �̿��ؼ� ���丮 �� ���� �����
		// String[] ���� ���´�.
		String[] names=file.list();
		for(String tmp:names) {
			System.out.println(tmp);
		}
		System.out.println("-------------");
		// ���丮 Ȥ�� ������ access �Ҽ� �ִ� File ��ü�� ��� �ִ�
		// File[] ��ü ������.
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
