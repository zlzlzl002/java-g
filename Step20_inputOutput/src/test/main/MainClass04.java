package test.main;

import java.io.IOException;
import java.io.OutputStream;

public class MainClass04 {
	public static void main(String[] args) throws IOException {
		// �ֿܼ� ����Ҽ� �ִ� OutputStream ��ü�� ������
		OutputStream os =System.out;
		// ����� �غ�
		os.write(97);
		os.write(98);
		os.write(99);
		os.write(100);
		
		
		// �����ؼ� ����ϱ�
		os.flush();
		
		byte[] buffer= {65,66,67,68};
		// byte[] ��ü�� ����� �غ�
		os.write(buffer);
		// ��� 
		os.flush();
		// ��Ʈ�� �ݱ�
		os.close();
		
		// ���� ���Ŀ��� ��� �Ұ�
		os.write(69);
		
		// System Ŭ������ out �̶�� �ʵ忡 �ִ� ��Ʈ����
		// �ݾұ� ������ ����� �ȵȴ�.
		System.out.println("���� �޼ҵ尡 ����");
	}
}
