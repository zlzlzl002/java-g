package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/*
 *  MyFrame4 ��ü��
 *  Component type �� �ǰ�
 *  JFrame type �� �ǰ�
 *  AcitonListener type �� �ȴ�.
 */												// Component
public class MyFrame7 extends JFrame implements ActionListener{
	// JTextField ��ü�� �������� ������ �ʵ� ����
	JTextField textField, textField2;
	
	//������ 
	public MyFrame7() {
		initUI();
	}
	//�ʱ�ȭ �޼ҵ�
	public void initUI() {
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		//��� ��ü ����
		JPanel panel=new JPanel();
		// ���ڿ��� �Է� ������ �ִ� JTextField ��ü
		textField=new JTextField(10);
		textField2=new JTextField(10);
		JButton sendBtn=new JButton("����");
		sendBtn.addActionListener(this);
		
		// ��ο� UI �߰�
		panel.add(textField);
		panel.add(sendBtn);
		panel.add(textField2);
		
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
		new MyFrame7();
	}
	// ��ư�� ������ ����Ǵ� �޼ҵ�
	@Override // ActionListener interface ���ǵ� �޼ҵ�
	public void actionPerformed(ActionEvent e) {
		// ù��° JTextField �� �Է��� ���ڿ� �о����
		String msg=textField.getText();
		// �ι�° JTextField �� �־��ش�
		textField2.setText(msg);
		// ù��° JTextField �� ���� ����
		textField.setText("");
	}
}






