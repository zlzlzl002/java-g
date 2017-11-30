package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		// myimage ���纻 �����  byte ũ�⸦  byte[] �о�ü� �ִ�.
		//�ʿ��� ��ü�� ���� ���� �����
		FileInputStream fis=null;
		FileOutputStream fos=null;
	
		try {
			//�ʿ��� ��ü�� �����ؼ� ������ ������ �����ϱ� 
			// file byte �о���̱�
			fis=new FileInputStream("c:/myFolder/myImage.jpg");
			// file byte ����ϱ�
			fos=new FileOutputStream("c:/myFolder/copiedImage.jpg");
			
			//�ѹ��� �о�� byte �� ũ�⸦ ����ؼ� byte[] ��ü �����ϱ�
			byte[] buffer=new byte[1000];
			while(true){
				//buffer ��ü�� �̿��ؼ� byte �˰��̸� �о���δ�.  key�� ����
				int readedCount=fis.read(buffer);
				//���̻� ���� byte �˰��̰� ���ٸ� �ݺ��� Ż�� 
				if(readedCount== -1)break;  // -1 �ַ� return ������ ���ٸ� | ��ü�� �ַ� null return ���ش�.
				//buffer ��ü�� ����� byte �˰��̸� ���� ��ŭ ��� ���Ͽ� ����Ѵ�.
				fos.write(buffer, 0, readedCount); // 0�������
				fos.flush();//����
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//������ �ݵ��� ����Ǵ� ������ ������ �۾��� �Ұ� ������ �Ѵ�. 
			try { // file fos.close �ҽ����� ���������.
				fos.close();
				fis.close();//�ݾ��ֱ� 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
