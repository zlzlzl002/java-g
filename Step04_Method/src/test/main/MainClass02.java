package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//showMsg() �޼ҵ带 ȣ���� ������~
		MainClass02.showMsg("hello~");
		
		String str="�ȳ��ϼ���";
		MainClass02.showMsg(str);
		
		//��Ȳ�� ���� null �� �����ϴ� ��쵵 �ִ�. 
		MainClass02.showMsg(null);
	}
	
	//static �ɹ� �޼ҵ�
	public static void showMsg(String msg) {
		System.out.println("msg:"+msg);
	}
}












