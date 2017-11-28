package test.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame implements ActionListener {

	// ������
	public MyFrame2() {
		initUI();
	}

	// �ʱ�ȭ �޼ҵ�
	public void initUI() {
		// ���̾ƿ� ����
		setLayout(new BorderLayout());
		// ��� ��ü ����
		JPanel panel = new JPanel();
		// ��ư ��ü ����
		JButton button = new JButton("�˸�����");
		JButton downbtn = new JButton("�ٿ�ε�");
		// ��ư�� ActionListener ����ϱ�
		button.addActionListener(this); // �ʵ��:listener
		button.setActionCommand("alert");

		downbtn.addActionListener(this);
		downbtn.setActionCommand("downLoad");

		// ��ư�� ��ο� �߰�
		panel.add(button);
		panel.add(downbtn);
		// ����� �������� ����(����) �� ��ġ
		add(panel, BorderLayout.NORTH);

		// setBounds(x, y, width, height)
		setBounds(100, 100, 500, 500);
		// x �� ������ â�� �ݾ����� ���μ����� ���� �ǵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ ��ü�� ȭ�鿡 ���̵���
		setVisible(true);
	}

	// ���� �޼ҵ�
	public static void main(String[] args) {
		new MyFrame2();
	}

	@Override // implements ActionListener
	public void actionPerformed(ActionEvent e) {
		// ������ ��ư�� action command �� �о�´�.
		String commend = e.getActionCommand();
		if (commend.equals("alert")) {
			JOptionPane.showMessageDialog(this, "�˸�");
		} else if (commend.equals("downLoad")) {
			// �ð��� �����ɸ��ų� ��Ȯ���� �۾��� �Ҷ���
			// ���ο� �����忡�� �۾��Ѵ�.
			new Thread() { // �ʿ��Ҷ����� new start
				public void run() {
					System.out.println("�ٿ�ε���....");
					try {
						// �ٿ�ε� �ϴµ� 10�� �ɸ��ٰ� ����
						Thread.sleep(10000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					System.out.println("�ٿ�ε� �Ϸ�...");
				}
			}.start();
		}
	}
}
