package test.main;
/*
 *  [ ������ ]
 *  
 *  1. ��� ������
 *  
 *  - ���� : +, -, *, /, %
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num1=5;
		int num2=2;
		
		// + �����ڸ� �̿��ؼ� �μ��� �� ���ϱ�
		int sum = 10 + 1;
		int sum2 = num1 + num2;
		int sum3 = 10 + num2;
		
		// ���� / ���� => �����̹Ƿ� ��������� 
		// 5�� 3���� ���� ���� ����.
		int result1 = 5 / 3;
		// ���� / ���� => �����̹Ƿ� ��������� 
		// 5�� 2���� ���� ���� ����.
		int result2 = num1 / num2;
		
		//��Ȯ�� �Ǽ����� ���� ������ ���꿡 �����ϴ� data �� �ϳ��� 
		//double type �̸� �ȴ�. 
		double result3 = 5 / 3.0;
		double result4 = num1 / (double)num2;
		
		//num1 �� num2 �� ���� �������� ����
		int result5 = num1 % num2;
	}
}









