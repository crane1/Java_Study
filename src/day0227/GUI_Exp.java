package day0227;

import java.awt.Color;  
import java.awt.Graphics;  
  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
  
/** 
 * java Swing������ 
 * ʵ�ּ򵥵Ķ��� 
 *  
 * @author VisionDo 
 * 
 */  
public class GUI_Exp extends JFrame {  
  
    private static final int WIDTH = 650;//����Ŀ��  
    private static final int HEIGHT = 600;//����ĸ߶�  
      
      
    public static void main(String[] args) {  
        GUI_Exp ge = new GUI_Exp();  
        ge.ShowMoon();  
    }  
  
    private void ShowMoon(){  
        MyPanel panel = new MyPanel();//�õ�������  
        Thread t = new Thread(panel);//�������Ķ����߳�  
        t.start();  
        this.add(panel);//�������ص�Frame��������  
    }  
      
    public GUI_Exp(){  
        this.setSize(WIDTH, HEIGHT);//����GUI����Ŀ��  
        this.setTitle("��ҹ");//���ñ���  
        this.setResizable(false);//���ô��ڴ�С���ɸı�  
        this.setLocationRelativeTo(null);//���ô���λ�þ���  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ĭ�Ϲرղ���  
        this.setVisible(true);//���ô��ڿɼ�  
        }  
}  
  
/** 
 * ����� 
 * ���еĻ滭�������ڸ�����ʵ�� 
 *  
 * ʵ��Runnable�ӿ� 
 *  
 * @author VisionDo 
 * 
 */  
class MyPanel extends JPanel implements Runnable{  
  
    int x = 0;  
    int y = 0;  
    int r = 50;  
    @Override  
    public void paint(Graphics g) {  
        super.paint(g);  
        this.setBackground(Color.blue);//�趨������ɫ  
        g.setColor(Color.yellow);//���û�����ɫ  
        g.fillOval(x, y+50, 100, 100);//��һ��ʵ��Բ  
        g.setColor(Color.blue);//�����趨������ɫ  
        g.fillOval(x, y, 2*r, 2*r);//��ʵ��Բ  
    }  
      
    //�����������߳���ʵ��  
    @Override  
    public void run() {  
        while(true){//������λ��һֱ�����ƶ�  
            x++;  
            y++;  
            if(x >this.getWidth()){//ֱ�����ﴰ�ڱ߽�  
                x = 0;  
                y = 0;  
            }  
            try {  
                Thread.sleep(30);//��ͣ����  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
            repaint();//��������¿�ʼ  
        }  
          
    }  
}  
