package example3;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) {
		// �ʿ��� ��ü�� ���� ���� �����
		Socket socket = null;
		OutputStream os = null;
		FileInputStream fis = null;
		try {
			/*
			 * new Socket("ip�ּ�", port ��ȣ)
			 * 
			 * 1. ��ü�� �����ϴ� ������ ���� ��û�̵ǰ� 2. ��ü�� �������� ���ϵǸ� Socket ������ �����Ѱ��̴�.
			 */
			socket = new Socket("192.168.0.46", 5000);
			System.out.println("Socket ���� ����!");
			fis = new FileInputStream("c:/myFolder/myImage.jpg");
			os = socket.getOutputStream();
			// byte �����͸� �о���� �迭
			byte[] buffer = new byte[1024];
			// �ݺ��� ���鼭 ���Ͽ��� �о���̰� ���ÿ� ����ϱ�
			while (true) {
				// FileInputStream ��ü�� �̿��ؼ� byte �����͸� �о���δ�.
				int readedByte = fis.read(buffer);
				// ���̻� ���� �����Ͱ� ���ٸ� �ݺ��� ���� ������
				if (readedByte == -1)
					break;
				// �о�¸�ŭ OutputStream ��ü�� ���ؼ� ����Ѵ�.
				os.write(buffer, 0, readedByte);
				os.flush();// ����
			}
			System.out.println("���� ���� ����!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null)
					os.close();
				if (fis != null)
					fis.close();
				if (socket != null)
					socket.close();
			} catch (Exception e) {
			}
		}
		System.out.println("Client main() �޼ҵ尡 ���� �˴ϴ�.");
	}
}
