package cn.zw.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ������
 * @author Administrator
 *
 */

public class MyGameFrame extends JFrame{
	/**
	 * ��ʼ������
	 */
	public void lauanchFrame() {
		this.setTitle("��΢��Ʒ");
		this.setVisible(true);
		this.setSize(500,500);//���ô�С
		this.setLocation(300,300);//����λ��
		this.addWindowListener(new WindowAdapter() {
			
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
		});
		
	}
	//main������ʼִ��
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.lauanchFrame();
	}

}
