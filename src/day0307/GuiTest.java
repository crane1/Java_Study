package day0307;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GuiTest extends JFrame{
	JRadioButton btnA = new JRadioButton("A.《红楼梦》");
	JRadioButton btnB = new JRadioButton("B.《西游记》");
	JRadioButton btnC = new JRadioButton("C.《三国演义》");
	JRadioButton btnD = new JRadioButton("D.《水浒传》");
	ButtonGroup group = new ButtonGroup();
	JButton btnSub = new JButton("提交");
	JLabel lbtop = new JLabel("我国四大名著成书于清朝的是？");
	JLabel lbbottom = new JLabel("        ");
	
	public GuiTest(){
		group.add(btnA);
		group.add(btnB);
		group.add(btnC);
		group.add(btnD);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		panel.add(btnA);
		panel.add(btnB);
		panel.add(btnC);
		panel.add(btnD);
		
		btnSub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() != btnSub){
					return;
				}
				if (btnA.isSelected()){
					lbbottom.setText("回答正确！");
				}else{
					lbbottom.setText("回答错误！");
				}
			}
		});
		
		
		JPanel panel_bottom = new JPanel();
		panel_bottom.add(btnSub);
		panel_bottom.add(lbbottom);
		
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", lbtop);
		con.add("Center",panel);
		con.add("South", panel_bottom);
		
		this.setResizable(false);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		GuiTest gt = new GuiTest();
	}
}
