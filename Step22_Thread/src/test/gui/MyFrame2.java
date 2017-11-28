package test.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame implements ActionListener {

	// 생성자
	public MyFrame2() {
		initUI();
	}

	// 초기화 메소드
	public void initUI() {
		// 레이아웃 설정
		setLayout(new BorderLayout());
		// 페널 객체 생성
		JPanel panel = new JPanel();
		// 버튼 객체 생성
		JButton button = new JButton("알림띄우기");
		JButton downbtn = new JButton("다운로드");
		// 버튼에 ActionListener 등록하기
		button.addActionListener(this); // 필드명:listener
		button.setActionCommand("alert");

		downbtn.addActionListener(this);
		downbtn.setActionCommand("downLoad");

		// 버튼을 페널에 추가
		panel.add(button);
		panel.add(downbtn);
		// 페널을 프레임의 위쪽(북쪽) 에 배치
		add(panel, BorderLayout.NORTH);

		// setBounds(x, y, width, height)
		setBounds(100, 100, 500, 500);
		// x 를 눌러서 창을 닫았을때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임 객체가 화면에 보이도록
		setVisible(true);
	}

	// 메인 메소드
	public static void main(String[] args) {
		new MyFrame2();
	}

	@Override // implements ActionListener
	public void actionPerformed(ActionEvent e) {
		// 눌러진 버튼의 action command 를 읽어온다.
		String commend = e.getActionCommand();
		if (commend.equals("alert")) {
			JOptionPane.showMessageDialog(this, "알림");
		} else if (commend.equals("downLoad")) {
			// 시간이 오래걸리거나 불확실한 작업을 할때는
			// 새로운 스레드에서 작업한다.
			new Thread() { // 필요할때마다 new start
				public void run() {
					System.out.println("다운로드중....");
					try {
						// 다운로드 하는데 10초 걸린다고 가정
						Thread.sleep(10000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					System.out.println("다운로드 완료...");
				}
			}.start();
		}
	}
}
