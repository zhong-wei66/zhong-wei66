package cn.zw.game02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏主窗口
 * @author Administrator
 *
 */

public class MyGameFrame extends JFrame{
	//此行报错
	Image ball = GameUtil.getImage("images/ball.png");
	
	//paint方法做窗口绘制，可以在窗口上画东西
	@Override
	public void paint(Graphics g) {//自动被调，g相当于一支画笔
		super.paint(g);
//		Color c = g.getColor();
		Font f=g.getFont();
		
		g.setColor(Color.blue);//设置颜色
		g.drawLine(100, 100, 300, 300);//画线
		g.drawRect(100, 100,300 , 300);//画矩形
		g.drawOval(100, 100, 300, 300);//画圆
		g.fillRect(100, 100, 40, 40);//矩形填充
		g.setColor(Color.red);
		g.setFont(new Font("宋体",Font.BOLD,50));//设置字体
		g.drawString("我是谁", 200, 200);
		
		g.drawImage(ball, 250, 250, null);
		
//		g.setClip(c);
		g.setFont(f);
		
	}
	
	/**
	 * 初始化窗口
	 */
	public void lauanchFrame() {
		this.setTitle("钟微作品");
		this.setVisible(true);
		this.setSize(500,500);//设置大小
		this.setLocation(300,300);//设置位置
		this.addWindowListener(new WindowAdapter() {
			
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
		});
		
	}
	//main方法开始执行
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.lauanchFrame();
	}

}
