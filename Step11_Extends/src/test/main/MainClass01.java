package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
/*
 *  [ extends ��� ]
 *  
 *  1. Ŭ������ ��� �޴� ���� �н�
 *  2. ��ӹ��� Ŭ������ �̿��ؼ� ��ü ���������� �������� 
 *     �޾� �ټ� �ִ� �پ��� type �н�
 *  3. ����ȯ(casting) �������� Ȱ��
 *  4. �ڽ� �����ڿ��� �θ� �����ڿ� ���� �����ϴ� ���
 *  5. �޼ҵ� �������̵�(������) �ϴ� ���
 *  6. �������̵� �� �޼ҵ忡�� �θ�ü�� �޼ҵ带 ȣ���ϴ� ���
 */
public class MainClass01 {
	public static void main(String[] args) {
		Phone p1=new Phone();
		p1.call();
		System.out.println("--------");
		
		HandPhone p2=new HandPhone();
		p2.call();
		p2.mobileCall();
		p2.takePicture();
	}
}






