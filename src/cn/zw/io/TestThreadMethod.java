package cn.zw.io;

import org.omg.PortableInterceptor.TRANSPORT_RETRY;

/**
 * 11.4.1 ��ȡ�̻߳�����Ϣ�ĳ��÷���
 * isAlive()://�ж��Ƿ�������
 *currentThread():��ȡ��ǰ֤�����е��̶߳���
 *getName()��ȡ�õ�ǰ�̵߳�����
 *setName():���߳�һ������
 *getPriority():��ȡ�̵߳����ȼ���
 *setPriority():�����̵߳����ȼ���
 */

public class TestThreadMethod {
	public static void main(String[] args) {
		Runnable r = new MyThread();
		Thread t = new Thread(r,"Name test");//�����̶߳��󣬲��������
		t.start();//�����߳�
		System.out.println("name is:"+t.getName());//����߳�����
//		Thread.currentThread().sleep(5000);//��ͣ�߳�,sleep()��������쳣��������ᱨ��
		System.out.println(t.isAlive());//�ж��Ƿ�������
		System.out.println("over!");
	}

}

class MyThread implements Runnable {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.currentThread().sleep(5000);//��ͣ�߳�
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
