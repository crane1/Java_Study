package day0224;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RetroSnaker {
	private JFrame jframe;
	private JButton start, pause;
	private JPanel playArea;
	
	public RetroSnaker(){
		jframe = new JFrame();
		jframe.setTitle("Ì°³ÔÉß");
		jframe.setSize(300, 400);
		jframe.setVisible(true);
	}
	
	public void init(){
		Container contentPane = jframe.getContentPane();
		contentPane.setBackground(Color.green);
		contentPane.setLayout(new BorderLayout());
		
		playArea = new JPanel();
		start = new JButton("¿ªÊ¼");
		pause = new JButton("ÔÝÍ£");
		
		JPanel controlPanel = new JPanel();
		controlPanel.add(start);
		controlPanel.add(pause);
		
//		contentPane.add("North", playArea);
		contentPane.add("South", controlPanel);
		
	}
	public static void main(String[] args) {
		RetroSnaker snaker = new RetroSnaker();
		snaker.init();
	}
}
