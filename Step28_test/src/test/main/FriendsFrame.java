package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.FriendsDao;
import test.dto.FriendsDto;

/*
 *  GUI �߾Ⱦ�
 */
public class FriendsFrame extends JFrame implements ActionListener {
	// �ɹ��ʵ� �����ϱ�
	JTextField inputNum, inputName, inputPhone, inputRegdate;
	JButton saveBtn, deleteBtn, updateBtn;
	// ���̺� ��
	DefaultTableModel model;
	// ���̺��� �������� ������ �ʵ�
	JTable table;

	// ������
	public FriendsFrame() {
		initUI();
	}

	// UI �ʱ�ȭ �۾� �޼ҵ�
	public void initUI() {
		// ���̾ƿ� ����
		setLayout(new BorderLayout());
		// ��� ��� ��ü ����
		JPanel topPanel = new JPanel();

		// ���̺� ��ü ����
		JLabel label1 = new JLabel("��ȣ");
		JLabel label2 = new JLabel("�̸�");
		JLabel label3 = new JLabel("����ȣ");
		JLabel label4 = new JLabel("��¥");

		// �ؽ�Ʈ �ʵ� ��ü ����
		inputNum = new JTextField(10);
		inputName = new JTextField(10);
		inputPhone = new JTextField(10);
		inputRegdate = new JTextField(10);
		
		saveBtn = new JButton("����");
		deleteBtn = new JButton("����");
		updateBtn = new JButton("����");

		// ��ư�� ActionListener ���
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		// ��ư�� action command ���
		saveBtn.setActionCommand("save");
		deleteBtn.setActionCommand("delete");
		updateBtn.setActionCommand("update");

		// ��ȣ�� �Է��̳� ������ �Ҽ� ������ �����Ѵ�.
		inputNum.setEditable(false);

		// ��ο� ������Ʈ �߰� �ϱ�
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

		// �������� ��ܿ� ��� ��ġ�ϱ�
		add(topPanel, BorderLayout.NORTH);

		// ���̺� Į�� ���� String[] �� ��´�.
		String[] colNames = { "��ȣ", "�̸�", "����ȣ", "��¥" };
		// �⺻ ���̺� �� ��ü ����
		// model.setColumnIdentifiers(colNames);
		model = new DefaultTableModel(colNames, 0); // ������������ �ʵ忡 ��
		// JTable ��ü ����
		table = new JTable(); // table �ɹ��ʵ�
		// ���̺� �� ����
		table.setModel(model);

		// ��ũ�� ������ �г� ��ü
		JScrollPane sPane1 = new JScrollPane(table);
		// �г��� �������� ����� ��ġ
		add(sPane1, BorderLayout.CENTER);

		// �������� ��ġ�� ũ�� ����
		setBounds(200, 200, 800, 500);
		// ���̵��� ����
		setVisible(true);
		// �������� �ݾ����� ���μ����� ������ ����ǵ��� ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// ȸ�� ���� ���
		displayMember();
	}

	// ���� �޼ҵ�
	public static void main(String[] args) {
		new FriendsFrame();

	}

	// ActionListener �������̽� ������ ������ �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent ae) {
		// �̺�Ʈ�� �Ͼ ��ư�� action command �� �о�´�.
		String command = ae.getActionCommand();
		if (command.equals("save")) {
			// �Է��� �̸��� �ּ� �о����
			String name = inputName.getText();
			String phone = inputPhone.getText();
			// MemberDto �� ��´�
			FriendsDto dto = new FriendsDto();
			dto.setName(name); // ��´� set
			dto.setPhone(phone);

			// MemberDao �̿��ؼ� ����
			FriendsDao dao = FriendsDao.getInstance();
			boolean isSuccess = dao.insert(dto);
			if (isSuccess) {
				JOptionPane.showMessageDialog(this, "���� �߾�");
			} else {
				JOptionPane.showMessageDialog(this, "����");
			}

		} else if (command.equals("delete")) { // ���� ��ư�� ��������
			// ��, �ƴϿ�, ��� �߿� � ��ư�� �������� ������
			// int type ���� ���ϵȴ�.
			int result = JOptionPane.showConfirmDialog(this, "������?");
			// ���࿡ �� ��ư�� ������ �ʾҴٸ�
			if (result != JOptionPane.YES_OPTION) { // ������ 0
				return; // �޼ҵ�����
			}
			// ���õ� row �� �ε����� �о�´�.
			int selectedIndex = table.getSelectedRow();
			if (selectedIndex == -1) {
				JOptionPane.showMessageDialog(this, "������ ROW ����");
				return; // �޼ҵ�����
			}
			// ������ row �� �ִ� ȸ�� ��ȣ�� �о�´�. obj type ���� �޴µ� int type���� casting �Ѵ�
			int num = (int) table.getValueAt(selectedIndex, 0);
			// DB ���� ȸ�������� �����Ѵ�.
			FriendsDao dao = FriendsDao.getInstance();
			dao.delete(num);
		} else if (command.equals("update")) {
			// ���õ� row �� �ε����� �о�´�.
			int selectedIndex = table.getSelectedRow();
			if (selectedIndex == -1) {
				JOptionPane.showMessageDialog(this, "������ ROW ����");
				return; // �޼ҵ�����
			}
			// ������ ȸ�������� �о�ͼ�
			int num=(int)table.getValueAt(selectedIndex,0);
			String name=(String)table.getValueAt(selectedIndex,1);
			String phone=(String)table.getValueAt(selectedIndex, 2);
			String regdate=(String)table.getValueAt(selectedIndex, 3);
			// MemberDto ��ü�� ���
			FriendsDto dto = new FriendsDto(num,name,phone,regdate);
			// DB�� ���� �ݿ��ϴ�.
			FriendsDao.getInstance().update(dto);
			JOptionPane.showMessageDialog(this, "���� �Ͽ����ϴ�.");
		}
		// ȸ�� ���� �ٽ� ���
		displayMember();
	}// actionPerFormed;

	// DB �� �ִ� ȸ�� ������ JTable �� ����ϴ� �޼ҵ�
	public void displayMember() {
		// ȸ�� ������ �о�´�.
		FriendsDao dao = FriendsDao.getInstance();
		List<FriendsDto> list = dao.getList();
		// ���̺��� ������ �����
		model.setRowCount(0);
		// �ٽ� ���
		for (FriendsDto tmp : list) {// �ݺ��� ���鼭
			// row ������ ����
			Object[] rowData = { tmp.getNum(), tmp.getName(), tmp.getPhone(), tmp.getRegdate() };
			model.addRow(rowData);
		}
	}
}
