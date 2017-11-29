package test.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainClass01 {
	public static void main(String[] args) { // �ѱ��� ���ڵ� �ؼ�
		String requestUrl = "http://study.kimgura.net/members";

		// �ʿ��� ���� �����
		URL url = null;
		HttpURLConnection conn = null;
		try {
			// ��û URL ��ü ����
			url = new URL(requestUrl);
			conn = (HttpURLConnection) url.openConnection();// �ڽ� type casting
			conn.setConnectTimeout(10000);
			conn.setDoOutput(true); // �����͸� �����Ҽ� �ֵ���
			conn.setRequestMethod("GET"); // post ������� �����ϱ� ����
			conn.setDefaultUseCaches(false);
			// ������ ����Ǿ����� ���� �ڵ� �о����
			int responseCode = conn.getResponseCode(); // �ݵ��� ������Ѵ�.
			// �������� ����ϴ� ���ڿ��� ������ų ��ü
			StringBuilder builder = null;
			// ���� ������ ���������� �����ߴٸ�...
			if (responseCode == HttpURLConnection.HTTP_OK) { // HTTP 200�� ��
				builder = new StringBuilder(); // ��ü ����
				// InputStreamReader ��ü ������
				InputStreamReader isr = new InputStreamReader(conn.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				// �ݺ��� ���鼭 �о����
				while (true) {
					String line = br.readLine();
					if (line == null)
						break;
					// �о�� ���ڿ��� ��ü�� ����
					builder.append(line); // + "\r\n"
				}
				isr.close();
				br.close();
			}
			// ����� ��� ���ڿ��� String type ���� ����
			String resultMsg = builder.toString();
			// ���ڿ� ����ϱ�
			System.out.println(resultMsg);
		} catch (Exception e) { // ��� Exception �޾ƿ���
			e.printStackTrace();
		} finally {
			conn.disconnect();
		}
	}
}
