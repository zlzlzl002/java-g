package test.main;

public class MainClass01 {
	
	// ���� ������ ���۵Ǵ� main �޼ҵ�
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵�");
		
		// static member method gura() ȣ���ϱ�
		/*
		 *  static �޼ҵ�� class ������ �����Ѵ�. 
		 */
		MainClass01.gura();
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
	
	//static member method �߰� 
	public static void gura() {
		System.out.println("gura �޼ҵ尡 ���۵�");
		
		System.out.println("gura �޼ҵ尡 ���� �˴ϴ�.");
	}
}




