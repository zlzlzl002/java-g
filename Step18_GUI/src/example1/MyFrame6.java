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
public class MyFrame6 extends JFrame implements ActionListener{
	// JTextField ��ü�� �������� ������ �ʵ� ����
	JTextField inputNum1, inputNum2, result;
	
	//������ 
	public MyFrame6() {
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
	
		// ����� ����� TextField
		result = new JTextField(10);
	
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JButton multiBtn=new JButton("*");
		JButton divideBtn=new JButton("/");
		// ��ư�� action command ���
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
		// ��ư�� ActionListener ��ü ���
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
	
		JLabel equalLabel=new JLabel("=");
		
		// ��ο� UI �߰� �߰��� ������� ������
		panel.add(inputNum1);
		panel.add(plusBtn);
		panel.add(minusBtn);
		panel.add(multiBtn);
		panel.add(divideBtn);
		panel.add(inputNum2);
		panel.add(equalLabel);
		panel.add(result);	
		
		//����� �������� ����(����) �� ��ġ
		add(panel, BorderLayout.NORTH);
		
		// setBounds(x, y, width, height)
		setBounds(100, 100, 800, 500);
		// x �� ������ â�� �ݾ����� ���μ����� ���� �ǵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ ��ü�� ȭ�鿡 ���̵��� 
		setVisible(true);
	}
	//���� �޼ҵ� 
	public static void main(String[] args) {
		new MyFrame6();
	}
	// ��ư�� ������ ����Ǵ� �޼ҵ�
	@Override // ActionListener interface ���ǵ� �޼ҵ�
	public void actionPerformed(ActionEvent e) {
		// �Է��� ���ڿ��� ���ڷ� �ٲ㼭 �о����
		double num1=Double.parseDouble(inputNum1.getText());
		double num2=Double.parseDouble(inputNum2.getText());
		
		// action command �о����
		String command=e.getActionCommand();
		
		// ��� ���� ���� ���� �����
		double result=0;
		
		if(command.equals("plus")) {
			result=num1+num2;
		}else if(command.equals("minus")) {
			result=num1-num2;
		}else if(command.equals("multi")) {
			result=num1*num2;
		}else if(command.equals("divide")) {
			result=num1/num2;
		}
		try {
			
		}catch(Exception a) {
			
		}
		//����ϱ�
		this.result.setText(Double.toString(result));
	}
}






