package ballgame;
/**
 * 
 *���ڲ��Ժ�ע���÷�
 **/
import java.awt.*;
import javax.swing.*;

public class ballgame2 extends JFrame{
	
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;//С��ĺ�����
	double y=100;//С���������
	
	double degree = 3.14/3;//���ȣ�60��
	
	//�����ڵķ���
	public void paint(Graphics g) {
		
		System.out.println("���ڱ�����һ��");
		
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		
		if(y>700-80-100||y<100) {
			degree=-degree;
		}
		
		//�������ұ߽�
		if(x<0 +100|| x>1200-100-100) {
			degree = 3.14-degree;
			
		}
	}
	
	//���ڼ���
	void launchFrame() {
		setSize(1200,700);
		setLocation(50,50);
		setVisible(true);
	
	
  //�ػ�����
	 while (true) {
		 repaint();
     try {
	 Thread.sleep(40);//���룬1��=1000���룬40���룬1�뻭25��
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
	 }
	}
		
	 
		
  public static void main(String[] args) {
	  System.out.println("hello");
	  ballgame2 game = new ballgame2();
	  game.launchFrame();
	  
  }
	
	
}
