package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame{
	//�ɹ� �ʵ�� ActionListener ��ü�� ������ �����ϱ�
	ActionListener listener=new ActionListener() {
		//�����ʷ� ����� ��ü���� �̺�Ʈ�� �Ͼ�� 
		//ȣ��Ǵ� �޼ҵ� 
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("��ư�� �����׿�?");
		}
	};
	
	//������ 
	public MyFrame2() {
		initUI();
	}
	//�ʱ�ȭ �޼ҵ�
	public void initUI() {
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		//��� ��ü ����
		JPanel panel=new JPanel();
		//��ư ��ü ����
		JButton button=new JButton("��������");
		//��ư�� ActionListener ����ϱ� 
		button.addActionListener(listener); //�ʵ��:listener
		//��ư�� ��ο� �߰�
		panel.add(button);
		//����� �������� ����(����) �� ��ġ
		add(panel, BorderLayout.NORTH);
		
		// setBounds(x, y, width, height)
		setBounds(100, 100, 500, 500);
		// x �� ������ â�� �ݾ����� ���μ����� ���� �ǵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ ��ü�� ȭ�鿡 ���̵��� 
		setVisible(true);
	}
	//���� �޼ҵ� 
	public static void main(String[] args) {
		new MyFrame2();
	}
}






