package day0307;

import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseLocation extends JFrame{
	private JLabel lt = new JLabel();
	private JLabel lx = new JLabel();
	private JLabel ly = new JLabel();
	
	public MouseLocation(String name){
		super();
		lt.setText(name);
		Timer timer = new Timer();  //定时器
		
	    timer.schedule(new TimerTask() {
	        @Override
	        public void run() {
	          Point point = MouseInfo.getPointerInfo().getLocation();
	          lx.setText("x:" + point.x);
	          ly.setText("y:" + point.y);
	        }
	      }, 100, 100);
	   
	    this.setLayout(new FlowLayout(100));
	    
	    this.add(lt);
	    this.add(lx);
	    this.add(ly);
		this.setSize(155, 80);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		MouseLocation ml = new MouseLocation("鼠标坐标");
	}

}
