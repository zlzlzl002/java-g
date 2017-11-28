package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 *  �߿�! ����
 */
public class MainClass06 {
	public static void main(String[] args) {
		File file=new File("c:/myFolder/myMemo.txt");
		FileReader fr= null;
		BufferedReader br = null;
		try { // try ���� Exception
			// FileReader ��ü����
			fr =new FileReader(file);
			// BufferedReader ��ü ����
			br = new BufferedReader(fr);
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
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}finally { 
			// ������ �۾� Exception br.close 
			try {
				// null �� �ƴ� ��쿡 �޼ҵ带 ȣ���ϴ� ����
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}
}
