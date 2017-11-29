package example3;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		// �ʿ��� ��ü�� ������ ���� �����
		ServerSocket serverSocket = null;
		try {
			// 5000 �� port ���� Ŭ���̾�Ʈ�� ������ ��ٸ���.
			serverSocket = new ServerSocket(5000);
			System.out.println("Ŭ���̾�Ʈ�� Socket ���� ��û�� �����...");
			while (true) {
				// �����û�� �ؿ��� Ŭ���̾�Ʈ�� ����� Socket ��ü�� �������� ���ϵȴ�.
				Socket socket = serverSocket.accept();

				// !! FileDownThread ��ü�� �����ϰ� start() �޼ҵ带 ȣ���ؼ�
				// ���ο� �����带 ���� ��Ų��.
				new FileDownThread(socket).start(); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (serverSocket != null)
					serverSocket.close();
			} catch (Exception e) {
			}
		}
		System.out.println("Server main() �޼ҵ尡 ���� �˴ϴ�. ");
	}
}
