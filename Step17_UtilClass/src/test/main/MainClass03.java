package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("�豸��");
		names.add("�ذ�");
		names.add("������");
		//List �� ���� ���� ��ŭ �ݺ��� ���鼭 
		for(int i=0; i<names.size(); i++) {
			//������� ���� �ϱ� 
			String tmp=names.get(i);
			
			System.out.println(tmp);
		}
		System.out.println("--- Ȯ��  for �� ��� ---");
		
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}











