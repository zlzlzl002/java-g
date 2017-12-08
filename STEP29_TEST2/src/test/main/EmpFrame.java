package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

/*
 *  GUI 잘안씀
 */
public class EmpFrame extends JFrame implements ActionListener {
	// 맴버필드 정의하기
	JTextField inputEmpno, inputEname, inputDname, inputLoc;
	JButton saveBtn, deleteBtn, updateBtn;
	// 테이블 모델
	DefaultTableModel model;
	// 테이블의 참조값을 저장할 필드
	JTable table;

	// 생성자
	public EmpFrame() {
		initUI();
	}

	// UI 초기화 작업 메소드
	public void initUI() {
		// 레이아웃 설정
		setLayout(new BorderLayout());
		// 상단 페널 객체 생성
		JPanel topPanel = new JPanel();

		// 레이블 객체 생성
		JLabel label1 = new JLabel("사원번호");
		JLabel label2 = new JLabel("사원이름");
		JLabel label3 = new JLabel("부서명");
		JLabel label4 = new JLabel("부서 위치");
		// 텍스트 필드 객체 생성
		inputEmpno = new JTextField(10);
		inputEname= new JTextField(10);
		inputDname = new JTextField(10);
		inputLoc = new JTextField(10);
		
		saveBtn = new JButton("저장");
		deleteBtn = new JButton("삭제");
		updateBtn = new JButton("수정");

		// 버튼에 ActionListener 등록
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		// 버튼에 action command 등록
		saveBtn.setActionCommand("save");
		deleteBtn.setActionCommand("delete");
		updateBtn.setActionCommand("update");

		// 번호는 입력이나 수정을 할수 없도록 설정한다.
		inputEmpno.setEditable(false);

		// 페널에 컴포넌트 추가 하기
		topPanel.add(label1);
		topPanel.add(inputEmpno);
		topPanel.add(label2);
		topPanel.add(inputEname);
		topPanel.add(label3);
		topPanel.add(inputDname);
		topPanel.add(label4);
		topPanel.add(inputLoc);
		topPanel.add(saveBtn);
		topPanel.add(deleteBtn);
		topPanel.add(updateBtn);

		// 프레임의 상단에 페널 배치하기
		add(topPanel, BorderLayout.NORTH);

		// 테이블 칼럼 명을 String[] 에 담는다.
		String[] colNames = { "사원번호", "사원이름", "부서이름", "부서위치"};
		// 기본 테이블 모델 객체 생성
		// model.setColumnIdentifiers(colNames);
		model = new DefaultTableModel(colNames, 0); // 지역변수값이 필드에 들어감
		// JTable 객체 생성
		table = new JTable(); // table 맴버필드
		// 테이블에 모델 연결
		table.setModel(model);

		// 스크롤 가능한 패널 객체
		JScrollPane sPane1 = new JScrollPane(table);
		// 패널을 프레임의 가운데에 배치
		add(sPane1, BorderLayout.CENTER);

		// 프레임의 위치와 크기 설정
		setBounds(200, 200, 800, 500);
		// 보이도록 설정
		setVisible(true);
		// 프레임을 닫았을때 프로세스가 완전히 종료되도록 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 회원 정보 출력
		displayMember();
	}

	// 메인 메소드
	public static void main(String[] args) {
		new EmpFrame();

	}


		

	// DB 에 있는 회원 정보를 JTable 에 출력하는 메소드
	public void displayMember() {
		// 회원 정보를 읽어온다.
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> list = dao.getList();
		// 테이블의 내용을 지우고
		model.setRowCount(0);
		// 다시 출력
		for (MemberDto tmp : list) {// 반복문 돌면서
			// row 데이터 구성
			Object[] rowData = { tmp.getEmpno(), tmp.getEname(), tmp.getDanme(), tmp.getLoc()};
			model.addRow(rowData);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
