package day0307;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class QQLogin extends JFrame{
	private JLabel lbTop = new JLabel();
	private JLabel lbCLeft = new JLabel();
	private JComboBox<String> id = new JComboBox<String>();
	private JPasswordField  pwd = new JPasswordField();
	private JCheckBox cbJZMM = new JCheckBox("��ס����");
	private JCheckBox cbZDDL = new JCheckBox("�Զ���¼");
	private JButton btnLogin = new JButton("��¼");
	private JButton btnSign = new JButton("ע���˺�");
	private JButton btnPwd = new JButton("�һ�����");
	
	public QQLogin(){
		this.setTitle("QQ��¼");
		Container con = this.getContentPane();
		con.setBackground(Color.white);
		lbTop.setIcon(new ImageIcon("src/bg1.png"));
		lbTop.setSize(100,200);
		con.add("North",lbTop);
		
		JPanel pCenter = new JPanel();
		pCenter.setBackground(Color.white);
		
		lbCLeft.setIcon(new ImageIcon("src/boy.jpg"));
		
		pCenter.add(lbCLeft);
		
		JPanel pCCenter = new JPanel();
		pCCenter.setLayout(new GridLayout(3,2,20,10));
		
		pCCenter.setBackground(Color.white);
		
		id.addItem("820169813");
		id.addItem("dfsfsdfs");
		id.setEditable(true);
		id.setBackground(Color.white);
		pCCenter.add(id);
		pCCenter.add(btnSign);
		
		pCCenter.add(pwd);
		pCCenter.add(btnPwd);
		
		pCCenter.add(cbJZMM);
		cbJZMM.setBackground(Color.white);
		pCCenter.add(cbZDDL);
		cbZDDL.setBackground(Color.white);
		
//		pCCenter.add(btnLogin);
		pCenter.add(pCCenter);
		
		con.add("Center", pCenter);
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.white);
		bottom.add(btnLogin);
		con.add("South",bottom);
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!id.getSelectedItem().equals("")){
					if(!pwd.getText().equals("")){
						JOptionPane.showMessageDialog(null, "��¼�ɹ�");
					}else{
						JOptionPane.showMessageDialog(null, "���벻��Ϊ��");
					}
						
				}else{
					JOptionPane.showMessageDialog(null, "id����Ϊ��");
				}
			}
		});
		
		this.setSize(500, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		QQLogin qq = new QQLogin();
	}
}
