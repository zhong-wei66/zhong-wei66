package cn.zw.game02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ������
 * @author Administrator
 *
 */

public class MyGameFrame extends JFrame{
	//���б���
	Image ball = GameUtil.getImage("images/ball.png");
	
	//paint���������ڻ��ƣ������ڴ����ϻ�����
	@Override
	public void paint(Graphics g) {//�Զ�������g�൱��һ֧����
		super.paint(g);
//		Color c = g.getColor();
		Font f=g.getFont();
		
		g.setColor(Color.blue);//������ɫ
		g.drawLine(100, 100, 300, 300);//����
		g.drawRect(100, 100,300 , 300);//������
		g.drawOval(100, 100, 300, 300);//��Բ
		g.fillRect(100, 100, 40, 40);//�������
		g.setColor(Color.red);
		g.setFont(new Font("����",Font.BOLD,50));//��������
		g.drawString("����˭", 200, 200);
		
		g.drawImage(ball, 250, 250, null);
		
//		g.setClip(c);
		g.setFont(f);
		
	}
	
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
