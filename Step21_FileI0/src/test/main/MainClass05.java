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
			// FileReader ��ü����
			FileReader fr =new FileReader(file);
			// BufferedReader ��ü ����
			BufferedReader br =new BufferedReader(fr);
			// �ݺ��� ���鼭 ���پ� �о� ���δ�.
			while(true) {
				String line=br.readLine();
				// ���̻� ���� ���ڿ��� ������ null �� ���ϵȴ�.
				if(line==null) {
					break; // �ݺ��� Ż��
				}
				// ���� ���� �ֿܼ� ����غ���
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
