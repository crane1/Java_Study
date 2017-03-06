package day0306;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class ChatRoom extends JFrame{
	private JLabel lbName = new JLabel();
	private JTextArea txaOutContent = new JTextArea();
	private JTextField txaInContent = new JTextField();
	private JButton btnSend = new JButton("����");
	private JButton btnReset = new JButton("ȡ��");
	
	public ChatRoom(){
		super();
		initChatRoom();
	}

	private void initChatRoom() {
		this.setTitle("������");
		this.setLayout(new BorderLayout(0,10));
		
		lbName.setText("������");
		lbName.setIcon(new ImageIcon("src//boy.jpg"));
		lbName.setOpaque(true);//�������JLabel��͸����ֻ������Ϊ��͸�������ñ���ɫ����Ч  
		lbName.setBackground(Color.GREEN);
		lbName.setPreferredSize(new Dimension(400, 75));
		
		JPanel outBg = new JPanel(){
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(new ImageIcon("src//bg.png").getImage(), 0, 0, this);
			}
		};
		outBg.setPreferredSize(new Dimension(400, 300));
		outBg.add(txaOutContent);
		txaOutContent.setText("");
		txaOutContent.setOpaque(false);
		txaOutContent.setPreferredSize(new Dimension(400, 300));
		txaOutContent.setLineWrap(true);        //�����Զ����й��� 
		txaOutContent.setWrapStyleWord(true);            // ������в����ֹ���
		
		txaInContent.setText("");
		txaInContent.setPreferredSize(new Dimension(400, 30));
		
		this.add("North", lbName);
		
		JPanel center = new JPanel();
		center.setLayout(new BorderLayout(0,10));
		center.add("North",outBg);
		center.add("Center",txaInContent);
		this.add("Center", center);
		
		JPanel bottom = new JPanel();
		bottom.add(btnSend);
		bottom.add(btnReset);
		
		this.add("South", bottom);
		
		
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
	
	public static void main(String[] args) {
		ChatRoom cr = new ChatRoom();
	}
	
}
