package c.zw.thread;
/**
 * 11.2.1 ͨ���̳�Thread��ʵ�ֶ��߳�
 * @author Administrator
 *
 */

public class testThread extends Thread{//�Զ�����̳�Thread��
	//run()���������߳���
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName()+":"+i);//getName()���������߳�����
		}
	}
	
	public static void main(String[] args) {
		testThread thread1 = new testThread();//�����̶߳���
		thread1.start();//�����߳�
		testThread thread2 = new testThread();
		thread2.start();
		
	}

}
