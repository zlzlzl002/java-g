package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		// Random �� ���� ���� �ִ� Random ��ü ����
		Random ran=new Random();
		
		/*
		 *  1. int �� �����Ҽ� �ִ� �� 5 ��¥�� int[] ��ü�� 
		 *  
		 *  �����ؼ� 0~9 ������ ������ ������ ���� ������ ������.
		 	
		 	- hint 
		 	
		 	int ranNum=ran.nextInt(10);
		 */
		
		//������ ���ڸ� ������ int[] ��ü ���� 
		int[] nums=new int[5];
		
		//�迭�� ���� ������ŭ �ݺ��� ���� 
		for(int i=0; i<nums.length; i++) {
			//0~9 ������ ������ ���� ����
			int ranNum=ran.nextInt(10);
			// i ��° �濡 �����ϱ�
			nums[i]=ranNum;
		}
		
		System.out.println("���� �޼ҵ尡 ���� �˴ϴ�.");
	}
}














