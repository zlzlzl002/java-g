package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass06 {
	public static void main(String[] args) {
		
		// �����迭 array Generic
		List<String> names= new ArrayList<>();
		names.add("�豸��");
		names.add("�ذ�");
		names.add("������");
		names.add("�ֵ���");
		names.add("���");
		
		for(String tmp:names) {
			System.out.println(tmp);
		}
		System.out.println("-------------------");
		
		names.forEach((tmp)->{ // forEach ����� �޼ҵ带 ���޹޴� ����?
			System.err.println(tmp);
		});
	}
}
