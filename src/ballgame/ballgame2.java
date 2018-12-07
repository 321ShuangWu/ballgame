package ballgame;
/**
 * 
 *用于测试和注释用法
 **/
import java.awt.*;
import javax.swing.*;

public class ballgame2 extends JFrame{
	
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;//小球的横坐标
	double y=100;//小球的纵坐标
	
	double degree = 3.14/3;//弧度，60度
	
	//画窗口的方法
	public void paint(Graphics g) {
		
		System.out.println("窗口被画了一次");
		
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		
		if(y>700-80-100||y<100) {
			degree=-degree;
		}
		
		//碰到左右边界
		if(x<0 +100|| x>1200-100-100) {
			degree = 3.14-degree;
			
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
	  ballgame2 game = new ballgame2();
	  game.launchFrame();
	  
  }
	
	
}
