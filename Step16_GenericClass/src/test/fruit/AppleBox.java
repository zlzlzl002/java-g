package test.fruit;

public class AppleBox {
	//�ɹ��ʵ� 
	private Apple item;
	//��ü�� �����ϴ� �޼ҵ�
	public void push(Apple item) {
		this.item=item;
	}
	//��ü�� �������ִ� �޼ҵ�
	public Apple pull() {
		return item;
	}
}
