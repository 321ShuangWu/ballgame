package ballgame;

import java.awt.*;
import javax.swing.*;

public class ballgame extends JFrame{
	
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;//С��ĺ�����
	double y=100;//С���������
	boolean right=true;//����
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��");
		
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		if(right) {
			
			x=x+10;
		}else {
			x=x-10;
		}
		
		if(x>1200-100-100) {//��ֱ��100//���ӱ߿�100
			right=false;
		}
		if(x<0+100) {
			right=true;
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
	  ballgame game = new ballgame();
	  game.launchFrame();
	  
  }
	
	
}
