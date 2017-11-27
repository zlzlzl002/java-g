package test.mypac;

public class Computer {
	/*
	 *  [ �ʵ�(�����) �����ϱ� ]
	 * 
	 *  1. ���� ������ ?
	 *  2. static or non static ?
	 *  3. ������ type ?
	 *  4. �ʵ� name ?
	 *  5. �ʱⰪ ? 
	 */
	
	// �ʵ忡 ��� ��¥�� ��� �ʹ�.
	public String productionDate=null;
	// �ʵ忡 Cpu ��ü�� �������� ��� �ʹ�.
	public Cpu cpu=null;
	
	/*
	 *   [ Constructor(������) �����ϱ� ]
	 *   
	 *   1. ���� ������?
	 *   2. �����ڿ� ���� �޴� ������ ������ ������ type ?
	 *   3. �����ڸ� � ��������? 
	 */
	
	//������ (Constructor) ��ü�� �����Ҷ� ȣ��Ǵ� �κ� 
	public Computer() {
		System.out.println("Computer() ȣ���");
	}
	
	// ���ڷ� String type �� ���� �޴� ������
	public Computer(String productionDate) {
		System.out.println("Computer(String ..) ȣ���");
		//�������� ���ڷ� ���޵� ���� �ɹ��ʵ忡 �����ϱ� 
		this.productionDate=productionDate;
	}
	
	
	// ���ڷ� Cpu type �� ���� �޴� ������ 
	public Computer(Cpu cpu) {
		this.cpu=cpu;
	}
	
	// ���ڷ� String type �� Cpu type �� ���� �޴� ������
	public Computer(String productionDate, Cpu cpu) {
		this.productionDate=productionDate;
		this.cpu=cpu;
	}
	
	/*
	 *  [ Method(���) �����ϱ� ]
	 *  
	 *  1. ���� ������?
	 *  2. static or non static ?
	 *  3. ���� ������ type ?
	 *  4. Method ��?
	 *  5. Method �� ���� �޴� ������ ������ ������ type ?
	 */
	public void doGame() {
		System.out.println("������ �ؿ�!");
	}
	
}

















