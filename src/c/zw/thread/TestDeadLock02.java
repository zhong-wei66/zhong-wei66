package c.zw.thread;
/**
 * 11.5.3 �������������
 * ��ʾ��11-12����������Ľ��
 * @author Administrator
 *
 */

class Lipstick02{
	//�ں���
}
class Mirror02{
	//������
}

class Makeup02 extends Thread{//��ױ��̳���Thread��
	int flag;
	String girl;
	static Lipstick02 lipstick = new Lipstick02();
	static Mirror02 mirror = new Mirror02();
	
	@Override
		public void run() {
			doMakeup();
		}
	
	void doMakeup() {
		if (flag == 0) {
			synchronized (lipstick) {//��Ҫ�õ��ں����
				System.out.println(girl+"���ſں죡");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			//��40-42��д��synchronized (lipstick) �ͻ��������
			synchronized (mirror) {//��Ҫ�õ����ӵ���
				System.out.println(girl+"���ž��ӣ�");
			}
		}else {
			synchronized (mirror) {
				System.out.println(girl+"���ž��ӣ�");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lipstick) {
					System.out.println(girl+"���ſں죡");
				}
			}
		}
	}
	
}

public class TestDeadLock02 {
	public static void main(String[] args) {
		Makeup02 m1 = new Makeup02();//��Ѿ�Ļ�ױ�߳�
		m1.girl = "��Ѿ";
		m1.flag = 0;
		Makeup02 m2 = new Makeup02();//��Ѿ�Ļ�ױ�߳�
		m2.girl = "��Ѿ";
		m2.flag = 1;
		m1.start();
		m2.start();
		
	}
}
