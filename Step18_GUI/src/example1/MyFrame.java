package example1;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//������
	public MyFrame() {
		// setBounds(x, y, width, height)
		setBounds(100, 100, 500, 500);
		// x �� ������ â�� �ݾ����� ���μ����� ���� �ǵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ ��ü�� ȭ�鿡 ���̵��� 
		setVisible(true);
	}
	
	//���� �޼ҵ�
	public static void main(String[] args) {
		//MyFrame() ��ü �����ϱ� 
		new MyFrame();
	}
}




