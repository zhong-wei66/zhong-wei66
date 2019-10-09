package cn.zw.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏主窗口
 * @author Administrator
 *
 */

public class MyGameFrame extends JFrame{
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
