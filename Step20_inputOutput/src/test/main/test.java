package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class test {
	/*
	 *  Ű����� ���� �Ѱ��� ���� �ڵ带 �Է� �޾Ƽ� �ֿܼ� ����غ���
	 * 	InputStream �ѱ� ó�� �ȵ�
	 */
	// Ű����� ���� �Է¹����� �ִ�
	// ��ü�� ������ ���ͼ� ������ ���
	public static void main(String[] args) {
		InputStream is=System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("�Է��� ���ڿ�:");
		try {
			String str=br.readLine();
			System.out.println("str:"+str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
