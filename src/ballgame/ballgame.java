package ballgame;

import java.awt.*;
import javax.swing.*;

public class ballgame extends JFrame{
	
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;//小球的横坐标
	double y=100;//小球的纵坐标
	boolean right=true;//方向
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次");
		
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		if(right) {
			
			x=x+10;
		}else {
			x=x-10;
		}
		
		if(x>1200-100-100) {//球直径100//桌子边框100
			right=false;
		}
		if(x<0+100) {
			right=true;
		}
	}
	
	//窗口加载
	void launchFrame() {
		setSize(1200,700);
		setLocation(50,50);
		setVisible(true);
	
	
  //重画窗口
	 while (true) {
		 repaint();
     try {
	 Thread.sleep(40);//毫秒，1秒=1000毫秒，40毫秒，1秒画25次
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
