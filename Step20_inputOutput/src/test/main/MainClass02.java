package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 	[ InputStreamReader ] 
 * 	
 * 	- ���ڿ��� �о���϶� ����Ѵ�.
 * 	- 2 byte ó�� ��Ʈ��
 * 	- �ѱ��� ������ ��� ���� 1���ڸ� ó���Ҽ� �ִ�.
 * 	- OutputStream
 *  - OutputSteamWriter
 * 	- BufferedWriter
 * 	- FileOutPutStream  �̹������	
 * 	- FileWriter		���ڿ����
 * 	- �߰� objectOutputStream        
 * 	- console(System.out)	file(new File();)	socket(socket.get)
 */
public class MainClass02 {
	public static void main(String[] args) {
		// Ű����� ����� ��ü�� ������
		InputStream is =System.in;
		
		InputStreamReader isr=new InputStreamReader(is);
		
		System.out.println("�ѱ� ������ ��繮�� 1�����Է�:");
		try {
			System.out.println("�ѱ��ڸ� �Է�:");
			int keyCode=isr.read(); // �ڵ� �����ϸ� try catch �ڵ��ϼ�
			// �Է¹��� ���� �ڵ尪 ���
			System.out.println("keyCode:"+keyCode);
			// �ڵ带 char �� casting
			char ch=(char)keyCode;
			// ��ȯ�� ���� ���
			System.out.println("�Է��� ����:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
