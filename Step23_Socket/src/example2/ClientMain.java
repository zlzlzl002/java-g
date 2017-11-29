package example2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 *  [ Socket Ŭ���̾�Ʈ ���α׷� �ۼ����� ]
 *  
 *  1. Socket ��ü ����: �����ʰ� ���ÿ� ������ ���� ������ �õ���
 *     - ������ ������ ip �ּҿ�  port ��ȣ�� �ʿ��ϴ�
 *  2. Socket ��ü�� �̿��ؼ� ������ ����ϱ�
 *  3. �ʿ��� �۾��� �Ϸ����� Socket ��ü �ݾ��ֱ�
 *  �ϰ�import  ctrl sh o
 */
public class ClientMain {
	public static void main(String[] args) {
		// Scanner ��ü�� �̿��ؼ� ������ ������ ���ڿ��� �Է� �޴´�.
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ������ �޼��� �Է�:");
		String msg = scan.next();
		
		// �ʿ��� ��ü�� ���� ���� �����
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			/*
			 * new Socket("ip�ּ�", port ��ȣ)
			 * 
			 * 1. ��ü�� �����ϴ� ������ ���� ��û�̵ǰ� 2. ��ü�� �������� ���ϵǸ� Socket ������ �����Ѱ��̴�.
			 */
			socket = new Socket("192.168.0.10", 5000);
			System.out.println("Socket ���� ����!");
			// Socket �� �̿��ؼ� ����Ҽ��ִ� ��Ʈ�� ��ü ������
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);

			bw.write(msg); // ���ڿ��� ���
			bw.newLine(); // �����ȣ ���  \r\n
			bw.flush(); // ���� ( �о�� )

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null)
					os.close();
				if (osw != null)
					osw.close();
				if (bw != null)
					bw.close();
				if (socket != null)
					socket.close();
			} catch (Exception e) {
			}
		}
		System.out.println("Client main() �޼ҵ尡 ���� �˴ϴ�.");
	}
}
