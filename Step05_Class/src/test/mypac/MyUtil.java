package test.mypac;

public class MyUtil {
	// static ��� �ʵ� �����ϱ�
	public static String version="v2.0";
	
	public static void sendMessage() {
		System.out.println("�޼����� �����մϴ�.");
	}
	
	public static void screenCapture() {
		System.out.println("ȭ���� ĸ�� �մϴ�.");
	}
	
	/*					�� �˾Ƶα�!!!!!!!!!!!!!
	 *	static			    stack	heap
	 *	class			         ��������	��ü(field:�����/method:���)
	 *	static field method			new �Ҷ����� �������� ��ü ����
	 *	class�� ����1����  �ö�     		�������� �̿��Ѵ�. 
	 *	�ΰ��� Ŭ������ ����.			
	 *	ex) MyUtil.version          ex) ������.name
	 *		class. ���� 
	 */
	
	/*
	 *  java data type
	 *  [�⺻ ������ type]
	 *  byte short int long float double char boolean
	 *  
	 *  ex) int num=10; ������ �ƴ� value �� 10
	 *  
	 *  [heap ������ ��ü (����)type]
	 *  String Car Computer
	 *  
	 *  Car c = new Car(); value��x �������̴�
	 *  String s="abcd" == String s2= new String();
	 *  s�� value���̾ƴ� �������� ����
	 * 
	 */
}
