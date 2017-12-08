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
 *  GUI �߾Ⱦ�
 */
public class EmpFrame extends JFrame implements ActionListener {
	// �ɹ��ʵ� �����ϱ�
	JTextField inputEmpno, inputEname, inputDname, inputLoc;
	JButton saveBtn, deleteBtn, updateBtn;
	// ���̺� ��
	DefaultTableModel model;
	// ���̺��� �������� ������ �ʵ�
	JTable table;

	// ������
	public EmpFrame() {
		initUI();
	}

	// UI �ʱ�ȭ �۾� �޼ҵ�
	public void initUI() {
		// ���̾ƿ� ����
		setLayout(new BorderLayout());
		// ��� ��� ��ü ����
		JPanel topPanel = new JPanel();

		// ���̺� ��ü ����
		JLabel label1 = new JLabel("�����ȣ");
		JLabel label2 = new JLabel("����̸�");
		JLabel label3 = new JLabel("�μ���");
		JLabel label4 = new JLabel("�μ� ��ġ");
		// �ؽ�Ʈ �ʵ� ��ü ����
		inputEmpno = new JTextField(10);
		inputEname= new JTextField(10);
		inputDname = new JTextField(10);
		inputLoc = new JTextField(10);
		
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
		inputEmpno.setEditable(false);

		// ��ο� ������Ʈ �߰� �ϱ�
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

		// �������� ��ܿ� ��� ��ġ�ϱ�
		add(topPanel, BorderLayout.NORTH);

		// ���̺� Į�� ���� String[] �� ��´�.
		String[] colNames = { "�����ȣ", "����̸�", "�μ��̸�", "�μ���ġ"};
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
		new EmpFrame();

	}


		

	// DB �� �ִ� ȸ�� ������ JTable �� ����ϴ� �޼ҵ�
	public void displayMember() {
		// ȸ�� ������ �о�´�.
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> list = dao.getList();
		// ���̺��� ������ �����
		model.setRowCount(0);
		// �ٽ� ���
		for (MemberDto tmp : list) {// �ݺ��� ���鼭
			// row ������ ����
			Object[] rowData = { tmp.getEmpno(), tmp.getEname(), tmp.getDanme(), tmp.getLoc()};
			model.addRow(rowData);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
