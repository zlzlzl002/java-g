package test.main;

import test.mypac.Car;  // car class
import test.mypac.Gura; // gura class

/*
 *  [ *Ŭ������ ����]
 *  
 *  1. static �ɹ��� ������ �ִ� ����
 *  2. (heap)������ ��ü�������� ���赵 ����        
 *  (��ü��  �����(field)=���� ���ϴ¹�:key.field  
 *  ���(method)=ȣ�� 		    ���ϴ¹�:key.method �����ִ�.)
 *  3. Data Type ����    class���� ������� ��ü  type�̴�
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		// Car Type ��ü�� �������� ���� �������� ����� 
		Car car1=null;
		// car Heap ���� ��ü�� �����ϰ� �������� ������ �����ϱ�
		car1=new Car(); // car type key ���� ������ �ִ�.
		
		// Gura Type ��ü�� �������� ���� �������� ����� 
		Gura gura1=null; // class���� ��data type
		// gura ��ü�� �����ϰ� �������� ������ �����ϱ�
		gura1=new Gura();  // new class��()�� key  id�� ����
		
		String  b = gura1.name;
		int c = gura1.num;
		gura1.rlsmd();
		// car1. method ����� ���´�
		
		// ��ü�� �ʵ� ����
		//String a = car1.name;  // �������� a  �ҳ�Ÿ 
		System.out.println(car1.name);
		// ��ü�� �޼ҵ� ȣ��
		car1.drive();
	}
}
