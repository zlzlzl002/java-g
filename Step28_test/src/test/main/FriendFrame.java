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

import test.dao.FriendsDao;
import test.dto.FriendsDto;



/*
 *  GUI 잘안씀
 */
public class FriendFrame extends JFrame implements ActionListener {
	// 맴버필드 정의하기
	JTextField inputNum, inputName, inputPhone, inputRegdate;
	JButton saveBtn, deleteBtn, updateBtn;
	// 테이블 모델
	DefaultTableModel model;
	// 테이블의 참조값을 저장할 필드
	JTable table;
	
	// 생성자
	public FriendFrame() {
		initUI();
	}

	// UI 초기화 작업 메소드
	public void initUI() {
		// 레이아웃 설정
		setLayout(new BorderLayout());
		// 상단 페널 객체 생성
		JPanel topPanel = new JPanel();

		// 레이블 객체 생성
		JLabel label1 = new JLabel("번호");
		JLabel label2 = new JLabel("이름");
		JLabel label3 = new JLabel("핸드폰");
		JLabel label4 = new JLabel("날짜");

		// 텍스트 필드 객체 생성
		inputNum = new JTextField(10);
		inputName = new JTextField(10);
		inputPhone = new JTextField(10);
		inputRegdate = new JTextField(10);

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
		inputNum.setEditable(false);

		// 페널에 컴포넌트 추가 하기
		topPanel.add(label1);
		topPanel.add(inputNum);
		topPanel.add(label2);
		topPanel.add(inputName);
		topPanel.add(label3);
		topPanel.add(inputPhone);
		topPanel.add(label4);
		topPanel.add(inputRegdate);
		topPanel.add(saveBtn);
		topPanel.add(deleteBtn);
		topPanel.add(updateBtn);

		// 프레임의 상단에 페널 배치하기
		add(topPanel, BorderLayout.NORTH);

		// 테이블 칼럼 명을 String[] 에 담는다.
		String[] colNames = { "번호", "이름", "폰번호", "날짜" };
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
		new FriendFrame();

	}

	// ActionListener 인터페이스 때문에 구현한 메소드
	@Override
	public void actionPerformed(ActionEvent ae) {
		// 이벤트가 일어난 버튼의 action command 를 읽어온다.
		String command = ae.getActionCommand();
		if (command.equals("save")) {
			// 입력한 이름과 주소 읽어오기
			String name = inputName.getText();
			String phone = inputPhone.getText();
			String regdate = inputRegdate.getText();
			// MemberDto 에 담는다
			FriendsDto dto = new FriendsDto();
			dto.setName(name); // 담는다 set
			dto.setPhone(phone);
			dto.setRegdate(regdate);

			// MemberDao 이용해서 저장
			FriendsDao dao = FriendsDao.getInstance();
			boolean isSuccess = dao.insert(dto);
			if (isSuccess) {
				JOptionPane.showMessageDialog(this, "저장 했엉");
			} else {
				JOptionPane.showMessageDialog(this, "실패");
			}

		} else if (command.equals("delete")) { // 삭제 버튼을 눌렀을때
			// 예, 아니요, 취소 중에 어떤 버튼을 눌렀는지 정보가
			// int type 으로 리턴된다.
			int result = JOptionPane.showConfirmDialog(this, "삭제해?");
			// 만약에 예 버튼을 누르지 않았다면
			if (result != JOptionPane.YES_OPTION) { // 참조값 0
				return; // 메소드종료
			}
			// 선택된 row 의 인덱스를 읽어온다.
			int selectedIndex = table.getSelectedRow();
			if (selectedIndex == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 ROW 선택");
				return; // 메소드종료
			}
			// 삭제할 row 에 있는 회원 번호를 읽어온다. obj type 으로 받는데 int type으로 casting 한다
			int num = (int) table.getValueAt(selectedIndex, 0);
			// DB 에서 회원정보를 삭제한다.
			FriendsDao dao = FriendsDao.getInstance();
			dao.delete(num);
		} else if (command.equals("update")) {
			// 선택된 row 의 인덱스를 읽어온다.
			int selectedIndex = table.getSelectedRow();
			if (selectedIndex == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 ROW 선택");
				return; // 메소드종료
			}
			// 수정할 회원정보를 읽어와서
			int num=(int)table.getValueAt(selectedIndex,0);
			String name=(String)table.getValueAt(selectedIndex,1);
			String phone=(String)table.getValueAt(selectedIndex, 2);
			String regdate=(String)table.getValueAt(selectedIndex, 3);
			// MemberDto 객체에 담고
			FriendsDto dto = new FriendsDto(num,name,phone,regdate);
			// DB에 수정 반영하다.
			FriendsDao.getInstance().update(dto);
			JOptionPane.showMessageDialog(this, "수정 하였습니다.");
		}
		// 회원 정보 다시 출력
		displayMember();
	}// actionPerFormed;

	// DB 에 있는 회원 정보를 JTable 에 출력하는 메소드
	public void displayMember() {
		// 회원 정보를 읽어온다.
		FriendsDao dao = FriendsDao.getInstance();
		List<FriendsDto> list = dao.getList();
		// 테이블의 내용을 지우고
		model.setRowCount(0);
		// 다시 출력
		for (FriendsDto tmp : list) {// 반복문 돌면서
			// row 데이터 구성
			Object[] rowData = { tmp.getNum(), tmp.getName(), tmp.getPhone(), tmp.getRegdate() };
			model.addRow(rowData);
		}
	}
}
