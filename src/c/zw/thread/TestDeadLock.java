package c.zw.thread;
/**
 * 11.5.3 �������������
 * ��ʾ��11-11������������ʾ
 * @author Administrator
 *
 */

class Lipstick{
	//�ں���
}
class Mirror{
	//������
}

class Makeup extends Thread{//��ױ��̳���Thread��
	int flag;
	String girl;
	static Lipstick lipstick = new Lipstick();
	static Mirror mirror = new Mirror();
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
				
				synchronized (mirror) {//��Ҫ�õ����ӵ���
					System.out.println(girl+"���ž��ӣ�");
				}
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

public class TestDeadLock {
	public static void main(String[] args) {
		Makeup m1 = new Makeup();//��Ѿ�Ļ�ױ�߳�
		m1.girl = "��Ѿ";
		m1.flag = 0;
		Makeup m2 = new Makeup();//��Ѿ�Ļ�ױ�߳�
		m2.girl = "��Ѿ";
		m2.flag = 1;
		m1.start();
		m2.start();
		
	}
}
