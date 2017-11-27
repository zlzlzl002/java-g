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
 *  MyFrame4 객체는
 *  Component type 도 되고
 *  JFrame type 도 되고
 *  AcitonListener type 도 된다.
 */												// Component
public class MyFrame8 extends JFrame implements ActionListener{
	// JTextField 객체의 참조값을 저장할 필드 선언
	JTextField inputNum1, inputNum2, result, result2, inputNum4, inputNum3;
	
	//생성자 
	public MyFrame8() {
		initUI();
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//페널 객체 생성
		JPanel panel=new JPanel();
		// 문자열을 입력 받을수 있는 JTextField 객체
		inputNum1=new JTextField(10);
		inputNum2=new JTextField(10);
		inputNum3=new JTextField(10);
		inputNum4=new JTextField(10);
		// 결과를 출력할 TextField
		result = new JTextField(10);
		result2 = new JTextField(10);
		JButton sendBtn2=new JButton("-");
		JButton sendBtn=new JButton("+");
		sendBtn2.addActionListener(this);
		sendBtn.addActionListener(this);

		
		JLabel equalLabel=new JLabel("=");
		JLabel equalLabel2=new JLabel("=");
	
		
		// 페널에 UI 추가 추가한 순서대로 나열함
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




	
		
		
		
		//페널을 프레임의 위쪽(북쪽) 에 배치
		add(panel, BorderLayout.NORTH);
		
		// setBounds(x, y, width, height)
		setBounds(100, 100, 1000, 500);
		// x 를 눌러서 창을 닫았을때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임 객체가 화면에 보이도록 
		setVisible(true);
	}
	//메인 메소드 
	public static void main(String[] args) {
		new MyFrame8();
	}
	// 버튼을 누르면 실행되는 메소드
	@Override // ActionListener interface 정의된 메소드
	public void actionPerformed(ActionEvent e) {
		// 입력한 문자열을 숫자로 바꿔서 읽어오기
		double num1=Double.parseDouble(inputNum1.getText());
		double num2=Double.parseDouble(inputNum2.getText());
		// 두수의 하을 구한다
		double result=num1-num2;
		// 두수 빼기
		
		//출력하기
		this.result.setText(Double.toString(result));
	}
	public void actionPerformed1(ActionEvent a) {
		double num3=Double.parseDouble(inputNum1.getText());
		double num4=Double.parseDouble(inputNum1.getText());
		
		// 두수 빼기
		double result2=num3+num4;
		this.result2.setText(Double.toString(result2));
	}
}






