package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class MyFrame8 extends JFrame implements ActionListener{
	// JTextField ��ü�� �������� ������ �ʵ� ����
	JTextField inputNum1, inputNum2, result, result2, inputNum4, inputNum3;
	
	//������ 
	public MyFrame8() {
		initUI();
	}
	//�ʱ�ȭ �޼ҵ�
	public void initUI() {
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		//��� ��ü ����
		JPanel panel=new JPanel();
		// ���ڿ��� �Է� ������ �ִ� JTextField ��ü
		inputNum1=new JTextField(10);
		inputNum2=new JTextField(10);
		inputNum3=new JTextField(10);
		inputNum4=new JTextField(10);
		// ����� ����� TextField
		result = new JTextField(10);
		result2 = new JTextField(10);
		JButton sendBtn2=new JButton("-");
		JButton sendBtn=new JButton("+");
		sendBtn2.addActionListener(this);
		sendBtn.addActionListener(this);

		
		JLabel equalLabel=new JLabel("=");
		JLabel equalLabel2=new JLabel("=");
	
		
		// ��ο� UI �߰� �߰��� ������� ������
		panel.add(inputNum1);
		panel.add(sendBtn2);
		panel.add(inputNum2);
		panel.add(equalLabel);
		panel.add(result);
		
		panel.add(inputNum3);
		panel.add(sendBtn);
		panel.add(inputNum4);
		panel.add(equalLabel2);
		panel.add(result2);




	
		
		
		
		//����� �������� ����(����) �� ��ġ
		add(panel, BorderLayout.NORTH);
		
		// setBounds(x, y, width, height)
		setBounds(100, 100, 1000, 500);
		// x �� ������ â�� �ݾ����� ���μ����� ���� �ǵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ ��ü�� ȭ�鿡 ���̵��� 
		setVisible(true);
	}
	//���� �޼ҵ� 
	public static void main(String[] args) {
		new MyFrame8();
	}
	// ��ư�� ������ ����Ǵ� �޼ҵ�
	@Override // ActionListener interface ���ǵ� �޼ҵ�
	public void actionPerformed(ActionEvent e) {
		// �Է��� ���ڿ��� ���ڷ� �ٲ㼭 �о����
		double num1=Double.parseDouble(inputNum1.getText());
		double num2=Double.parseDouble(inputNum2.getText());
		// �μ��� ���� ���Ѵ�
		double result=num1-num2;
		// �μ� ����
		
		//����ϱ�
		this.result.setText(Double.toString(result));
	}
	public void actionPerformed1(ActionEvent a) {
		double num3=Double.parseDouble(inputNum1.getText());
		double num4=Double.parseDouble(inputNum1.getText());
		
		// �μ� ����
		double result2=num3+num4;
		this.result2.setText(Double.toString(result2));
	}
}






