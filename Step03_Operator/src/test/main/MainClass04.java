package test.main;
/*
 *  [ ������ ]
 *  
 *  4. �� ������
 *  
 *  - boolean type �����͸� ���� �� �ִ� ������ �̴�.
 *  
 * || : or ����, �������� ����, ��� �ϳ��� true �̸� ����� true
 * && : and ����, �������� ����, ��� true �϶� ����� true
 * !  : not ����, boolean ���� ������Ų��. 
 *      true => false, false => true 
 */
public class MainClass04 {
	public static void main(String[] args) {
		//or ����
		boolean result1 = false || false; //false
		boolean result2 = false || true; //true
		boolean result3 = true || false; //true
		boolean result4 = true || true; //true
		
		//and ����
		boolean result5 = false && false; //false
		boolean result6 = false && true; //false
		boolean result7 = true && false; //false
		boolean result8 = true && true; //true	
		
		//not ����
		boolean result9 = !true;
		boolean result19 = !false;
		
		boolean isRun=false;
		if(isRun != true){
			System.out.println("�޸��� �ʾƿ�");
		}
		
		if(!isRun){
			System.out.println("�޸��� �ʾƿ�2");
		}
	}
}







