package cn.zw.io;
/**
 * 11.3.3 ��ͣ�߳�ִ��sleep/yield
 * yield()�������������������е��߳�ֱ�ӽ������״̬���ó�CPU��ʹ��Ȩ��
 * ����ʱû���ӳ�
 * @author Administrator
 *
 */

public class TestThreadStateYield {
	public static void main(String[] args) {
		ThreadYield thread1 = new ThreadYield();
		thread1.start();
		
		ThreadYield thread2 = new ThreadYield();
		thread2.start();
		
		
	}
}

//ʹ�ü̳з�ʽʵ�ֶ��߳�
class ThreadYield extends Thread {
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName()+":"+i);
			Thread.yield();//�����̵߳�yield()����
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
