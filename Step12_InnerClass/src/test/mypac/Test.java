package test.mypac;
/*
 *   Ŭ���� �ȿ� Ŭ������ ������ �� �ִ�.
 */
public class Test {
	
	// Gura Type ��ü�� �����ؼ� ������ �ִ� �޼ҵ� 
	public Gura getGura() {
		return new Gura();
	}
	// Monkey Type ��ü�� �����ؼ� ������ �ִ� �޼ҵ�
	public Monkey getMonkey() {
		return new Monkey();
	}
	
	//���� Ŭ���� (Inner Class)
	public class Gura{
		public void say() {
			System.out.println("�ȳ� �� �����!");
		}
	}
	//���� Ŭ����
	public class Monkey{
		public void say() {
			System.out.println("�ȳ� �� �����̾�!");
		}
	}
}
