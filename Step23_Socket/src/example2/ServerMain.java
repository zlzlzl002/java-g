package example2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
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
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// 5000 �� port ���� Ŭ���̾�Ʈ�� ������ ��ٸ���.
			serverSocket = new ServerSocket(5000);
			System.out.println("Ŭ���̾�Ʈ�� Socket ���� ��û�� �����...");
			while (true) {
				// �����û�� �ؿ��� Ŭ���̾�Ʈ�� ����� Socket type ��ü�� �������� ���ϵȴ�.
				socket = serverSocket.accept();
				// ���ӵ� Ŭ���̾�Ʈ�� ip �ּ� ������
				String clientIp = socket.getInetAddress().getHostAddress();
				System.out.println("clientIp:" + clientIp);
				// Socket �� ���ؼ� �Է� ������ �ִ� ��Ʈ�� ��ü ������
				is = socket.getInputStream();  // �޼ҵ带 ���ؼ�
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				// Ŭ���̾�Ʈ�� ������ ���ڿ��� �ٴ����� �о�´�.
				String msg = br.readLine();
				System.out.println("msg:" + msg);
			}
		} catch (Exception e) {
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
		System.out.println("Server main() �޼ҵ尡 ���� �˴ϴ�. ");
	}

}
