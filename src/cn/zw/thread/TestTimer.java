package cn.zw.thread;

import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 11.7 ����ʱ����
 * @author Administrator
 *
 */

public class TestTimer {
	public static void main(String[] args) {
		Timer t1 = new Timer();//���嶨ʱ��
		MyTask task1 = new MyTask();//��������
//		t1.schedule(task1, 3000);//3���ִ������
//		t1.schedule(task1,5000,1000);//5���Ժ�ÿ��1��ִ��һ�Σ�
        GregorianCalendar calendar1 = new GregorianCalendar(2010,0,5,14,36,57); 
        t1.schedule(task1,calendar1.getTime()); //ָ��ʱ�䶨ʱִ�У� 
		
	}
}
class MyTask extends TimerTask{//�Զ����̼̳߳�TimerTask��
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("����1��"+i);
		}
	}
	
}
