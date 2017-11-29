package example1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/*
 *  [ Socket ���� ���α׷� �ۼ� ����]
 *  
 *  1. ServerSocket ��ü�� �����Ѵ�. (port ��ȣ �ʿ�)
 *  2. Ŭ���̾�Ʈ�� ������ ��ٸ��� �ִٰ� ������ ���� �̸� �޾Ƶ��δ�.
 *  3. ��ȯ�� Socket ��ü�� Ŭ���̾�Ʈ�� ����� �ϰ� ServerSocket ��ü��
 *     �ٽ� �ٸ� Ŭ���̾�Ʈ�� ������ ��ٸ���.
 *  4. Ŭ���̾�Ʈ�� ������ ���� �Ϸ��� Socket ��ü�� �ݾ��ش�. 
 */
public class ServerMain {
	public static void main(String[] args) {
		// �ʿ��� ��ü�� ������ ���� �����
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			// 5000�� port ���� Ŭ���̾�Ʈ�� ���� ������
			// ��ٸ� ServerSocket ��ü
			serverSocket = new ServerSocket(5000);
			while (true) { // ����
				System.out.println("���� �����...");
				socket = serverSocket.accept(); // ������� Ư�� Ŭ���̾�Ʈ�� 5000�� ��Ʈ�� �����ϱ������� 
				// ���ӵ� Ŭ���̾�Ʈ�� ip �ּ�
				String clientIp = socket.getInetAddress().getHostAddress();
				System.out.println("clientIp:" + clientIp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (serverSocket != null)
					serverSocket.close();
				if (socket != null)
					socket.close();
			} catch (Exception e) {
			}
		}
	}

}
