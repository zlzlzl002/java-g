package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {
	public static void main(String[] args) {
		//String type �� ������ �ִ� ArrayList ��ü ����
		List<String> msgs=new ArrayList<String>();
		// .add() ������ �߰� 
		msgs.add("�ϳ�");
		msgs.add("�ο�");
		msgs.add("����");
		// int type �� ������ �ִ� ArrayList ��ü ����
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		// .get(index) ������ ���� 
		String a=msgs.get(0);
		String b=msgs.get(1);
		String c=msgs.get(2);		
	}
}




















