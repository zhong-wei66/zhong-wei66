package cn.zw.thread;
/**
 * 11.2.2 ͨ��Runnable�ӿ�ʵ�ֶ��߳�
 * @author Administrator
 *
 */
public class TestThread2 implements Runnable {//�Զ�����ʵ��Runnable�ӿ�

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	
	public static void main(String[] args) {
		//�����̶߳��󣬰�ʵ��Runnable�ӿڵĶ�����Ϊ��������
		Thread thread1 = new Thread(new TestThread2());
		thread1.start();//�����߳�
		
		Thread thread2 = new Thread(new TestThread2());
		thread2.start();
		
		
	}
}
