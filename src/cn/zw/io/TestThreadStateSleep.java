package cn.zw.io;
/**
 * 11.3.3 ��ͣ�߳�ִ��sleep/yield
 *  sleep()�������������������е��߳̽�������״̬��ֱ������ʱ�����ˣ��������״̬
 *  ����ʱ���������ӳ٣�����sleep(2000)��������
 * @author Administrator
 *
 */

public class TestThreadStateSleep {
	public static void main(String[] args) {
		stateThread thread1 = new stateThread();
		thread1.start();
		
		stateThread thread2 = new stateThread();
		thread2.start();
		

	}
}	
	
	//ʹ�ü̳з�ʽʵ�ֶ�̳�
class stateThread extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName()+":"+i);//getName()���������߳�����
			try {
				Thread.sleep(2000);//�����̵߳�sleep()����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}


