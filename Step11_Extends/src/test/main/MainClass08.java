package test.main;

import test.auto.Car;
import test.auto.Sedan;

public class MainClass08 {
	public static void main(String[] args) {
		Sedan car1=new Sedan();
		// �������̵� �� �޼ҵ� ȣ���� ���� 
		car1.drive();
		// Sedan ��ü�� useCar() �޼ҵ��� ���ڷ� ������ ����
		useCar(car1);
	}
	
	public static void useCar(Car car) {
		car.startEngine();
		car.drive();
	}
}






