package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 * [ inputStream ] 
 * - 1byte ó�� ��Ʈ��(byte �˰����� �帧) 2^8
 * - ������ ���� ������ ��ҹ���, ����, Ư������ �ѱ��ڸ� �о���ϼ� �ִ�.
 * - �ѱ��� ó�� �Ұ�
 * 
 * - inputStream
 * - FileinputStream
 * - FileReader
 * - inputStreamReader
 * - BufferedReader
 */
public class MainClass01 {
	public static void main(String[] args) {
		/*
		 *  Ű����� ���� �Ѱ��� ���� �ڵ带 �Է� �޾Ƽ� �ֿܼ� ����غ���
		 * 	InputStream �ѱ� ó�� �ȵ�
		 */
		// Ű����� ���� �Է¹����� �ִ�
		// ��ü�� ������ ���ͼ� ������ ���
		InputStream is =System.in;
		
		System.out.println("�ѱ��� �Է�:");
		try {
			// �Է��� Ű�� �ڵ尪�� �޾ƿ´�.
			int keyCode=is.read(); // IOException �߻�
			System.out.println("keyCode:"+keyCode);
			// �ڵ忡 �ش�Ǵ� ���ڸ� ���´�.
			char ch = (char)keyCode; //casting
			System.out.println("char Type ���� ��ȯ�Ѱ�:"+ch);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
