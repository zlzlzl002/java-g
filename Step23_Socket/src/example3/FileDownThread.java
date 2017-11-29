package example3;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

/*
 *  ������ �ٿ�ε��� ������
 */
public class FileDownThread extends Thread {
	// �ʵ�
	private Socket socket;

	// ������
	public FileDownThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// �ʿ��� ��ü�� �������� ���� ���� �����
		InputStream is = null;
		FileOutputStream fos = null;
		try {
			// ������ ������ Ŭ���̾�Ʈ�� ip �ּ�
			String ip = socket.getInetAddress().getHostAddress();
			// ������ ������ ��ο� ���ϸ� ���ϱ�
			String path = "c:/myFolder/" + ip + "image.jpg";
			// �ʿ��� ��ü�� ������ ������
			is = socket.getInputStream();     // ��
			fos = new FileOutputStream(path); // ��
			// byte �����͸� ���� �迭
			byte[] buffer = new byte[1024];
			// �ݺ��� ���鼭 ���޵� �����͸� �о���δ�.
			while (true) {
				int readedByte = is.read(buffer);
				if (readedByte == -1)
					break;
				// �о���� ��ŭ ���Ͽ� ����ϱ�
				fos.write(buffer, 0, readedByte);
				fos.flush();
			}
			System.out.println(ip + " ���� ������ ���� ���强��");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
				if (fos != null)
					fos.close();
				if (socket != null)
					socket.close();
			} catch (Exception e) {
			}
		}
		System.out.println("���ο� �����尡 ���� �˴ϴ�.");
	}
}
