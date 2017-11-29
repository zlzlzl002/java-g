package example1;

import java.net.Socket;
/*
 *  [ Socket Ŭ���̾�Ʈ ���α׷� �ۼ����� ]
 *  
 *  1. Socket ��ü ����: �����ʰ� ���ÿ� ������ ���� ������ �õ���
 *     - ������ ������ ip �ּҿ�  port ��ȣ�� �ʿ��ϴ�
 *  2. Socket ��ü�� �̿��ؼ� ������ ����ϱ�
 *  3. �ʿ��� �۾��� �Ϸ����� Socket ��ü �ݾ��ֱ�
 */
public class ClientMain {
	public static void main(String[] args) {
		Socket socket=null;
		try {
			// new Socket("����ip", ��Ʈ��ȣ)
			socket= new Socket("192.168.0.10", 5000);
			System.out.println("���� ����");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket!=null)socket.close();
			}catch(Exception e) {}
		}
		System.out.println("client main() �޼ҵ尡 ����");
	}
}
