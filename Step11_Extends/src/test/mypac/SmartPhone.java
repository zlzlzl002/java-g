package test.mypac;

public class SmartPhone extends HandPhone{
	public SmartPhone() {
		System.out.println("SmartPhone() ������ ȣ���");
	}
	
	public void doInternet() {
		System.out.println("���ͳ��� �ؿ�!");
	}
	//���� ��� �޼ҵ� ������ �ϱ�
	@Override
	public void takePicture() {
		System.out.println("1000 �� ȭ���� ������ ����");
	}
}









