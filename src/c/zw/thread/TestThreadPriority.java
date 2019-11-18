package c.zw.thread;
/**
 * 11.4.2 �̵߳����ȼ�
 *getPriority():��ȡ�̵߳����ȼ���
 *setPriority():�����̵߳����ȼ���
 *�̵߳����ȼ������ֱ�ʾ����Χ��1��10
 *���ȼ���ֻ����ζ�Ż�õ��ȵĸ��ʵ͡������Ǿ����ȵ������ȼ��ߵ��̺߳�������ȼ��͵��̡߳�
 * @author Administrator
 *
 */

public class TestThreadPriority {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyPriority(),"t1");
		Thread t2 = new Thread(new MyPriority(),"t2");
		t1.setPriority(1);//�̵߳����ȼ������ֱ�ʾ����Χ��1��10
		t2.setPriority(10);//���ȼ���ֻ����ζ�Ż�õ��ȵĸ��ʵ͡������Ǿ����ȵ������ȼ��ߵ��̺߳�������ȼ��͵��̡߳�
		t1.start();
		t2.start();
	}
}

class MyPriority extends Thread {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}