package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// �޼ҵ� ���ο����� Ŭ������ �����Ҽ� �ִ�.
		// Local Inner Class
		class Gura{
			public void say() {
				System.out.println("�ȳ� ���� Gura ��~");
			}
		}
		
		Gura g=new Gura();
		g.say();
		
	}
}
