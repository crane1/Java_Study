package day0224;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RetroSnaker {
	private JFrame jframe;
	private JButton start, pause;
	private MyPanel playArea;
	private JTextArea output;
	
	public RetroSnaker(){
		jframe = new JFrame();
		jframe.setTitle("̰����");
	}
	
	public void init(){
		Container contentPane = jframe.getContentPane();
		contentPane.setBackground(Color.green);
		contentPane.setLayout(new BorderLayout());
		
		playArea = new MyPanel();
		Thread t = new Thread(playArea);//�������Ķ����߳�  
        t.start();
        
		playArea.setBackground(Color.BLUE);
		start = new JButton("��ʼ");
		pause = new JButton("��ͣ");
		output = new JTextArea();
		
		start.addActionListener(new StartEvetListener());
		
		JPanel controlPanel = new JPanel();
		controlPanel.add(start);
		controlPanel.add(pause);
		
		contentPane.add("Center", playArea);
		contentPane.add("South", controlPanel);
		
		jframe.setSize(400, 300);
		jframe.setVisible(true);
		
	}
	public static void main(String[] args) {
		RetroSnaker snaker = new RetroSnaker();
		snaker.init();
	}
}

class MyPanel extends JPanel implements Runnable{
	final int SNAKER_LENGTH = 20;
    int x = 0;  
    int y = 0;  

    public MyPanel(){
    	this.setSize(400, 300);
    }
    @Override  
    public void paint(Graphics g) {  
        super.paint(g);  
        this.setBackground(Color.blue);//�趨������ɫ  
        g.setColor(Color.yellow);//���û�����ɫ  
        g.fillRect(x, y, SNAKER_LENGTH, SNAKER_LENGTH);//��һ��ʵ�ľ���
    }  
      
    //�����������߳���ʵ��  
    @Override  
    public void run() {
    	System.out.println("width=" + this.getWidth() + ",height=" + this.getHeight());
        while(true){
        	if ( (x + SNAKER_LENGTH * 2 < this.getWidth() ) && (y == 0) ){//ֱ�����ﴰ���ұ߽� 
        		move();
        		x += SNAKER_LENGTH;
        	}
        	
        	if ( (x + SNAKER_LENGTH * 2 >= this.getWidth() ) && (y + SNAKER_LENGTH * 2 < this.getHeight() ) ){//ֱ�����ﴰ���±߽�  
        		move();
        		y += SNAKER_LENGTH;  
            }
        	
            if( (x > 0) && (y + 20 > this.getHeight() - SNAKER_LENGTH) ){//ֱ�����ﴰ����߽�  
            	move();
                x -= SNAKER_LENGTH;  
            }
            
            if( (x == 0) && (y > 0) ){//ֱ�����ﴰ���ϱ߽�  
            	move();
                y -= SNAKER_LENGTH;  
            }
        }  
          
    }
    
    public void move(){
    	try {  
            Thread.sleep(300);//��ͣ����  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
        repaint();//��������¿�ʼ  
    }
}  
