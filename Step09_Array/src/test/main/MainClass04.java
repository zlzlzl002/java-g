package test.main;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Car type �� ������ �ִ� �� 3��¥�� �迭��ü�� 
		//   �����ؼ� �������� cars ��� ������ ��� ������.
		Car[] cars=new Car[3];
		//2. Car ��ü�� �����ϵ� �������� ���ڷ� 
		//   "�ҳ�Ÿ", "�ƹݶ�", "�����̵�" �� ���� �����ؼ� 
		//   ��ü�� �����ؼ� cars �迭�� 0���� 1���� 2���濡 
		//   ���� ��� ������.
		cars[0] = new Car("�ҳ�Ÿ");
		cars[1] = new Car("�ƹݶ�");
		cars[2] = new Car("�����̵�");
		
		//3. �迭�� ����� Car ��ü�� �������� �̿��ؼ� 
		//   drive() �޼ҵ带 ���� ȣ���� ������.
		cars[0].drive();
		cars[1].drive();
		cars[2].drive();
		
		Car[] cars2={new Car("A"), new Car("B"), new Car("C")};
		cars2[0].drive();
		cars2[1].drive();
		cars2[2].drive();
	
	}
}















